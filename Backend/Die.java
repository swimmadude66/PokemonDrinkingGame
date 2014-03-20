package Backend;

import java.util.Random;

public class Die {
	Random r;
	private int seed;
	
	public Die(){
		r = new Random();
	}
	
	private int rollDie(){
		r.setSeed(seed);
		seed = r.nextInt();
		return (r.nextInt()%6)+1;
	}
}
