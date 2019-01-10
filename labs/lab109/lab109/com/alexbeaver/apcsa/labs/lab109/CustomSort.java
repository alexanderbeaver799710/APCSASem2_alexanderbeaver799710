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
        int[] values = {254,971,8,1678,86868,100,199};
        System.out.println(Arrays.toString(sort(values)));
        
    }
    /**
     * Sort the inputed array
     * @param   a   the array to sort
     * @return      the sorted array
     */
    public static int[] sort(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int x = 0; x < a.length; x++){
                if(i < x && a[i]>a[x]){
                    int bufA = a[i];
                    int bufB = a[x];
                    a[x]=bufA;
                    a[i]=bufB;
                }
            }
        }
        return a;
    }
}
