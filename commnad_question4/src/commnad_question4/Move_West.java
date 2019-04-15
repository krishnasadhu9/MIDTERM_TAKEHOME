package commnad_question4;

public class Move_West implements command {
	
private Player player;
	
	public Move_West(Player player) {
		this.player = player;
	}
	
	public void execute() {
		player.X_cooridnate = player.X_cooridnate - 1;
	}
	
	public boolean undo() {
		return true ;
	}


}
