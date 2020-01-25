import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;

public class NyanCatRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(8, 2), new NyanCat());
        world.show();
        world.add(new Location(7, 2), new Rock());
        world.show();
        world.add(new Location(9, 3), new Bug());
        world.show();
        world.add(new Location(3, 2), new Actor());
        world.show();
    }
}
