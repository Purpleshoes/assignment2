package cse360assign2;

public class AddingMachine {

	private int total;
	private String log;
	//Init values for integer total and string log
	public AddingMachine () {
		total = 0;
		log = "0";
	}
	//Returns integer total of add and subtract methods previously ran
	public int getTotal () {
		return total;
	}
	//Adds parameter to total. Adds operation to log
	public void add (int value) {
		total += value;
		log += " + " + value;
	}
	//Subtracts parameter from total. Adds operation to log
	public void subtract (int value) {
		total -= value;
		log += " - " + value;
	}
	//Returns recorded add and subtract operations	
	public String toString () {
		return log;
	}
	//Resets total and log to initial values of 0
	public void clear() {
		total = 0;
		log = "0";
	}
}
