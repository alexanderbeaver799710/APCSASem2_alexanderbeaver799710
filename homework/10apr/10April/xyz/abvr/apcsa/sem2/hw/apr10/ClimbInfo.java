package xyz.abvr.apcsa.sem2.hw.apr10;


/**
 * Write a description of class ClimbInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    // instance variables - replace the example below with your own

    private String peakName;
    private int climbTime;
    /**
     * Constructor for objects of class ClimbInfo
     */
    public ClimbInfo(String peakName, int climbTime)
    {
        // initialise instance variables
        
        this.peakName = peakName;
        this.climbTime = climbTime;
    }
    public String getName(){
        return this.peakName;
    }
    public int getTime(){
        return this.climbTime;
    }

  
}
