package Tiles;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class ExeggutorTile extends Tile {

	public ExeggutorTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		List<Integer> choices = new ArrayList<Integer>();
		for(int i=0; i<3; i++){	
			Object[] options = {1,2,3,4,5,6};
			int choice = (int)JOptionPane.showInputDialog(null,
				"Choose A Number",
				"Choose A Number", JOptionPane.PLAIN_MESSAGE,
				null,
				options,
				options[0]);
			choices.add(choice);
		}
		int roll = c.roll();
		Player play;
		if(choices.contains(roll)){
			List<Player> playrs= c.players;
			choices.remove(p);		
			Object[] options = choices.toArray();
			int n = JOptionPane.showOptionDialog(null,
				"Choose Your Victim",
				"Choose A Player", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]);
			play = playrs.get(n);
		}
		else{
			play = p;
		}
		play.skipTurn +=3;
	}

}
