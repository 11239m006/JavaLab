import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("BorderLayout Example");

        // Set BorderLayout with horizontal & vertical gaps
        frame.setLayout(new BorderLayout(10, 10));

        // Add components to 5 regions
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

