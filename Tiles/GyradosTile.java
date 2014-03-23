package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class GyradosTile extends Tile {

	public GyradosTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		text = "Gyrados used Dragon Rage! Drink 6, unless you landed on Magikarp in which case give 6, and if you landed on both Magikarp give 9.";
		int count = 0;
		for(Tile t: p.history){
			if(t.id == 75 || t.id==31){
				count++;
			}
		}
		if(count == 0)
			text+="<br /><br />Drink 6";
		else if(count == 1)
			text+="<br /><br />Give 6";
		else
			text+="<br /><br />Give 9";
		
	}

}
