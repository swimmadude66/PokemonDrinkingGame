package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class MarowakTile extends Tile {

	public MarowakTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		text = "Marowak used Bonemerang! If you landed on Cubone, give 3 drinks. Otherwise, take 3.";
		boolean cubone = false;
		for(Tile t : p.history){
			if(t.id == 51){
				cubone =true;
			}
		}
		if(cubone)
			this.text +="<br /><br />"+"You HAVE landed on cubone";
		else
			this.text +="<br /><br />"+"You HAVE NOT landed on cubone";
		
		c.frame.punishment.setText("<html>"+text+"</html>");
	}

}
