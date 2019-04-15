package commnad_question4;

public class Player {
	
	public int X_cooridnate;
	public int Y_coordinate;
	
	public Player() {
		X_cooridnate= 0;
		Y_coordinate = 0;
	}
	
	public void PlayerPosition() {
		System.out.println("player x coordinates:"+X_cooridnate);
		System.out.println("player y coordinates:"+Y_coordinate);
	}


}
