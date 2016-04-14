package primeThreads.threadMgmt;

import primeThreads.util.Logger;
import primeThreads.util.FileProcessor;
import primeThreads.store.Results;
import primeThreads.util.IsPrime;

/**
 * the CreateWorkers class instantiates the FileProcessor,
 * Results, and IsPrime objects, logs the creation of the constructor
 * into the logger, and creates worker threads based on the number of threads
 * passed into the command line.
 */ 
public class CreateWorkers extends Thread {
	FileProcessor myFileProcessor;
	Results resultsInstance;
	IsPrime primeInstance;
	private static final Logger LOGGER = new Logger();

/**
 * createworkers constructor
 * @param myFileProcessorIn a FileProcessor object
 * @param resultsInstanceIn a resultsInstance object
 * @param primeInstanceIn a primeInstance object
 * instantiates these fields when a new CreateWorkers object is declared
 */
	public CreateWorkers(FileProcessor myFileProcessorIn, Results resultsInstanceIn, IsPrime primeInstanceIn) {
		this.myFileProcessor = myFileProcessorIn;
		this.resultsInstance = resultsInstanceIn;
		this.primeInstance = primeInstanceIn;

		Logger.writeMessage("CreateWorkers Constructed", Logger.DebugLevel.CONSTRUCTOR);
	}

/**
 * startWorkers method creates a new worker threads for every 
 * thread passed in as a parameter
 * the threads are then run synchronized
 * @param NUM_THREADS the number of threads passed in an as an argument
 * from the command line
 * @return nothing because the method is voided
 */
	public void startWorkers(int NUM_THREADS) {	
		for (int i = 0; i < NUM_THREADS; ++i) {
			(new Thread(new WorkerThread(myFileProcessor, resultsInstance, primeInstance))).run(); 
		}
	}
}
