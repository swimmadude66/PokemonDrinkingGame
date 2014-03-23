package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class VictoryTile extends Tile {

	public VictoryTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		c.win(p);
	}

}
