package dev.abvr.apcsa.apcsasem2.lab325;


/**
 * Write a description of class BlogPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Blog implements LiteraryWork
{
    // instance variables - replace the example below with your own

    public String[] posts;
    /**
     * Constructor for objects of class BlogPost
     */
    public Blog(String[] posts)
    {
        // initialise instance variables
        this.posts = posts;

    }
    @Override
    public void read(){
        for(String i: posts){
            System.out.println(i);
        }
    }
    @Override
    public int length(){
        return this.posts.length;
    }
    

   
}
