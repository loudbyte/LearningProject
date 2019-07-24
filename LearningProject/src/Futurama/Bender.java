package Futurama;

public class Bender {

	public static void main(String[] args) {
		Multik heroes[] = new Multik[2];
		heroes[0] = new Fry();
		heroes[1] = new Rick();
		
		for(int i = 0; i < heroes.length; ++i) {
			heroes[i].mult();
		}
	}
	
}
