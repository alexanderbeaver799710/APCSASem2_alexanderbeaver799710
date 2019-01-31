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
    

    /**
     * Constructor for objects of class MySwingApplication
     */
    public MySwingApplication()
    {
        // initialise instance variables

    }
    public void run(){
    }
    public static void main(String[] args){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
    

    
}
