package primeThreads.threadMgmt;

import primeThreads.util.Logger;
import primeThreads.util.FileProcessor;
import primeThreads.store.Results;
import primeThreads.util.IsPrime;

public class CreateWorkers extends Thread {
	FileProcessor myFileProcessor;
	Results resultsInstance;
	IsPrime primeInstance;
	private static final Logger LOGGER = new Logger();

	public CreateWorkers(FileProcessor myFileProcessorIn, Results resultsInstanceIn, IsPrime primeInstanceIn) {
		this.myFileProcessor = myFileProcessorIn;
		this.resultsInstance = resultsInstanceIn;
		this.primeInstance = primeInstanceIn;

		Logger.writeMessage("CreateWorkers Constructed", Logger.DebugLevel.CONSTRUCTOR);
	}
    // this class has the method startWokers(...)
	public void startWorkers(int NUM_THREADS) {	
		for (int i = 0; i < NUM_THREADS; ++i) {
			(new Thread(new WorkerThread(myFileProcessor, resultsInstance, primeInstance))).run(); 
		}
	}
}
