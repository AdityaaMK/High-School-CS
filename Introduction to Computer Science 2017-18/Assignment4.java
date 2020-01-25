public class Assignment4{
	public static void main(String[]args){

	BallCanvas ballCanvas = new BallCanvas(260,0);

	for(int i = 0; i < 512; i++){
			ballCanvas.moveBall(260, i);
			ballCanvas.delay(5);
			ballCanvas.repaint();
		}

	for(int i = 511; i > 0; i--){
			ballCanvas.moveBall(299, i);
			ballCanvas.delay(5);
			ballCanvas.repaint();
		}

	}
}