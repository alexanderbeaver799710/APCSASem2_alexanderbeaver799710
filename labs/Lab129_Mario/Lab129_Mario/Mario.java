
/**
 * Write a description of class Mario here.
 *
 * @author (Alex Beaver)
 * @version (1/29)
 */
public class Mario extends Character
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Mario
     */
    public Mario(String catchphrase, int speed)
    {
        super(catchphrase,speed);
        

    }
    /**
     * Sets the speed of the character to 2x the given amount
     * @param   speed   half of the final speed of the character
     */
    @Override
    public void setSpeed(int speed){
        super.setSpeed(speed*2);
    }
    

}
