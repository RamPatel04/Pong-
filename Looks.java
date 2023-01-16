import java.awt.Graphics;
import javax.swing.JPanel;


public class Looks extends JPanel
{

    int points1 = 0;//points for player 1
    int points2 = 0;//points for player 2
 
    public void paint(Graphics g)
    {
        //player score
        g.drawString("Player 1:", 20, 13);
        g.drawString("Player 2:", 600, 13);

        
        // Displays player1 current score
        if(points1 == 0)
        {
            g.drawString("0", 80, 13);


        }
        
        else if(points1 == 1)
        {
            g.drawString("1", 80, 13);
            

        }
        else if(points1 == 2)
        {
            g.drawString("2", 80, 13);


        }
        else if(points1 == 3)
        {
            g.drawString("3", 80, 13);


        }
        else if(points1 == 4)
        {
            g.drawString("4", 80, 13);


        }
        else if(points1 == 5)
        {
            g.drawString("5", 80, 13);


        }
        else if(points1 == 6)
        {
            g.drawString("6", 80, 13);


        }
        else if(points1 == 7)
        {
            g.drawString("7", 80, 13);


        }
        else if(points1 == 8)
        {
            g.drawString("8", 80, 13);


        }
        else if(points1 == 9)
        {
            g.drawString("9", 80, 13);


        }
        else if(points1 == 10)
        {
            g.drawString("10", 80, 13);
        
        }
        else
        {

        }

        //Displays player2 current s
        
        if(points2 == 0)
        {
            g.drawString("0", 660, 13);


        }

        if(points2 == 1)
        {
            g.drawString("1", 660, 13);

        }
        
        else if(points2 == 2)
        {
            g.drawString("2", 660, 13);


        }
        else if(points2 == 3)
        {
            g.drawString("3", 660, 13);


        }
        else if(points2 == 4)
        {
            g.drawString("4", 660, 13);


        }
        else if(points2 == 5)
        {
            g.drawString("5", 660, 13);


        }
        else if(points2 == 6)
        {
            g.drawString("6", 660, 13);


        }
        else if(points2 == 7)
        {
            g.drawString("7", 660, 13);


        }
        else if(points2 == 8)
        {
            g.drawString("8", 660, 13);


        }
        else if(points2 == 9)
        {
            g.drawString("9", 660, 13);


        }
        else if(points2 == 10)
        {
            g.drawString("10", 660, 13);
        
        }
        else
        {

        }
        //border
        // g.fillRect(0, 0, 722);
        // g.fillRect(0, 0, 500);
        // g.fillRect(0, 490, 480);
        // g.fillRect(690, 720, 2);

        //CenterLine
        g.fillRect(340, 10, 5, 10);
        g.fillRect(340, 30, 5, 10);
        g.fillRect(340, 50, 5, 10);
        g.fillRect(340, 70, 5, 10);
        g.fillRect(340, 90, 5, 10);
        g.fillRect(340, 110, 5, 10);
        g.fillRect(340, 130, 5, 10);
        g.fillRect(340, 150, 5, 10);
        g.fillRect(340, 170, 5, 10);
        g.fillRect(340, 190, 5, 10);
        g.fillRect(340, 210, 5, 10);
        g.fillRect(340, 230, 5, 10);
        g.fillRect(340, 250, 5, 10);
        g.fillRect(340, 270, 5, 10);
        g.fillRect(340, 290, 5, 10);
        g.fillRect(340, 310, 5, 10);
        g.fillRect(340, 330, 5, 10);
        g.fillRect(340, 350, 5, 10);
        g.fillRect(340, 350, 5, 10);
        g.fillRect(340, 370, 5, 10);
        g.fillRect(340, 390, 5, 10);
        g.fillRect(340, 410, 5, 10);
        g.fillRect(340, 430, 5, 10);
        g.fillRect(340, 450, 5, 10);
        g.fillRect(340, 470, 5, 10);
        g.fillRect(340, 490, 5, 10);
    }


}