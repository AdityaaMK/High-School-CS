import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.awt.Color;

public class EmperorPalpatineRunner
{
	public static void main(String[]args)
	{
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 0), new AdityaaMageshKumar(90));
        world.add(new Location(9, 0), new AdityaaMageshKumar(45));
        world.add(new Location(8, 7), new AdityaaMageshKumar(0));
        world.add(new Location(5, 4), new Actor());
        world.add(new Location(6, 3), new Actor());
        world.add(new Location(3, 7), new Actor());
        world.add(new Location(1, 7), new Actor());
        world.add(new Location(2, 7), new Actor());
        world.add(new Location(4, 6), new Actor());
        world.add(new Location(4, 5), new Rock());
        world.show();
	}
}