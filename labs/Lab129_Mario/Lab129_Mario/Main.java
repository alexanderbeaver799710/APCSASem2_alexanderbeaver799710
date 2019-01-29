
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public static void main(){
        Character m = new Mario("It's me Mario",100);
        m.setSpeed(100);
        System.out.println(m.getCatchphrase());
        System.out.println(m.getSpeed());
    }
    
}
