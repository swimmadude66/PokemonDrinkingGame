package Tiles;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class CinnabarGymTile extends Tile {

	public CinnabarGymTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		text = "Cinnabar Gym: Roll die. Even roll again. Odd, drink twice as many evens rolled.";
		c.frame.punishment.setText("<html>"+text+"</html>");
		int roll = c.roll();
		int count = 0;
		while(roll%2 == 0){
			count++;
			p.rollAgain = true;
			roll = c.roll();
		}
		this.text+="<br /><br />Drink "+count*2;
	}

}
