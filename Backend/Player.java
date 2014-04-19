package Backend;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Player {
	public enum Starter{
		BULBASAUR,
		CHARMANDER,
		SQUIRTLE;
	}
	
	public int id;
	public String name;
	public int loc;
	public int skipTurn;
	public double mult;
	public boolean rollAgain;
	public boolean moving;
	public boolean pokeFlute;
	public boolean masterBall;
	public boolean onZubat;
	public boolean onTentacool;
	public BufferedImage icon;
	public Starter poke;
	public List<Tile> history;
	
	public Player(String n){
		name = n;
		loc =0;
		skipTurn =0;
		mult = 1;
		moving = true;
		onZubat = false;
		onTentacool = false;
		history = new ArrayList<Tile>();
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	public void setStarter(int s){
		poke = Starter.values()[s%3];
	}
	
	public BufferedImage draw(){
		return icon;
	}
	
}
