package primeThreads.store;

import java.util.Stack;

public class Results implements StdoutDisplayInterface {

	private static final Logger LOGGER = new Logger();

    // appropriate data structure as private data member
	Stack primeList = new Stack() {
		public E push(E item) {	
		LOGGER.writeMessage("New Entry:" + Integer.toString(item) + "is added", Logger::DebugLevel::ENTRY);
		super.push(item);
		}
	};	

    // appropriate method to save prime number to the data structure

    public void writeSumToScreen() {
	int sum = computeSum();
	System.out.println("The sum of all the prime numbers is: %d", sum);
    }
   private int computeSum() {
	int sum = 0;
	for (int i : primeList)
		LOGGER.writeMessage("Content: " + Integer.toString(i), Logger::DebugLevel::CONTENT);
		sum += i;
	return sum;
   }
} 


