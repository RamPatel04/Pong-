//Team: Caramel Chocolate
//Members: Nicholas Dyer & Ram Patel
//Course: ICS4U1 F2021 P4
//Teacher: Mr Naccarato
//Creation Date: 11/28/2021
//ICS 4U Unit 3: Sprites and Animations
//Module 1 Due: 12/01/2021
//Module 2 Due: 12/06/2021
//Module 3 Due: ???
//Module 4 Due: 12/17/2021
//Task: The purpose of this assignment will be to create a pong game.

//imports
import javax.swing.*;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main 
{

    static boolean bool = false;

    public static void main(String[] args) 
  
    {
        Game game = new Game(); //initialize function game i variable game

        

        //window////////////////////////////
        JFrame frame = new JFrame("PONG GAME");
        frame.setBackground(Color.black); //set background color for frame black
        frame.setSize(720, 500); // set size for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setVisible(true);//set window visibility to true 
        
        JFrame menu = new JFrame("PONG GAME MENU");
        
        menu.setBackground(Color.black);
        menu.setSize(360,250);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton singlePlayer = new JButton("Single Player");
        JButton multiPlayer = new JButton("Multi Player");
        //menu.setBackground(Color.black);
        panel.add(singlePlayer);
        panel.add(multiPlayer);
        menu.add(panel);
        
        
        
        menu.setVisible(true);

        singlePlayer.addActionListener (new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                try
                {
                    bool = true;
                    menu.dispose();
                    frame.add(game);
                    frame.setVisible(true);
                    game.computerAI = true;
                    game.reset = false;
                    
                }
                catch (Exception e)
                {

                
                }
                
            }
                        
                
        

        });


        multiPlayer.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                try
                {
                    bool = true;
                    menu.dispose();
                    frame.add(game);
                    frame.setVisible(true);
                    game.reset = false;

                }
                catch (Exception e)
                {

                }

            }

        });


        while(true)
        {
            System.out.println("Running");
            while(bool)
            {
                game.update();
                game.AI();
                if (game.reset == true)
                {
                    frame.setVisible(false);
                    menu.setVisible(true);
                    bool = false;
                }
                else
                {
                    try
                    {
                        Thread.sleep(10);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                }
                  
            }
        }
    }
    
}