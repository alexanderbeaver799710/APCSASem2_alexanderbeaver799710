package com.alexbeaver.apcsa.labs.lab109;

import java.util.*;
/**
 * Write a description of class SelectionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSort
{
    private static Benchmark bm = new Benchmark();
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class SelectionSort
     */
    public SelectionSort()
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
        return sort(a,0);
    }
    /**
     * Sort the inputed array
     * @param   a   array to sort
     * @return      sorted array
     */
    public static int[] sort(int[] a, int limit){
       
        if(limit >= a.length-1){
            System.out.println("==========================");
            return a;
        }
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for(int i = limit; i < a.length; i++){

            if(a[i]<min){
                min = a[i];
                minIndex = i;
            }
        }
        int buff = a[limit];
        a[limit] = min;
        a[minIndex] = buff;
        bm.itar();


        return sort(a,limit+1);
    }
}
