package dev.abvr.apcsa.apcsasem2.lab325;

import java.util.Arrays;
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
     public static void merge(LiteraryWork[] a, LiteraryWork[] l, LiteraryWork[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
          
            if(l[i].length() <= r[j].length()){
                a[k++] = l[i++];
              
            }
            else{
                a[k++] = r[j++];
                
            }
        }
        while (i < left){ a[k++] = l[i++];}
        while (j < right) { a[k++] = r[j++];}
    }
    public static void mergeSort(LiteraryWork[] a, int n){
        if(n < 2){return;}
        int mid = n/2;
        LiteraryWork[] l = new LiteraryWork[mid];
        LiteraryWork[] r = new LiteraryWork[n-mid];
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
    public static LiteraryWork[] sortLW(LiteraryWork[] a){
        mergeSort(a, a.length);
        return a;
    }
    public static void main(){
        Book book = new Book("This is a book");
        book.read();
        System.out.println(book.length());
        Blog blog = new Blog(new String[] {"Post 1","Post 2","Post 3"});
        blog.read();
        System.out.println(blog.length());
        Book[] booksToSort = new Book[]{new Book("This is a book"),new Book("This book"),new Book("This is a book 123456")};
        LiteraryWork[] sorted = sortLW(booksToSort);
        for(LiteraryWork i:sorted){
            System.out.print(i.length() + ", ");
        }
        
    }

    
}
