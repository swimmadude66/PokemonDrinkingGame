package Tiles;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Backend.*;

public class PlayerChooseTile extends Tile {

	int skips;
	
	public PlayerChooseTile(Control cont, int ID, int skips) {
		super(cont, ID);
		this.skips = skips;
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		List<Player> choices= new ArrayList<Player>();
		choices.addAll(c.players);
		choices.remove(p);		
		Object[] options = choices.toArray();
		int n = JOptionPane.showOptionDialog(null,
			"Choose Your Victim",
			"Choose A Player", JOptionPane.DEFAULT_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[0]);
		Player play = choices.get(n);
		play.skipTurn += skips;
		if(skips == 0){
			int roll = c.roll();
			play.loc -=roll;
		}
			
	}

}
