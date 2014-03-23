package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class AbraTile extends Tile{
	
	public AbraTile(Control cont, int ID){
		super(cont,ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		int roll = c.roll();
		if(roll%2 == 0)
			c.move(2);
		else
			c.move(-2);

	}
}
