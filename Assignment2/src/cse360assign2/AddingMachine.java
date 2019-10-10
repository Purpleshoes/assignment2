package cse360assign2;

public class AddingMachine {

	private int total;
	private String log;
	
	public AddingMachine () {
		total = 0;
		log = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		log += " + " + value;
	}
	
	public void subtract (int value) {
		total -= value;
		log += " + " + value;
	}
		
	public String toString () {
		return log;
	}

	public void clear() {
		log = "0";
	}
}
