package dev.abvr.apcsa.apcsasem2.lab325;


/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Runner
     */
    public Runner()
    {
        // initialise instance variables
        
    }
    public static void main(){
        Book book = new Book("This is a book");
        book.read();
        System.out.println(book.length());
        Blog blog = new Blog(new String[] {"Post 1","Post 2","Post 3"});
        blog.read();
        System.out.println(blog.length());
    }

    
}
