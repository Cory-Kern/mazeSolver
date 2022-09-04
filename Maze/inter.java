
/**
 * Write a description of class intersection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class inter
{
    // instance variables - replace the example below with your own
    private boolean N;
    private boolean S;
    private boolean W;
    private boolean E;
    private boolean F;

    /**
     * Constructor for objects of class intersection
     */
    public inter(Boolean North,Boolean South,Boolean West,Boolean East, Boolean Finish)
    {
        // initialise instance variables
        N = North;
        S = South;
        W = West; 
        E = East;
        F = Finish;
    }

    public Boolean getNorth()
    {
        return N;
    }
    public Boolean getSouth()
    {
        return S;
    }
    public Boolean getWest()
    {
        return W;
    }
    public Boolean getEast()
    {
        return E;
    }
    public Boolean isFinish()
    {
        return F;
    }
    public Boolean[] getOptions()
    {
        Boolean[] result = {N, S, W, E};
        return result;
    }
}
