package Backend;
public class Tile {
	public int id;
	public boolean rollAgain;
	public boolean isStop;
	public boolean firstDone;
	public int skipTurn;
	public String text;
	
	public Tile(){
		id = -1;
		rollAgain = false;
		isStop = false;
		firstDone = false;
		skipTurn = 0;
		text="";		
	}
	
	@Override
	public String toString(){
		return text;
	}
	
}