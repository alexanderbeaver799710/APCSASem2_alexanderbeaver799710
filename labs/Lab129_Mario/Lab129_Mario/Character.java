
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    // instance variables - replace the example below with your own
    protected String catchphrase;
    protected int speed;

    /**
     * Constructor for objects of class Character
     */
    public Character(String catchphrase, int speed)
    {
        // initialise instance variables
        this.catchphrase = catchphrase;
        this.speed = speed;

    }
    /**
     * Set the catchphrase
     * @param   catchphrase the character's catchphrase
     */
    public void setCatchphrase(String catchphrase){
        this.catchphrase = catchphrase;
    }
    /**
     * Get the catchphrase
     * @return  character catchphrase
     */
    public String getCatchphrase(){
        return this.catchphrase;
    }
    /**
     * Set the speed
     * @param   speed   the speed of the character
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }
    /**
     * Return the speed
     * @return  speed of the character
     */
    public int getSpeed(){
        return this.speed;
    }

    
}
