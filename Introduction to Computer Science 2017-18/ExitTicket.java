public class ExitTicket{
	public static void main(String[]args){

		BallCanvas ballCanvas = new BallCanvas(512,512);
		for (int i=1; i<100; i++){
				ballCanvas.moveBall(i,100);
				ballCanvas.delay(5);
				ballCanvas.repaint();
		}
	}
}
