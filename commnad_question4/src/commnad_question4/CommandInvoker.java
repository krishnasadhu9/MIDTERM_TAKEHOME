package commnad_question4;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class CommandInvoker {
	
	public CommandInvoker()
	{
		
	}
	
	
	
	
		public void startplay(Player player) {
			for (int i = 0; i < 50; i++) {
				int r = ThreadLocalRandom.current().nextInt(1, 4);
				if (r == 1) {
					command mn = new move_North(player);
					mn.execute();
					System.out.println("player moves north");
					player.PlayerPosition();
					
				} else if (r == 2){
					command me = new Move_East(player);
					me.execute();
					System.out.println("player moves east ");
					player.PlayerPosition();
					
				} else if (r == 3) {
					command ms = new move_south(player);
					ms.execute();
					System.out.println("player moves south");
					player.PlayerPosition();
					
				} else if (r == 4) {
					command mw = new Move_West(player);
					mw.execute();
					System.out.println("player moves north");
					player.PlayerPosition();
				}
			}
			player.PlayerPosition();
			command m = new move_south(player);
			
			boolean t = m.undo();
			if (t == true) {
				player.X_cooridnate = 0;
				player.Y_coordinate = 0;
			}
			player.PlayerPosition();
			}
			
		}
		
		
		
		
	    


