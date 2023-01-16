//imports
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.*;


//contains ball, paddle 1 and 2, collission, points
public class Game extends JPanel implements KeyListener
{

    Main main;

    Ball ball;
    // Creates a Ball
    Paddle paddle1;
    // Creates a paddle called paddle1
    Paddle paddle2;
    // Creates a paddle called paddle2
    Looks looks;

    //random y pposition of the ball
    int random;
    int upperbound = 300;
    int lowerbound = 100;



    int yValue; //x value
    int xValue; //y value

    boolean direction = true;
    boolean computerAI = false;
    boolean reset = false;

    int velocity = 1;


    boolean p1Point  = false; //Creates a boolean called player p1Point
    boolean p2Point  = false; // Creates a boolean called player p1Point
    public boolean player1Wins = false; // Creates a public boolean called player1Wins
    public boolean player2Wins = false; // Creates a public boolean called player2Wins


    public Game() // Constructor for game class
    {
        super();
        super.setFocusable(true);
        super.addKeyListener(this);
        ball = new Ball(340,220);
        //Creates a ball at 340, 220
        paddle1 = new Paddle(10,180);
        paddle2 = new Paddle(695,180);
        //Creates two paddles for player one and two/AI at 10, 180 and 695,180)
        //creates the score and border
        looks = new Looks();

    }


    public void paint(Graphics g)
    {
        g.clearRect(0, 0, getWidth(), getHeight());
        //Refreshes the rectange on the window so it doesn't show previous rectangles.
        ball.paint(g);
        // paints ball.
        paddle1.paint(g);
        // paints paddle1.
        paddle2.paint(g);
        // paints paddle2.
        looks.paint(g);
    }
    
    
    public void AI()
    {
        if (computerAI)
        {    
            if (ball.y > paddle2.y && ball.y > (paddle2.y + 79))
            {
                paddle2.y += 10;



            }
            if (ball.y < paddle2.y && ball.y < (paddle2.y + 79))
            {
                paddle2.y -= 10;


            }
            else
            {

            }
        }
    
    }

    public void moveP1Up() // method to move player one's paddle up.
    {
        if (paddle1.y != 0)// if it does not reach the frame it can move up.
        {
            paddle1.y-=10;
        }
        else//else then player 1 can't move up.
        {

        }
    }
    public void moveP2Up()// method to move player two's paddle down.
    {

        if (paddle2.y != 0) // if it does not reach the border of the frame then player 2 can move down.
        {
            paddle2.y-=10;
        }
        else //else then player two's can't move down.
        {

        }
    }
    public void moveP1Down()// method to move player 1 paddle down.
    {

        if (paddle1.y != 390)// if it doesn't reach the border it can move down.
        {
            paddle1.y+=10;
        }
        else//else then player 1 can't move down
        {
        }
    }
    public void moveP2Down()// method to move player twos paddle down
    {

        if (paddle2.y != 390) //if it doesn't reach the border it can move.
        {
            paddle2.y+=10;
        }
        else//else then player 2 can't move down
        {
        }
    }
    @Override
    public void keyPressed(KeyEvent key)
    {

        // paddle 1 movments
        if (key.getKeyCode() == KeyEvent.VK_S) //move down for player 1 if they press s
        {
            moveP1Down();
        }
        if (key.getKeyCode() == KeyEvent.VK_W)//move player 1 up if they press w
        {
            moveP1Up();
        }

        if (key.getKeyCode() == KeyEvent.VK_UP) // move player 2 up if they press thee up arrow
        {
            if (computerAI == false)
            {
                moveP2Up();
            }
        }
        if (key.getKeyCode() == KeyEvent.VK_DOWN) // move player 2 down if they press down arrow
        {
            if (computerAI == false)
            {
                moveP2Down();
            }
        } 
        

        repaint(); //repaint after new position for paddle
    }
    @Override
    public void keyReleased(KeyEvent key) //key released
    {

    }


    @Override
    public void keyTyped(KeyEvent arg0) //key typed
    {

    }

    public void FirstDirection() //decides the direction it moves at the start of each round
    {

        int randomInt;//initialize integer to hold random number

        Random rand = new Random(); // initialise random function in rand variable

        randomInt = rand.nextInt(3); // picks a number between 0 and 3

        if (randomInt == 0) // if it is 0 it goes down left
        {
            xValue = -1;
            yValue = -1;
        }

        else if (randomInt == 1) // if it is 1 then it goes right down
        {
            xValue = 1;
            yValue = -1;

        }

        else if (randomInt == 2)// if it is 2 then it goes left up
        {
            xValue = -1;
            yValue = 1;
        }


        else //else it is 3 then it goes right up
        {
            yValue = 1;
            xValue = 1;
            
        }
        
    }

