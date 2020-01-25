import info.gridworld.actor.Bug;

public class EBug extends Bug{

    private int steps;
    private int sideLength;
    private int counter;

    public EBug(int length)
    {
        setDirection(270);
        steps = 0;
        sideLength = length;
    }

    public void act()
    {
		if (steps < sideLength && canMove())
		{
		    move();
		    steps++;
        }
        else if (counter == 0)
        {
            setDirection(180);
            steps = 0;
            counter++;
        }
        else if (counter == 1 || counter == 4){
        	setDirection(90);
			steps = 0;
        	counter++;
		}
        else if (counter == 2){
        	setDirection(270);
			steps = 0;
        	counter++;
		}
		else if (counter == 3)
		{
			setDirection(180);
			steps = 0;
			counter ++;
		}
    }
}