package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class OddishTile extends Tile {

	public OddishTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		int loc = p.loc;
		for(Player play : c.players){
			if(play.loc<loc+3 && play.loc>loc-3){
				play.loc = p.loc;
			}
		}
	}

}
