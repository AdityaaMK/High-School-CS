import java.util.ArrayList;
import info.gridworld.actor.Critter;

public class RockEaterRunner extends Critter{

    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }

}