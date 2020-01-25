import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class SpinBug extends Bug{
	private int steps;
	private int sideLength;
	private boolean counter;
	private int turnNoC;
	private int turnNoCC;

	public SpinBug(boolean counter)
	{
		if(counter == true)
			setDirection(90);
	 	this.counter = counter;
		steps = 0;
		sideLength = 1;
	}

	public void act(){
		if(steps < sideLength & canMove()){
			move();
			steps++;
		}

		else if (steps < sideLength && (canMove() == false)){
			turn();
		}

		else if(turnNoC==8){
			turnNoC = 0;
			steps = 0;
		}

		else if(counter == true)
			{
			turn();
			turnNoC++;
			}

		else if(turnNoCC==8)
			{
			turnNoCC = 0;
			steps = 0;
		}

		else if(counter == false)
			{
			setDirection(getDirection() - 45);
			turnNoCC++;
			}
	}

}