import javax.swing.*;
import java.awt.*;
/**
 * This is the graphical user interface portion of my program that will visably display everything on the screen
 *
 * @author Blake Simmonds
 * @version 31/05/2022
 */
public class GuiMenu extends JFrame
{
    //Class variables
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    public GuiMenu()
    {
        setTitle("Djikstra's Algorithm");//Gives the window a name
        
        this.getContentPane().setPreferredSize(new Dimension(400,600));//Sets the default size of the window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Closes the window when you exit
        
        menuBar=new JMenuBar(); //Creates the menu bar at the top
        this.setJMenuBar(menuBar);
        
        menu = new JMenu("Settings"); //these lines of code create a variable which is a JMenu with a name and then add the menu to the bar
        menuBar.add(menu);
        menu = new JMenu("Help");
        menuBar.add(menu);
        
        menuItem = new JMenuItem("Test");
        menu.add(menuItem);
        
        this.pack();
        this.toFront();
        this.setVisible(true);//Makes the window 
    }
}
