import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;

import java.awt.Color;

public class JumperBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(8, 2), new JumperBug());
        world.show();
        world.add(new Location(2, 2), new Rock());
        world.show();
    }
}
