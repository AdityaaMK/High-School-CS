import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import java.util.ArrayList;

public class JumperBug extends Bug
{
	public void act()
	{
		if(canMove())
		{
			move();
		}
		else
		{
        	Location loc = getLocation();
        	Location next = loc.getAdjacentLocation(getDirection());
        	Location next2 = next.getAdjacentLocation(getDirection());
        	Grid<Actor> gr = getGrid();
        	if (gr.isValid(next2)){
        		ArrayList<Location> OccLocs = gr.getOccupiedLocations();
        	if (OccLocs.contains(next2))
            	turn();
        	else
            	moveTo(next2);
			}
			else
				turn();
		}
	}
}
