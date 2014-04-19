package Tiles;

import java.util.List;

import javax.swing.JOptionPane;

import Backend.Control;
import Backend.Player;
import Backend.Tile;

public class PokedexTile extends Tile {

	public PokedexTile(Control cont, int ID) {
		super(cont, ID);
	}
	
	@Override
	public void landed(Player p){
		super.landed(p);
		List<Tile> choices= p.history;		
		Object[] options = choices.toArray();
		int n = JOptionPane.showOptionDialog(null,
			"Choose A Tile",
			"Choose A Tile", JOptionPane.DEFAULT_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[0]);
		Tile t= p.history.get(n);
		t.id = id;
		c.tiles.set(id, t);
	}

}
