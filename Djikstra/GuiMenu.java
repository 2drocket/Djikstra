import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Scanner;
import java.io.IOException;
/**
 * Write a description of class Window here.
 *
 * Author - Blake Simmonds
 * Version - 14/06/2022
 */
public class GuiMenu extends JFrame implements ActionListener,MouseListener
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
    
    public void mouseExited(MouseEvent e) {System.out.println("Exited");}
    public void mouseEntered(MouseEvent e) {System.out.println("Entered");}
    public void mouseReleased(MouseEvent e) {System.out.println("Released");}
    public void mousePressed(MouseEvent e) {System.out.println("Pressed");}
    public void mouseClicked(MouseEvent e) {
        int mousex=e.getX();
        int mousey=e.getY();
        System.out.println("clicked at "+mousex+", "+mousey);
    }
    
    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("I love text",100,70);

        //===================================// Text Drawing on graphics

        int xStart=100;
        int xEnd=500;
        int yStart=100;
        int yEnd=100;
        Line2D lin = new Line2D.Float(xStart,yStart,xEnd,yEnd); 
        g2.draw(lin);

        //===================================// Line Drawing on graphics

        g2.fillOval(0010, 040, 100, 100);
        g2.setColor(Color.RED);
        g2.drawString("Circle",42,90);

        //===================================// Cirlce Drawing on graphics
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
        this.setExtendedState(MAXIMIZED_BOTH);//this sets it to fullscreen
        this.setVisible(true);
        
        addMouseListener(this);
    }
}
