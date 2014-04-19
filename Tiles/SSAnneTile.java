package Tiles;

import javax.swing.JOptionPane;

import Backend.*;

public class SSAnneTile extends Tile {

	public SSAnneTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		Object[] options = {"Take 2 Drinks, Skip 1 Turn","Take 1 Drink, Skip 2 Turns"};
		int n = JOptionPane.showOptionDialog(null,
			"Choose Your Path",
			"SS. ANNE", JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[0]);
		if(n==JOptionPane.YES_OPTION){
			p.skipTurn++;
		}
		else{
			p.skipTurn +=2;
		}
	}

}
