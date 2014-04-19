package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class ShellderTile extends Tile {

	public ShellderTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		for(Player play : c.players){
			if(play.loc >= 119){
				p.loc = 119;
				c.land();
				break;
			}
		}
	}

}
