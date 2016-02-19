package primeThreads.store;

import java.util.Stack;

import primeThreads.util.Logger;

public class Results implements StdoutDisplayInterface {

	public Results() {
	LOGGER.writeMessage("Results Constructed", Logger.DebugLevel.CONSTRUCTOR);
	}
	private static final Logger LOGGER = new Logger();

    // appropriate data structure as private data member
	Stack<Integer> primeList = new Stack<Integer>() {
		public int push(int item) {	
		LOGGER.writeMessage("New Entry:" + Integer.toString(item) + "is added", Logger.DebugLevel.ENTRY);
		return super.push(item);
		};
	};	

    // appropriate method to save prime number to the data structure

    public void writeSumToScreen() {
	int sum = computeSum();
	System.out.println("The sum of all the prime numbers is:" + sum);
    }
   private int computeSum() {
	int sum = 0;
	for (int i : primeList){
		LOGGER.writeMessage("Content: " + Integer.toString(i), Logger.DebugLevel.CONTENT);
		sum += i;
	}
	return sum;
   }
   public void add(int element) {
	primeList.push(element);
  }
} 


