package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class CeladonGymTile extends Tile {

	public CeladonGymTile(Control cont, int ID) {
		super(cont, ID);
	}
	@Override
	public void landed(Player p){
		super.landed(p);
		int roll = c.roll();
		if(roll%2 ==1){
			p.skipTurn +=2;
		}
	}
}
