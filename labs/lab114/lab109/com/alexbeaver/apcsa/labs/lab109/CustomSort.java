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
        //Sort preset values
        int[] values = {254,971,8,1678,86868,100,199,1666,99922};
        System.out.println(Arrays.toString(sort(values)));
        //Sort random values
        int[] randomVals = new int[1000];
        //  Generate random values
        for(int i = 0; i < randomVals.length; i++){
            randomVals[i] =(int)( Math.random()*1000);
        }
        bm.start();
        System.out.println(Arrays.toString(sort(randomVals)));
        bm.end();
        bm.print();
        
    }
    /**
     * Sort the inputed array
     * @param   a   array to sort
     * @return      sorted array
     */
    public static int[] sort(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int x = 0; x < a.length; x++){
                if(i < x && a[i]>a[x]){
                    int bufA = a[i];
                    int bufB = a[x];
                    a[x]=bufA;
                    a[i]=bufB;
                    bm.itar();
                }
            }
        }
        return a;
    }
}
