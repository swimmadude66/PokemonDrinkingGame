package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class GameCornerTile extends Tile {

	public GameCornerTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		int roll = c.roll();
		if(roll != 3 && roll !=5){
			p.skipTurn +=2;
		}
	}

}
