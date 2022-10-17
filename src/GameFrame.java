import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{

    GamePanel panel;

    GameFrame(){
        // this keyword is to showing the local functions over instant....
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false); // not changing size
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to restart our game after closing...
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}