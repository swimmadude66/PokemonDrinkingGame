package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class SnorlaxTile extends Tile {

	public SnorlaxTile(Control cont, int ID) {
		super(cont, ID);
	}

	@Override
	public void landed(Player p){
		super.landed(p);
		boolean found = false;
		for(Tile t : p.history){
			if(t.id == 56)
				found = true;
		}
		if(!found){
			p.skipTurn +=3;
		}
	}
}
