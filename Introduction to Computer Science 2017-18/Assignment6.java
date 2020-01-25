public class Assignment6{
	public static void main(String[]args){

	BallCanvas ballCanvas = new BallCanvas(0,0);

		int xstep=1;
		int ystep=1;
		int x=1;

		for(int y=1; y<=512; y+=ystep){

		x+=xstep;

			if(x==537)
				xstep*=-1;
			if(y==512)
				ystep*=-1;
			if(x==0)
				xstep*=-1;
			if(y==0)
				ystep*=-1;

				ballCanvas.moveBall(x, y);
				ballCanvas.repaint();
				ballCanvas.delay(1);
	}

}

}