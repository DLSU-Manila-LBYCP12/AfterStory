package ph.edu.dlsu;

/**
 * Created by Jacob on 8/20/2016.
 */

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class Game extends JPanel implements ActionListener{

    protected Scanner scanner;
    //protected GameCanvas canvas;
    private JTextArea textarea = new JTextArea ();
    private JTextField field = new JTextField ();
    private JButton buton = new JButton ("input");
    private final static String newline = "\n";

    public Game() {
        //Panel 1 is the text field that takes in commands from the player
        //panel 2 is the dialog for the game ie the text area
        textarea.setEditable(false);
        DefaultCaret caret = (DefaultCaret)textarea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        //adds button functionality to input text to the textarea/panel1
        field.addActionListener(this);
        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel (new BorderLayout(2,2));
        JPanel panel2 = new JPanel (new BorderLayout(2,2));
        JLabel label1 = new JLabel ("Message");


        panel2.add(label1, BorderLayout.NORTH);
        panel2.add(new JScrollPane(textarea), BorderLayout.CENTER);

        panel1.add(field, BorderLayout.CENTER);
        panel1.add(buton, BorderLayout.EAST);

        add(panel1, BorderLayout.SOUTH);
        add(panel2, BorderLayout.CENTER);

    }
    //creates new dimension for the new game
    public Dimension getPreferredSize() {
        return new Dimension(900, 600);
    }

    // creates the Jframe for the new game
    public void create() throws NullPointerException {
        JFrame jf = new JFrame("GAME ON");
        jf.setLocationByPlatform(true);
        Game panel = new Game();
        jf.add(panel);
        jf.pack();
        jf.setVisible(true);
    }

    //Listens for the bunny... i mean actions
    public void actionPerformed(ActionEvent e) {
        String text = field.getText();
        textarea.append(text + newline);
        field.selectAll();
        textarea.setCaretPosition(textarea.getDocument().getLength());
    }
}
