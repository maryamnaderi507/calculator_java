

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

       /* JFrame frame = new JFrame();
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.black);
*/
        Calculator calculator = new Calculator();
        calculator.setupAndShowMainFrame();
        calculator.createANdShowButtons();


    }
}