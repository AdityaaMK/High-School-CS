public class Assignment7{
	public static void main (String[]args){
	BallCanvas ballCanvas=new BallCanvas(0,512);

	for(int x=0; x<538; x++){
		int y=512;
		y=(int)((x*x*0.007106)-(3.816*x)+512);
		ballCanvas.moveBall(x,y);
		ballCanvas.delay(5);
		ballCanvas.repaint();
	}

	}
}