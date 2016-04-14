package primeThreads.driver;

// import statements

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

	/**
	 * Some validation is done at the command line to check that 
	 * the right amount of arguments are getting passed in. If the number
	 * of threads is between 1 and 5, and the debug value is between 1 and
	 * 4, all the objects are created. The start workers method is called 
	 * @param String
	 * @return String
	 */
	public static void main(String args[]) throws Exception {

		//System.out.println("\n The args[0] is: " + args[0]);
		//System.out.println("\n The args[1] is: " + args[1]);
		//System.out.println("\n The args[2] is: " + args[2]);
		/* Assert that the provided args[0] is okay */
		
	/**
	 * Declares FileProcessor, Results, IsPrime, CreateWorkers objects
	 * to be null
	*/	
		FileProcessor myFileProcessor = null;	
		Results resultsInstance = null;
		IsPrime primeInstance = null;
		CreateWorkers workerInstance = null;
		
		//command line validation
		
		try {
		
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		
		if (args[0].equals("--help") || args[0].equals("-h")) System.out.println("Usage [input] [threads] [debug]");
		
		/*
		if (args.length != 3) {
			System.out.println(("Please type in --help for usage information"));
		}
		*/
		
		if(args[0].equals(" ") || args[0].isEmpty()) System.out.println("Please type --help");
		if(args[0] != "*.txt") System.out.println("Please type --help");
		
		if((a < 1 && a > 5) || (b < 1 || b > 4))   {
			System.out.println("Please type in --help for usage information");
		}
		
		//if command line arguments pass, do this
		else {	
			int NUM_THREADS = Integer.parseInt(args[1]), DEBUG_VALUE = Integer.parseInt(args[2]);
				
			// Additional validation of command line arguments
			
			//assert NUM_THREADS <= 5 && NUM_THREADS >= 1;
			//assert DEBUG_VALUE <= 4 && DEBUG_VALUE >= 0;
			Logger.setDebugValue(DEBUG_VALUE);

		/**
		 * create the resultsInstance, primeInstance, 
		 * myFileProcessor objects
		 */
			resultsInstance = new Results();
			primeInstance = new IsPrime();
			myFileProcessor = new FileProcessor(args[0]);

		/**
		 * create CreateWorkers object
		 * @param myFileProcessor the object passed in
		 * @param resultsInstance the object passed in
		 * @param primeInstance the object passed in
		 */
			CreateWorkers workers = new CreateWorkers(myFileProcessor, resultsInstance, primeInstance);
			workers.startWorkers(NUM_THREADS);
			resultsInstance.writeSumToScreen();

				
		}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	} // end main(...)

} // end public class Driver

