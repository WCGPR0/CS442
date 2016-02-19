package primeThreads.driver;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class Driver{

private static final Logger LOGGER = new Logger();

	public static void main(String args[]) {

		System.out.println("\n The args[0] is: " + args[0]);
		/* Assert that the provided args[0] is okay */
	
		FileProcessor myFileProcessor = null;	
		
		if (args[0].equals("--help") || args[0].equals("-h")) printf("Usage [input] [threads] [debug]");
		else if (args.length != 3)	throw IllegalArgumentException("Please use --help for usage information");
		else {
			// Additional validation of command line arguments
			assert args[1] <= 5 && args[1] >= 1;
			assert args[2] <= 4 && args[2] >= 0;

			int NUM_THREADS = args[1], DEBUG_VALUE = args[2];
			Logger.setDebugValue(DEBUG_VALUE);

			CreateWorkers workers = new CreateWorkers();
			workers.startWorkers(NUM_THREADS);

				
		}
	} // end main(...)

} // end public class Driver

