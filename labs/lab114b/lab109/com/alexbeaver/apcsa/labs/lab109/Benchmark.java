package com.alexbeaver.apcsa.labs.lab109;
import java.util.*;

/**
 * Write a description of class Benchmark here.
 *
 * @author (Alex Beaver)
 * @version (Lab 114)
 */
public class Benchmark
{
    

    private Calendar cal;
    private long start;
    private long end;
    private long diff;
    private int itars = 0;
    private int compares = 0;
    /**
     * Constructor for objects of class Benchmark
     */
    public Benchmark()
    {
        // initialise instance variables
        
    }
    /**
     * Start a benchmark
     */
    public void start(){
        cal = Calendar.getInstance();
        
        start = System.nanoTime();
    }
    /**
     * Iterate for a swap
     */
    public void itar(){itars += 1;}
    
    /**
     * Iterate compares
     */
   public void compare(){compares += 1;}
    /**
     * End the benchmark
     */
    public void end(){
        end = System.nanoTime();
        diff  =  Math.abs(end-start);
    }
    /**
     * Print the results
     */
    public void print(){
        System.out.println("========================================");
        System.out.println("Start: "+start);
        System.out.println("End  : "+end);
        System.out.println("Time : "+diff);
        System.out.println("Swap : "+itars);
        System.out.println("Comp : "+compares);
    }
    
    
}
