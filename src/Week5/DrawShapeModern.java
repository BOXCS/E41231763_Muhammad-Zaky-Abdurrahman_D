package Week5;

import javax.swing.*;
import java.awt.*;

public class DrawShapeModern extends JFrame {

    public DrawShapeModern() throws HeadlessException {
        setTitle("Draw Shapes");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel drawPanel = new DrawPanel();
        add(drawPanel);

        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DrawShapeModern());
    }
}

class DrawPanel extends JPanel {
    
    public DrawPanel() {
        // Set the background color to orange
        setBackground(Color.ORANGE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Cast to Graphics2D for additional features
        Graphics2D g2d = (Graphics2D) g;

        // Set Font
        g2d.setFont(new Font("Arial", Font.ITALIC, 18));

        // Create title
        g2d.drawString("Draw Shapes", 90, 20);

        // Set the Color for the first shape
        g2d.setColor(Color.GREEN);
        g2d.fillRect(120, 120, 120, 120);

        // Fill a rectangle
        g2d.setColor(Color.RED);
        g2d.fillRect(115, 115, 90, 90);

        // Set the color for the next shape
        g2d.setColor(Color.BLUE);

        // Draw a circle using fillOval
        g2d.fillOval(110, 110, 50, 50);

        // Set Color for next shape
        g2d.setColor(Color.CYAN);

        // Draw another rectangle
        g2d.drawRect(50, 50, 50, 50);
        g2d.fillRect(50, 50, 50, 50);
    }
}
