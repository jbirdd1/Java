
public class Player {
	int number = 0; // where the guess goes
	
	public void guess() {
		number = (int) (Math.random() * 100);
		System.out.println("I'm guessing " + number);
	}

}