package xyz.abvr.apcsa.sem2.hw.apr10;
import java.util.*;

/**
 * Write a description of class ClimbingClub here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbingClub
{
    // instance variables - replace the example below with your own

    private List<ClimbInfo> climbList;
    /**
     * Constructor for objects of class ClimbingClub
     */
    public ClimbingClub()
    {
        // initialise instance variables
        climbList = new ArrayList<ClimbInfo>();
        

    }
    public void addClimb(String peakName, int climbTime){
        climbList.add(new ClimbInfo(peakName, climbTime));
    }
    public void addClimbAlphabetically(String peakName, int climbTime){
        boolean run = true;
        int i = 0;
        while(run){
            if(i >= climbList.size()){
                run = false;
            }
            else{
                if(climbList.get(i).getName().compareTo(peakName) < 0){
                    run = false;
                }else{
                    i++;
                }
            }
            climbList.add(i,new ClimbInfo(peakName, climbTime));

        }
    }
    public int distinctPeakNames(){
        // i) NO
        // ii) YES
        return 0;
    }
}

