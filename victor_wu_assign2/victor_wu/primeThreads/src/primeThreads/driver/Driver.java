package primeThreads.driver;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

//From package primeThreads
import primeThreads.util.Logger;
import primeThreads.util.IsPrime;
import primeThreads.util.FileProcessor;
import primeThreads.threadMgmt.CreateWorkers;
import primeThreads.threadMgmt.WorkerThread;
import primeThreads.store.Results;

public class Driver{

private static final Logger LOGGER = new Logger();

	public static void main(String args[]) {

		System.out.println("\n The args[0] is: " + args[0]);
		/* Assert that the provided args[0] is okay */
	
		FileProcessor myFileProcessor = null;	
		Results resultsInstance;
		IsPrime primeInstance;
		
		if (args[0].equals("--help") || args[0].equals("-h")) System.out.println("Usage [input] [threads] [debug]");
		else if (args.length != 3) throw new IllegalArgumentException("Please use --help for usage information");
		else {
			int NUM_THREADS = Integer.parseInt(args[1]), DEBUG_VALUE = Integer.parseInt(args[2]);
			// Additional validation of command line arguments
			assert NUM_THREADS <= 5 && NUM_THREADS >= 1;
			assert DEBUG_VALUE <= 4 && DEBUG_VALUE >= 0;
			Logger.setDebugValue(DEBUG_VALUE);

			resultsInstance = new Results();
			primeInstance = new IsPrime();

			CreateWorkers workers = new CreateWorkers(myFileProcessor, resultsInstance, primeInstance);
			workers.startWorkers(NUM_THREADS);

				
		}
	} // end main(...)

} // end public class Driver

