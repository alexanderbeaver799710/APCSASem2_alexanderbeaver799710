package xyz.abvr.school.apcsa.sem2.labs.jan.thirtyone;
import javax.swing.*;

/**
 * Write a description of class MySwingApplication here.
 *
 * @author (Alex Beaver)
 * @version (Lab 131)
 */
public class MySwingApplication extends Object implements SwingConstants, Runnable
{
    // instance variables - replace the example below with your own
    public JFrame jFrame;

    /**
     * Constructor for objects of class MySwingApplication
     */
    public MySwingApplication()
    {
        // initialise instance variables
        jFrame = new JFrame("Demo Swing Application");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CanvasComponent cc = new CanvasComponent(100,100);
        jFrame.add(cc);
        
        jFrame.setVisible(true);

        
        
        
    }
    public void run(){
    }
    public static void main(String[] args){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
        
        
        
    }
    

    
}
