import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class HumanFace extends Applet {

    public void paint(Graphics g) {

        // Face outline
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);  // x, y, width, height

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(90, 110, 30, 20);   // Left eye
        g.fillOval(180, 110, 30, 20);  // Right eye

        // Nose
        g.drawLine(150, 130, 150, 170);

        // Mouth
        g.setColor(Color.RED);
        g.drawArc(100, 150, 100, 60, 0, -180);

        // Title text
        g.setColor(Color.BLACK);
        g.drawString("Human Face Applet", 105, 280);
    }
}
