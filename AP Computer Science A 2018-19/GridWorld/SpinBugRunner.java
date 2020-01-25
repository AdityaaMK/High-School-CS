import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.grid.UnboundedGrid;

import java.awt.Color;

public class SpinBugRunner
{
    public static void main(String[] args)
    {
 		UnboundedGrid<Actor> grid = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld(grid);

		world.add(new Location(9,9), new EBug(2));
        world.add(new Location(15, 15), new SpinBug(false));
        world.show();
        world.add(new Location(20, 20), new SpinBug(true));
        world.show();
        world.add(new Location(10, 15), new Rock());
    }
}