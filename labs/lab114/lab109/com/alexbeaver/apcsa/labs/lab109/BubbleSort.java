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
        int[] values = {254,971,8,1678,86868,100,199,1666,99922};
        System.out.println(Arrays.toString(startSort(values)));
        //Sort random values
        int[] randomVals = new int[1000];
        //  Generate random values
        for(int i = 0; i < randomVals.length; i++){
            randomVals[i] =(int)( Math.random()*Integer.MAX_VALUE);
        }
       
        bm.start();
        System.out.println(Arrays.toString(startSort(randomVals)));
        bm.end();
        bm.print();
    }
    /**
     * Initiates a sort
     * @param   a   array to sort
     * @return      sorted array
     */
    public static int[] startSort(int[] a){
        return sort(a,a.length);
    }
    /**
     * Sort the inputed array
     * @param   a   array to sort
     * @return      sorted array
     */
    public static int[] sort(int[] a, int limit){
        if(limit <= 1){
            return a;
        }
        for(int i = 0; i < limit-1; i++){
            if(a[i]>a[i+1]){
                    bm.itar();
                    int bufA = a[i];
                    int bufB = a[i+1];
                    a[i+1]=bufA;
                    a[i]=bufB;
            }
        }
        return sort(a,limit-1);
    }
}
