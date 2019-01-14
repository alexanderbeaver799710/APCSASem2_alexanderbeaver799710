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
        ArrayList<Integer> randomVals = new ArrayList<Integer>();
        
        //Sort random values
        
        //  Generate random values
        for(int i = 0; i < 1000; i++){
            randomVals.add((int)( Math.random()*Integer.MAX_VALUE));
        }
        bm.start();
        System.out.println(Arrays.toString((startSort(randomVals)).toArray()));
        bm.end();
        bm.print();
        
        
    }
    /**
     * Initiates a sort
     * @param   a   array to sort
     * @return      sorted array
     */
    public static ArrayList<Integer> startSort(ArrayList<Integer> a){
        return sort(a,0);
    }
    /**
     * Sort the inputed array
     * @param   a   array to sort
     * @return      sorted array
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> a, int limit){
       
        if(limit >= a.size()-1){
            System.out.println("==========================");
            return a;
        }
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for(int i = limit; i < a.size(); i++){

            if(a.get(i)<min){
                min = a.get(i);
                minIndex = i;
            }
        }
        int buff = a.get(limit);
        a.set(limit,min);
        a.set(minIndex,buff);
        bm.itar();


        return sort(a,limit+1);
    }
}