    public void ballMovement()
    {


        // if (limitRandom == 1)
        // {
        //     direction =1;
        // }
        // if (limitRandom == 2)
        // {
        //     direction = -1;
        // }

        if (direction) // if boolean direction is true 
        {
            FirstDirection();//randomly makes x value negative or positive for random direction
            direction = false; // sets boolean to false so it doesn't repeat until round is over
        }


        //adds x and y value
        ball.x += xValue;
        ball.y += yValue;

        Ballbounce();
        Scorecount();
        // if (paddle1.x && paddle1.y).compareTo(ball.x && ball.y))


    }
    public void Ballbounce()// method to bounce the ball of objects
    {
        if ((ball.y + 10) >= 470) // if ball's y value is less than  430 it changes value of 'b' to -1
        {
            yValue /= -1;// Divides yValue by - 1 inversing the y value of the ball

        }

        else if ((ball.x + 14) >= paddle2.x && (ball.x + 14) <= (paddle2.x + 14) && ball.y > paddle2.y && ball.y < (paddle2.y + 79)) // if the ball hits player 2s ]paddle then ball bounces
        {
            xValue += velocity;//Multiplys the xValue(speed) by velocity
            //velocity += 0.1;// increases velocity by 0.1
            xValue /= -1;// Divides xValue by - 1 inversing the x value of the ball
        }


        else if (ball.y <= 5)// if ball's y value is less than  5 it changes value of 'b' to 1
        {
            yValue /= -1;// Divides xValue by - 1 inversing the y value of the ball
        }


        else if (ball.x >= paddle1.x && ball.x <= (paddle1.x + 14) && ball.y > paddle1.y && ball.y < (paddle1.y + 79))// if ball hits player 1 paddle then it bounces
        {
            if (yValue > 0)
            {
                yValue += velocity;
            }
            else
            {
                yValue -= velocity;
            }
            xValue -= velocity;//Multiplys the xValue(speed) by velocity
            //velocity += 0.1;// increases velocity by 0.1
            xValue /= -1;// Divides xValue by - 1 inversing the x value of the ball
        }

        else//else nothing happens
        {

        }

    }
    public void Scorecount()
    {
        if (ball.x >= 700)//if the ball x value greater or equal to the border(680)
        {
            //resets balls x and y speed values
            yValue = 1;
            xValue = 1;
            direction = true; // resets direction to true to run FirstDirection function
            
            p1Point = true;// player met condidion to get a point
            if(p1Point)
            {

                looks.points1++;
                //adds 1 point to the int points1
                System.out.println("p1Points: + 1");
                p1Point = false;



            }
            if(looks.points1 == 10)// if player 2 reaches 10 points player 2 wins
            {
                player1Wins = true;
            }
            else
            {


            }

            Random rand = new Random();

            random = rand.nextInt(upperbound-lowerbound) + lowerbound;
            /////////////////////////////////////

            //resets all the variables
            /////////////////////////////////////
            ball.x = 340;
            ball.y = random;
            //Creates a ball at 340, 220
            paddle1 = new Paddle(10,180);
            paddle2 = new Paddle(695,180);
            xValue = 1;
            yValue = 1;
            /////////////////////////////////////

        }

        else if (ball.x <= 0)// if ball x value is less than or equal to the border(5)
        {
            //resets balls x and y speed values
            yValue = 1;
            xValue = 1;
            direction = true;// resets direction to true to run FirstDirection function

            p2Point = true;// player met condidion to get a point
            if(p2Point)// if player
            {

                looks.points2++;
                //adds 1 point to the int points2
                System.out.println("p2Points: + 1");
                p2Point = false;



            }
            if(looks.points2 == 10)// if player 2 reaches 10 points player 2 wins
            {
                player2Wins = true;

            }
            else
            {

            }


            //gets random y position for the ball to start
            /////////////////////////////////////
            Random rand = new Random();

            random = rand.nextInt(upperbound-lowerbound) + lowerbound;
            /////////////////////////////////////

            //resets all the variables
            /////////////////////////////////////
            ball.x = 340;
            ball.y = random;
            //Creates a ball at 340, 220
            paddle1 = new Paddle(10,180);
            paddle2 = new Paddle(695,180);
            xValue = 1;
            yValue = 1;
            /////////////////////////////////////



        }
        else
        {

        }

        if (player1Wins) // if player 1 wins game 
        {

            //print player 1 wins and reset variables
            JOptionPane.showMessageDialog(null, "Player 1 Wins!");
            looks.points1 = 0;
            System.out.println("p1Points: Reset");
            looks.points2 = 0;
            System.out.println("p2Points: Reset");
            player1Wins = false;
            direction = true;
            computerAI = false;
            reset = true;
        }
        else if (player2Wins)//if player 2 wins game
        {
            //print player 2 wins and reset variables
            JOptionPane.showMessageDialog(null, "Player 2 Wins!");
            looks.points2 = 0;
            System.out.println("p1Points: Reset");
            looks.points1 = 0;
            System.out.println("p2Points: Reset");
            player2Wins = false;
            direction = true;
            computerAI = false;
            reset = true;
        }
        else // else nothing happens 
        {

        }



    }



    public void update() // repeats ballMovement and repaints it
    {
        ballMovement();
        repaint();
    }





}