package xyz.abvr.labs.lab425;
import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (Alex Beaver)
 * @version (250419T11:30)
 */
public class Main
{
    // instance variables - replace the example below with your own


    
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables

        
    }
    
   
    public static Integer findMissing(ArrayList<Integer> x){
        int sum = 0;
        for(int i = 0; i < x.size(); i++){
            sum += x.get(i);
        }
        return 101*50-sum;
    }
    
    public static int binarySearch(int[] a, int start, int end, int target){
        int midpoint = (start + end) / 2;
        if(a[midpoint] == target){
            return midpoint;
        }
        if(end-start <= 1){
            return start;
        }
        if(a[midpoint] < target){
            return binarySearch(a, midpoint, end, target);
        }
        if(a[midpoint] > target){
            return binarySearch(a, start, midpoint, target);
        }
        return binarySearch(a, midpoint, end, target);
        
    }
    public static int findSum(int[] a1, int[] a2, int targ){
        int ret = Integer.MAX_VALUE;
        int delta = Integer.MAX_VALUE;
        for(int a = 0; a < a1.length; a++){
            //int bin = binarySearch(a1,0,a1.length,targ);

            int bin = Arrays.binarySearch(a2,targ-a1[a]);

            if(bin >= 0 && Math.abs(a1[a]-a2[bin]) < delta){
                delta = (a1[a]+a2[bin]);
                ret = a1[a] + a2[bin];
            }
                

        }
        return ret;
    }
    
    public static String findFirstRepeating(String param){
        int secondIndex = Integer.MAX_VALUE;
        String repeatedChar = "";
        int i = 0;
        boolean run = true;
        while(run){

            if(i > param.length() - 2){
                run = false;
            }
            if( i >= secondIndex){
                run = false;
            }
            if(param.indexOf(param.substring(i,i+1), i+1) < secondIndex && param.indexOf(param.substring(i,i+1), i+1) > -1){
                secondIndex = param.indexOf(param.substring(i,i+1), i+1);
                repeatedChar = param.substring(i, i+1);

            }
            i += 1;
        }
        return repeatedChar;
        
    }
    public static ArrayList<Integer> findIntersection(int[] a1, int[] a2, int[] a3){
        ArrayList<Integer> commons = new ArrayList<>();
        Arrays.sort(a2);
        Arrays.sort(a3);
        for(int i = 0; i < a1.length; i++){
            if((Arrays.binarySearch(a2,a1[i]) > -1 && Arrays.binarySearch(a3,a1[i]) > -1 && commons.indexOf(a1[i])== -1)){
                commons.add(a1[i]);
            }
        }
        return commons;
    }
    public static int[][] flipDiagonal(int[][] mat){
        int[][] ret = new int[mat[0].length][mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int x = 0; x < mat[0].length; x++){
                ret[x][i] = mat[i][x];
            }
        }
        return ret;
    }
    
    public static void main(){
        for(int x = 0; x < 20; x++){
            ArrayList<Integer> a = new ArrayList<Integer>();
            int rand1 = (int)(Math.random()*100)+1;
            System.out.print(rand1);
            for(int i = 1; i <= 100; i++){
                if(i == rand1){
                    a.add(0);
                }
                else{
                    a.add(i);
                }
            }
            
            
        System.out.print("\t");
        int res = findMissing(a);
        System.out.print(res);
        System.out.print("\t");
        System.out.println(rand1 == res);
    }
        for(int i = 0; i < 20; i++){
            int[] a = new int[20];
            int[] b = new int[20];
            for(int x = 0; x < 20; x ++){
                a[x] = (int)(Math.random()*10);
                b[x] = (int)(Math.random() * 10);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
            int target = (int)(Math.random()*18);
            System.out.println("Target \t" + target + "\t Acutal \t" + findSum(a,b,target));
        }
        System.out.println("");
        System.out.println(findFirstRepeating("ABCADC"));
        System.out.println(findFirstRepeating("ABCBCA"));
        System.out.println(findFirstRepeating("ABC"));
        
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        int[] a3 = new int[10];
        for(int i = 0; i < 10; i++){
            a1[i] = (int)(Math.random()*10);
            a2[i] = (int)(Math.random()*10);
            a3[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(findIntersection(a1,a2,a3).toArray()));
        int[][] o = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(flipDiagonal(o)));
            
        
        
    }


}
