package Backend;
public class Tile {
	public int id;
	public boolean rollAgain;
	public boolean isStop;
	public boolean firstDone;
	public boolean moveAgain;
	public boolean zubat;
	public boolean tentacool;
	public int mult;
	public int move;
	public int skipTurn;
	public String text;
	
	public Control c;
	
	public Tile(Control cont, int ID){
		id = ID;
		mult = 1;
		rollAgain = false;
		isStop = false;
		firstDone = false;
		moveAgain = false;
		zubat = false;
		tentacool = false;
		skipTurn = 0;
		text="";
		c = cont; 
	}
	
	@Override
	public String toString(){
		return text;
	}
	
	public void landed(Player p){
		firstDone = true;
		p.rollAgain=rollAgain;
		p.moving = moveAgain;
		p.onZubat = zubat;
		p.onTentacool = tentacool;
		p.mult=mult;
		p.skipTurn += skipTurn;
		if(move!=0)
			c.move(move);
	}
}