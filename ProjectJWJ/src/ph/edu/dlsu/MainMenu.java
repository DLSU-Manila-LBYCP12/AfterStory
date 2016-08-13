package ph.edu.dlsu;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

/**
 * Created by Willard on 8/12/2016.
 */


public class MainMenu extends GraphicsProgram implements Serializable {


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
        GLabel titlescreen = new GLabel ("AFTERSTORY");
        Font font = new Font("Matura MT Script Capitals", Font.BOLD, 48);
        titlescreen.setFont(font);
        titlescreen.setColor(Color.WHITE);
        add(titlescreen, getWidth()/2 - 265, getHeight()/5);
    }

    /**For Button Label for new game */
    private void Newgamelabel() {
        GRect box = new GRect(200, 50);
        GLabel label = new GLabel("New Game", 200, 100);
        label.setFont("Serif-bold-36");
        box.setColor(Color.WHITE);
        label.setColor(Color.WHITE);
        add(box, getWidth()/2 - 90, getHeight()/3);
        add(label, getWidth()/2 - 75, getHeight()/3 + 40);
    }


    /**For Button Label for load game */
    private void Loadgamelabel() {
        GRect box = new GRect(200, 50);
        GLabel label = new GLabel("Load Game", 200, 100);
        label.setFont("Serif-bold-36");
        box.setColor(Color.WHITE);
        label.setColor(Color.WHITE);
        add(box, getWidth()/2 - 90, getHeight()/3 + 70);
        add(label, getWidth()/2 - 80, getHeight()/3 + 70 + 40);
    }

    /**For Button label for options */
    private void Optionslabel() {
        GRect box = new GRect(200, 50);
        GLabel label = new GLabel("Options", 200, 100);
        label.setFont("Serif-bold-36");
        box.setColor(Color.WHITE);
        label.setColor(Color.WHITE);
        add(box, getWidth()/ 2 - 90, getHeight()/3 + 140);
        add(label, getWidth()/ 2 - 50, getHeight()/3 + 140 + 40);
    }

    /**For Button label for quit */
    private void Quitlabel() {
        GRect box = new GRect(200, 50);
        GLabel label = new GLabel("Quit", 200, 100);
        label.setFont("Serif-bold-36");
        box.setColor(Color.WHITE);
        label.setColor(Color.WHITE);
        add(box, getWidth()/2 - 90, getHeight()/3 + 210);
        add(label, getWidth()/2 - 30, getHeight()/3 + 210 + 40);
    }

//**MILESTONE TWO

    /**To add the mouse*/
    public synchronized void addMouseListener(MouseListener e) {
        super.addMouseListener(e);
    }

    /**This is all the functions/actions when the buttons are pressed*/
    public void mouseClicked(MouseEvent me) {
        if (me.getX()>= getWidth()/2 - 90 && me.getX() <= getWidth()/2 - 90 + 200) {
            /**Newgame*/
            if (me.getY() >= getHeight()/3 && me.getY() <= getHeight()/3 - 50) {
                //Please add function here
                System.out.println("Hello");//Tester
            }
            /**Loadgame*/
            else if (me.getY() >= getHeight()/3 + 70 && me.getY() <= getHeight()/3 + 70 + 50) {
                //Please add function here
                System.out.println("Hello");//Tester
            }
            /**Options*/
            else if (me.getY() >= getHeight()/3 + 140 && me.getY() <= getHeight()/3 + 140 + 50) {
                //Please add function here
                System.out.println("Hello");//Tester
            }
            /**Quit*/
            else if (me.getY() >= getHeight()/3 + 210 && me.getY() <= getHeight()/3 + 210 + 50) {
                //Please add function here
                System.out.println("Hello");//Tester
            }
        }
    }

}
