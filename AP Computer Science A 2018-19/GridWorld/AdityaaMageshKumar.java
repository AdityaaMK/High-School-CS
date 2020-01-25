import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import java.util.ArrayList;

public class AdityaaMageshKumar extends Critter
{
	public AdityaaMageshKumar()
	{
		setColor(null);
	}

	public AdityaaMageshKumar(int dir)
	{
		setColor(null);
		setDirection(dir);
	}

    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> actors = new ArrayList<Actor>();
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		locs.add(next);

		for(int i=1; i<10; i++)
		{
			Location next2 = locs.get(i-1).getAdjacentLocation(getDirection());
			locs.add(next2);
		}

        for (Location locc : locs)
        {
			if(gr.isValid(locc))
			{
            	Actor a = getGrid().get(locc);
            	if (a != null){
                	actors.add(a);
                	return actors;
				}
			}
        }
        return actors;
    }

    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (!(a instanceof Critter)&&!(a instanceof Rock))
            {
			    Grid<Actor> gr = getGrid();
				Location loc = a.getLocation();
                a.removeSelfFromGrid();
                Ash ash = new Ash();
                ash.putSelfInGrid(gr, loc);
			}
        }
    }

    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }

}