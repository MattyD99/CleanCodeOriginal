
/**
 * Write a description of class RoachPopulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoachPopulation
{
   
    private int numRoaches;
    
    public RoachPopulation ( int currentRoaches)
    {
        int population;
        numRoaches = currentRoaches;
     
    }
    public void breed ()
    { 
        numRoaches = (numRoaches * 2);
    }
    public void spray ( double percent)
    {
       numRoaches = (int)(numRoaches * (1 - ( percent / 100 )));
    }
    public int getRoaches()
    { return (numRoaches);
    }
    public String toString()
    {
        return ("Number" + " " + "of" + " " + "roaches" + " " + "in" + " " + "the" + " " + "population" + ": " + getRoaches());
    }
} 

    
    