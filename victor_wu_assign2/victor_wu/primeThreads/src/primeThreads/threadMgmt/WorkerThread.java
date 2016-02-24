package primeThreads.threadMgmt;

import primeThreads.util.FileProcessor;
import primeThreads.store.Results;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;

public class WorkerThread implements Runnable  {
	FileProcessor myFileProcessor;
	Results resultsInstance;
	IsPrime primeInstance;
	
	private static final Logger LOGGER = new Logger();


	public WorkerThread(FileProcessor myFileProcessor, Results resultsInstance, IsPrime primeInstance) {
		LOGGER.writeMessage("WorkerThread Constructed", Logger.DebugLevel.CONSTRUCTOR);
		this.myFileProcessor = myFileProcessor;
		this.resultsInstance = resultsInstance;
		this.primeInstance = primeInstance;
	}

    public void run() {
		LOGGER.writeMessage("Thread" + Long.toString(Thread.currentThread().getId()) + "is now running", Logger.DebugLevel.RUN);
		String line;
	while ((line = myFileProcessor.readLineFromFile()) != null) {
		int x = Integer.parseInt(line);
		if(primeInstance.isOdd(x)) resultsInstance.add(x);	
    		}	

	}
}
