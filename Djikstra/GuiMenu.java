import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.IOException;
/**
 * Write a description of class Window here.
 *
 * Author - Blake Simmonds
 * Version - 2/06/2022
 */
public class GuiMenu extends JFrame implements ActionListener
{
    
    // Class variables
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
 
    public void actionPerformed(ActionEvent e) {
        String cmd=e.getActionCommand();
        switch (cmd) {
            //============================================//
            case "Help": // Help menu
                menuDialogBox();
                break;
        }
    }
    
    void menuDialogBox(){ // dialogue box for settings
        JDialog box = new JDialog(this);
        box.setBounds(400,400,200,200);
        TextArea area =new TextArea("Skill Issue");
        box.add(area);
        box.toFront();
        box.setVisible(true);
        box.setTitle("Help");
        area.setEditable(false);
    }

    /**
     * Constructor for objects of class Window
     */
    public GuiMenu()
    {
        setTitle("Djikstra's Algorithm");
        
        this.getContentPane().setPreferredSize(new Dimension(1000,800));
         
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        //=================================================================//
        menu = new JMenu("Menu"); // Menu for help.
        menuBar.add(menu);

        menuItem=new JMenuItem("Help");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('p'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        //=================================================================//
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.toFront();
        this.setVisible(true);
    }
}
