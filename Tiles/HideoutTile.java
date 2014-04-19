package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class HideoutTile extends Tile {

	public HideoutTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		int roll = c.roll();
		if(roll == 1){
			p.skipTurn +=3;
		}
		
	}

}
