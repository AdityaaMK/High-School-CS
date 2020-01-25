import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.awt.Color;

public class TriangleBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 1), new TriangleBug());
        world.show();
        world.add(new Location(8, 1), new TriangleBug(8));
        world.show();
    }
}