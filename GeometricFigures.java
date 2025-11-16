import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GeometricFigures extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.drawString("Geometric Figures", 120, 20);

        // Rectangle
        g.setColor(Color.BLUE);
        g.drawRect(30, 40, 120, 70);  // x, y, width, height

        // Square
        g.setColor(Color.GREEN);
        g.drawRect(180, 40, 80, 80);

        // Circle
        g.setColor(Color.RED);
        g.drawOval(50, 140, 80, 80);  // circle (equal width & height)

        // Oval
        g.setColor(Color.MAGENTA);
        g.drawOval(170, 140, 120, 60);

        // Line
        g.setColor(Color.BLACK);
        g.drawLine(30, 250, 250, 250);

        // Triangle
        g.setColor(Color.ORANGE);
        int x[] = {70, 40, 100};
        int y[] = {270, 320, 320};
        g.drawPolygon(x, y, 3);
    }
}
