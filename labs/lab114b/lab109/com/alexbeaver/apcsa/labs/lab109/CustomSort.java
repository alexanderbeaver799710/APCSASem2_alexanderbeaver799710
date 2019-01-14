package com.alexbeaver.apcsa.labs.lab109;
import java.util.*;

/**
 * Write a description of class CustomSort here.
 *
 * @author (Alex Beaver)
 * @version (Lab 109)
 */
public class CustomSort
{
    // instance variables - replace the example below with your own
    private static Benchmark bm = new Benchmark();

    /**
     * Constructor for objects of class CustomSort
     */
    public CustomSort()
    {
        // initialise instance variables

    }

    /**
     * The main method
     */
    public static void main(String[] args){
        
        //Sort random values
        ArrayList<Integer>randomVals = new ArrayList<Integer>();
        //  Generate random values
        for(int i = 0; i < 1000; i++){
            randomVals.add((int)( Math.random()*Integer.MAX_VALUE));
        }
        bm.start();
        System.out.println(Arrays.toString(sort(randomVals).toArray()));
        bm.end();
        bm.print();
        
    }
    /**
     * Sort the inputed array
     * @param   a   array to sort
     * @return      sorted array
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> a){
        for(int i = 0; i < a.size(); i++){
            for(int x = 0; x < a.size(); x++){
                if(i < x && a.get(i)>a.get(x)){
                    int bufA = a.get(i);
                    int bufB = a.get(x);
                    a.set(x,bufA);
                    a.set(i,bufB);
                    bm.itar();
                }
            }
        }
        return a;
    }
}
