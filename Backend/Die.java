package Backend;

import java.util.Random;

public class Die {
	Random r;
	
	public Die(){
		r = new Random();
	}
	
	public int rollDie(){
		return (Math.abs(r.nextInt())%6)+1;
	}
}
