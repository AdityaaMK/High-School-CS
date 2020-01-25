import java.util.ArrayList;
import info.gridworld.actor.Critter;

public class RockEater extends Critter{

    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }

}