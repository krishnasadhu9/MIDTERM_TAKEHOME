package commnad_question4;

public class move_south implements command {
	
private Player player;
	
	public move_south(Player player) {
		this.player = player;
	}
	
	public void execute() {
		player.Y_coordinate = player.Y_coordinate - 1;
	}
	
	public boolean undo() {
		return true ;
	}


}
