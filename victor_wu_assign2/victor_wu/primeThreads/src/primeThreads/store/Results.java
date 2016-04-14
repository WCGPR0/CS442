package primeThreads.store;

import java.util.Stack;

import primeThreads.util.Logger;

/**
 * implements a stack to hold the values from the input.txt
 * there's two methods in this class, add and writeSumToScreen
 */
 
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

/**
 * this method loops through every integer in the stack
 * logs it, and calculates the sum iteratively
 * It prints out the final sum with a message
 * @param nothing because it's void
 * @return nothing
 */
    public void writeSumToScreen() {
    	//System.out.println(primeList.size() + " size");
	for (int i : primeList) {
		Logger.writeMessage("Content: " + Integer.toString(i), Logger.DebugLevel.CONTENT);
		//System.out.println(sum);
		sum += i;
	}
	System.out.println("The sum of all the prime numbers is:" + sum);
    }
/**
 * this method adds an element from the input
 * and pushes it onto the stack
 * the logger logs this entry into memory
 * @param element this element is a number from input.txt
 * @return nothing because it's a voided method
 */
   public void add(int element) {
	primeList.push(element);
	Logger.writeMessage("New Entry:" + Integer.toString(element) + "is added", Logger.DebugLevel.ENTRY);
  }
} 


