import javax.swing.*;
import java.awt.*;

public class Assignment5{
	public static void main(String[]args){

	int x=10;
	int y=10;

	BallCanvas ballCanvas = new BallCanvas(x,y);

	for(int i=0; i<1000; i++)
	{
		if(i<500)
		{
			ballCanvas.moveBall(10, 10+i);
			ballCanvas.repaint();
			ballCanvas.delay(1);
		}

		if(i>500)
		{
			ballCanvas.moveBall(10, 1000-i);
			ballCanvas.repaint();
			ballCanvas.delay(1);
		}
	}
}

}