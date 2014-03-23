package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class TentacruelTile extends Tile {

	public TentacruelTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		for(int i=0; i<c.players.size();i++){
			if (c.players.get(i) == p){
				Player play = c.players.get((i+1)%c.players.size());
				play.mult = 0.5;
				break;
			}
		}
		
	}

}
