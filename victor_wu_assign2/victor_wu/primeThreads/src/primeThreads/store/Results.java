package primeThreads.store;

import java.util.Stack;

import primeThreads.util.Logger;

public class Results implements StdoutDisplayInterface {
	Stack<Integer> primeList = new Stack<Integer>();
	int sum = 0;
	public Results() {
	LOGGER.writeMessage("Results Constructed", Logger.DebugLevel.CONSTRUCTOR);
	}
	private static final Logger LOGGER = new Logger();

    // appropriate data structure as private data member
	
		
		/*
		public int push(int item) {	
		
		return super.push(item);
		}
		*/
		
	

    // appropriate method to save prime number to the data structure

    public void writeSumToScreen() {
    	//System.out.println(primeList.size() + " size");
	for (int i : primeList) {
		Logger.writeMessage("Content: " + Integer.toString(i), Logger.DebugLevel.CONTENT);
		//System.out.println(sum);
		sum += i;
	}
	System.out.println("The sum of all the prime numbers is:" + sum);
    }
   public void add(int element) {
	primeList.push(element);
	Logger.writeMessage("New Entry:" + Integer.toString(element) + "is added", Logger.DebugLevel.ENTRY);
  }
} 


