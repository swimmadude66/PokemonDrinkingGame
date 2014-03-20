package Managers;
import Backend.Player;

public class PlayerManager {
	
	public void move(Player p, int spaces){
		p.loc+=spaces;
	}
}
