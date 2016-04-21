package primeThreads.threadMgmt;

import primeThreads.util.FileProcessor;
import primeThreads.store.Results;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;

/**
 * the WorkerThreads class instantiates the FileProcessor,
 * Results, and IsPrime objects, logs the creation of the constructor
 * into the logger, reads the input line by line from a file, and adds it
 * to resultsInstance if it's odd
 * contains a run method to run the thread
 */
public class WorkerThread implements Runnable  {
	FileProcessor myFileProcessor;
	Results resultsInstance;
	IsPrime primeInstance;
	
	private static final Logger LOGGER = new Logger();

/**
 * WorkerThread constructor
 * @param myFileProcessorIn a FileProcessor object
 * @param resultsInstanceIn a resultsInstance object
 * @param primeInstanceIn a primeInstance object
 * instantiates these fields when a new WorkerThread object is declared
 */
	public WorkerThread(FileProcessor myFileProcessorIn, Results resultsInstanceIn, IsPrime primeInstanceIn) {
		LOGGER.writeMessage("WorkerThread Constructed", Logger.DebugLevel.CONSTRUCTOR);
		this.myFileProcessor = myFileProcessorIn;
		this.resultsInstance = resultsInstanceIn;
		this.primeInstance = primeInstanceIn;
	}

/**
 * run method reads the input file line by line, parses it, 
 * and adds it to the stack in resultsInstance if the input is odd
 * logger makes a note that the thread is running
 * @param void
 * @return void
 */
    public void run() {
		Logger.writeMessage("Thread" + Long.toString(Thread.currentThread().getId()) + "is now running", Logger.DebugLevel.RUN);
	String line;
	while ((line = myFileProcessor.readLineFromFile()) != null) {
		int x = Integer.parseInt(line);
		if(primeInstance.isOdd(x)) resultsInstance.add(x);	
    		}	

	}
}
