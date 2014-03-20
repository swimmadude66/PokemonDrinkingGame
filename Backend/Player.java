package Backend;

import java.util.ArrayList;
import java.util.List;

public class Player {
	public enum Starter{
		BULBASAUR,
		CHARMANDER,
		SQUIRTLE;
	}
	
	public String name;
	public int loc;
	public int skipTurn;
	public boolean hitMagikarp;
	public boolean pokeFlute;
	public boolean masterBall;
	public Starter poke;
	public List<Integer> history;
	
	public Player(String n, int s){
		name = n;
		loc =0;
		skipTurn =0;
		hitMagikarp = false;
		poke = Starter.values()[s%3];
		history = new ArrayList<Integer>();
	}
	
}
