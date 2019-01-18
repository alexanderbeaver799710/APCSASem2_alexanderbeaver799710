package com.alexbeaver.apcsa.labs.lab109;

import java.util.*;
/**
 * Write a description of class SelectionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSort
{
    private static Benchmark bm = new Benchmark();
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class SelectionSort
     */
    public MergeSort()
    {
        // initialise instance variables
        
    }
    /**
     * The main method
     */
    public static void main(String[] args){
        //Sort preset values
        int[]randomVals = new int[1000];
        
        //Sort random values
        
        //  Generate random values
        for(int i = 0; i < randomVals.length; i++){
            randomVals[i] =(int)(Math.random()*1000);
        }
        bm.start();
        mergeSort(randomVals,randomVals.length);
        System.out.println(Arrays.toString(randomVals));
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
            bm.compare();
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
    public static void merge(int[] a, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
            bm.compare();
            if(l[i] <= r[j]){
                a[k++] = l[i++];
                bm.itar();
            }
            else{
                a[k++] = r[j++];
                bm.itar();
            }
        }
        while (i < left){ a[k++] = l[i++];}
        while (j < right) { a[k++] = r[j++];}
    }
    public static void mergeSort(int[] a, int n){
        if(n < 2){return;}
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        for(int i = 0; i < mid; i++){
            l[i]=a[i];
            
        }
        for(int i = mid; i < n; i++){
            r[i-mid] = a[i];
            
        }
        mergeSort(l, mid);
        mergeSort(r,n-mid);
        merge(a, l, r, mid, n-mid);
    }
}
