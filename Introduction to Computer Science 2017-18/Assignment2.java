public class Assignment2{
	public static void main(String[]args){

	BallCanvas ballCanvas = new BallCanvas(0,0);

	for(int i = 0; i < 512; i++){
		ballCanvas.moveBall(0, i);
		ballCanvas.delay(5);
		ballCanvas.repaint();
	}

	for(int i = 511; i > 0; i-=5){
		ballCanvas.moveBall(0, i);
		ballCanvas.delay(2);
		ballCanvas.repaint();
	}
	//* To also make it go faster, you can change the intervals of i, for example i+=5
	}
}