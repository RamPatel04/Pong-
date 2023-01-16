import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

class Ball extends JPanel
{

    int x = 340;
    int y = 220;
    //posistions for ball in frame
    
    public Ball(int x, int y) //Constructor for ball class
    {
        this.x = x;
        this.y = y;
        // make x and y equal to parameters sent when called
    }
    
    
    public void paint(Graphics g)
    {
        Color hotGREEN = new Color(90, 237, 41);
        //Creates a new colour called HOTGREEN.
        g.setColor(hotGREEN);
        // Sets paint colour to HOTGREEN.
        g.fillOval(this.x, this.y, 15, 15);
        // Paints an oval with the dimensions 25(x) by 25(y).

    }

}