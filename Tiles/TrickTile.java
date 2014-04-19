package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class TrickTile extends Tile {

	public TrickTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		int roll = c.roll();
		if(roll%2==0)
			c.move(1);
		else
			c.move(2);
	}

}
