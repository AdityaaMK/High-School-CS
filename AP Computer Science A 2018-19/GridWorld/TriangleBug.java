import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;

public class TriangleBug extends Bug
{
	private int steps;
	private int sideLength;
	private int baseLength;
	private int counter;

	public TriangleBug()
	{
		setDirection(45);
		steps = 0;
		sideLength = 3;
	}

	public TriangleBug(int length)
	{
		setDirection(45);
		steps = 0;
		sideLength = length;
	}

	public void act()
	{
		if(steps<sideLength && canMove())
		{
			move();
			steps++;
		}
		else if(counter==0)
		{
			turn();
			counter++;
		}
		else if(counter==1)
		{
			turn();
			steps = 0;
			counter++;
		}
		else if(counter==2)
		{
			turn();
			counter++;
		}
		else if(counter==3)
		{
			turn();
			counter++;
		}
		else if(counter==4)
		{
			turn();
			steps = 0;
			counter++;
			sideLength = sideLength*2;
		}
		else if(counter==5)
		{
			turn();
			counter++;
		}
		else if(counter==6)
		{
			turn();
			counter++;
		}
		else if(counter==7)
		{
			turn();
			steps = 0;
			counter = 0;
			sideLength = sideLength/2;
		}
	}
}
