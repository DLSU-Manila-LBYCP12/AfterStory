package ph.edu.dlsu;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Willard on 8/12/2016.
 */


public class MainMenu extends GraphicsProgram implements ActionListener {


    public static void main(String[] args) {
        new MainMenu().start(args);
    }

    /** Width and height of application window in pixels */
    public static final int APPLICATION_WIDTH = 900;
    public static final int APPLICATION_HEIGHT = 600;

    /** Dimensions of game board (usually the same) */
    private static final int WIDTH = APPLICATION_WIDTH;
    private static final int HEIGHT = APPLICATION_HEIGHT;

    /**This is where all of the them initialized*/
    public void run(){
        setBackground(Color.BLACK);
        setSize(WIDTH, HEIGHT);
        TitleScreen();
        Newgamelabel();
        Loadgamelabel();
        Optionslabel();
        Quitlabel();
    }

//**MILESTONE ONE

    /**This is the title screen of the game */
    private void TitleScreen(){
        JLabel titlescreen = new JLabel ("AFTERSTORY", JLabel.CENTER);
        Font font = new Font("Matura MT Script Capitals", Font.BOLD, 48);
        titlescreen.setFont(font);
        titlescreen.setForeground(Color.darkGray);
        add(titlescreen, getWidth()/2 - 265, getHeight()/5);
    }

    /**For Button Label for new game */
    private void Newgamelabel() {
        JLabel label = new JLabel("New Game", JLabel.CENTER);
        Font font = new Font ("Serif", Font.BOLD, 36);
        label.setFont(font);
        label.setForeground(Color.WHITE);
        add(label, getWidth()/2 - 75, getHeight()/3);
    }


    /**For Button Label for load game */
    private void Loadgamelabel() {
        JLabel label = new JLabel("Load Game", JLabel.CENTER);
        Font font = new Font ("Serif", Font.BOLD, 36);
        label.setFont(font);
        label.setForeground(Color.WHITE);
        add(label, getWidth()/2 - 80, getHeight()/3 + 70);
    }

    /**For Button label for options */
    private void Optionslabel() {
        JLabel label = new JLabel("Options", JLabel.CENTER);
        Font font = new Font ("Serif", Font.BOLD, 36);
        label.setFont(font);
        label.setForeground(Color.WHITE);
        add(label, getWidth()/ 2 - 50, getHeight()/3 + 140);

        //MILESTONE TWO: This is where my label functions as button. In this case, it's letting me open an options app
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame jf = new JFrame("Options");
                jf.setBackground(Color.BLACK);
                jf.setSize(new Dimension(600, 500));
                jf.setVisible(true);

            }
        });
    }

    /**For Button label for quit */
    private void Quitlabel() {
        JLabel label = new JLabel("Quit", JLabel.CENTER);
        Font font = new Font ("Serif", Font.BOLD, 36);
        label.setFont(font);
        label.setForeground(Color.WHITE);
        add(label, getWidth()/2 - 30, getHeight()/3 + 210);

        //MILESTONE TWO: This is where my label functions as button. In this case, it's letting me quit
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

    }

//**MILESTONE TWO

}
