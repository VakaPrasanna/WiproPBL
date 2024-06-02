import java.util.Random;

abstract class Instrument {
	abstract void play();
}

class Piano extends Instrument {

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing tan tan tan tan ");
	}
	
}

class Flute extends Instrument {

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing toot toot toot toot ");	
	}
	
}

class Guitar extends Instrument {

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing tin tin tin ");
	}
	
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instrument[] instruments = new Instrument[10];
		
		Random random = new Random();
	    
	    	for (int i = 0; i < 10; i++) {
	    		int randomNum = random.nextInt((3 - 1) + 1) + 1;
	    	
	    		if (randomNum == 1)
	    			instruments[i] = new Piano();
	    		else if (randomNum == 2)
	    			instruments[i] = new Flute();
	    		else if (randomNum == 3)
	    			instruments[i] = new Guitar();
	    	}
		
	    	for (int i = 0; i < 10; i++) {
            		if(instruments[i] instanceof Piano)
                		System.out.print("Instrument " + i + " is of type Piano, ");
            		if(instruments[i] instanceof Flute)
                		System.out.print("Instrument " + i + " is of type Flute, ");
            		if(instruments[i] instanceof Guitar)
                		System.out.print("Instrument "+ i + " is of type Guitar, ");
            		instruments[i].play();
            	}
	}

}

