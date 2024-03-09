
package Week5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Zaky
 */
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init() {
        // The Font is Arial size 18 and is itacized
        font = new Font("Arial",Font.ITALIC,18);
        
        // Some Color are predefined in the Color Class
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        // Colors can be created using red, green, blue values
        blueColor = new Color(0,0,122);
        
        // Set Background Color to the applet
        setBackground(backgroundColor);
    }
    
    public void stop() {
        
    }

    @Override
    public void paint(Graphics g) {
        // Set Font
        g.setFont(font);
        
        // Create title
        g.drawString("Draw Shapes", 90, 20);
        
        // Set the Color for the first shape
        g.fillRect(120, 120, 120, 120);
        
        // Fill a rectangle
        g.fillRect(115, 115, 90, 90);
        
        // Set the color for the next shape
        g.setColor(redColor);
        
        // Draw a circle using drawArc
        g.fillArc(110, 110, 50, 50, 0, 360);
        
        // Set Color for next shape
        g.setColor(Color.CYAN);
        
        // Draw another rectangle
        g.drawRect(50, 50, 50, 50);
        
        // This will fill the rectangle
        g.fillRect(50, 50, 50, 50);
        
    }
    
    public static void main(String[] args) {
        Frame frame = new Frame("Draw Shape");
        DrawShapes drawShapes = new DrawShapes();
        drawShapes.init();
        
        frame.add(drawShapes);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
    }
    
}
