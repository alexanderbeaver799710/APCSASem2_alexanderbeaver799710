package dev.abvr.apcsa.apcsasem2.lab325;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book implements LiteraryWork
{
    // instance variables - replace the example below with your own

    private String content;
    /**
     * Constructor for objects of class Book
     */
    public Book(String content)
    {
        // initialise instance variables
        this.content = content;

    }
    @Override
    public void read(){
        System.out.println(this.content);
    }
    @Override
    public int length(){
        return this.content.length();
    }

    
}
