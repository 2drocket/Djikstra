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
    public GuiMenu()
    {
        setTitle("Djikstra's Algorithm");
        
        this.getContentPane().setPreferredSize(new Dimension(400,600));
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.toFront();
        this.setVisible(true);
    }
}
