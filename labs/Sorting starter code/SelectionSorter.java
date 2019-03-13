
/**
 * Write a description of class SelectionSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSorter extends Sorter
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class SelectionSorter
     */
    public SelectionSorter()
    {
        // initialise instance variables

    }

 
    /**
     * Initiates a sort
     * @param   a   array to sort
     * @return      sorted array
     */
    public int[] startSort(int[] a){
        return sort(a,0);
    }
    
    public int[] sort(int[] a){
        return sort(a,0);
    }
    
    
    /**
     * Sort the inputed array
     * @param   a   array to sort
     * @return      sorted array
     */
    
    public int[] sort(int[] a, int limit){
       
        if(greaterEqual(limit, a.length-1)){
            System.out.println("==========================");
            return a;
        }
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for(int i = limit; less(i,  a.length); i++){

            if(less(a[i],min)){
                min = a[i];
                minIndex = i;
            }
        }
        int buff = a[limit];
        a[limit] = min;
        a[minIndex] = buff;



        return sort(a,limit+1);
    }
}
