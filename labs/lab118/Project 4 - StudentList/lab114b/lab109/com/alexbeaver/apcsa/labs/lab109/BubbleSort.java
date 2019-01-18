package com.alexbeaver.apcsa.labs.lab109;
import java.util.*;

/**
 * Write a description of class BubbleSort here.
 *
 * @author (Alex Beaver)
 * @version (Lab 110)
 */
public class BubbleSort
{
    private static Benchmark bm = new Benchmark();
    
    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort()
    {
        // initialise instance variables
       
    }

    /**
     * The main method
     */
    public static void main(String[] args){
        //Sort preset values
       
        ArrayList<Integer>randomVals = new ArrayList<Integer>();
        //  Generate random values
        for(int i = 0; i < 1000; i++){
            randomVals.add((int)( Math.random()*Integer.MAX_VALUE));
        }
       
        bm.start();
        System.out.println(Arrays.toString(startSort(randomVals).toArray()));
        bm.end();
        bm.print();
    }
    /**
     * Initiates a sort
     * @param   a   array to sort
     * @return      sorted array
     */
    public static ArrayList<Integer> startSort(ArrayList<Integer> a){
        return sort(a,a.size());
    }
    /**
     * Sort the inputed array
     * @param   a   array to sort
     * @return      sorted array
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> a, int limit){
        if(limit <= 1){
            return a;
        }
        for(int i = 0; i < limit-1; i++){
            bm.compare();
            if(a.get(i)>a.get(i+1)){
                    bm.itar();
                    int bufA = a.get(i);
                    int bufB = a.get(i+1);
                    a.set(i+1,bufA);
                    a.set(i,bufB);
            }
        }
        return sort(a,limit-1);
    }
}
