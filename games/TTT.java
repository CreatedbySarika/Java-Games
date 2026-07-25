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
        fr.setResizable(true);
        fr.setVisible(true);

        JButton start = new JButton("start");
        start.setLocation(460, 250);
        start.setAlignmentX(50);
        start.setAlignmentY(25);
        fr.add(start);

        JButton Exit = new JButton("Exit");
        Exit.setLocation(470, 250);
        fr.add(Exit);

    }
}