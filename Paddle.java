import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

class Paddle extends JPanel
{
    int x;
    int y;
    //Positions for paddles in frame.
    public Paddle(int x, int y) //Constructor for Paddle class
    {
        this.x= x;
        this.y = y;
        // make x and y equal to parameters sent when called
    }
    public void paint(Graphics g) // paint paddles
    {
        Color hotGREEN = new Color(90, 237, 41);
        //Creates a new colour called HOTGREEN.
        g.setColor(hotGREEN);
        //Sets paint colour to HOTGREEN.
        g.fillRect(x, y, 15, 80);
        //Paints a Rectangle with the dimensions 15(x) by 80(y).

    }
}