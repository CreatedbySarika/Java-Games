import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TTT {
    public static void main(String[] args) {
        System.out.println("Tic-Tac-toe");

        JFrame fr = new JFrame("Tic Tac Toe");
        fr.setLocation(800, 255);
        fr.setSize(450, 250);
        fr.setResizable(false);
        fr.setLayout(new FlowLayout());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton start = new JButton("start");
        start.setLocation(460, 750);
        start.setAlignmentX(50);
        start.setAlignmentY(25);
        fr.add(start);

        JButton Exit = new JButton("Exit");
        Exit.setLocation(470, 750);
        fr.add(Exit);

        fr.setVisible(true);

    }
}