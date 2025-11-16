import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("FlowLayout Example");

       
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));

       
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

