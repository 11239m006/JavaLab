import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("GridLayout Example");

       
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

       
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

