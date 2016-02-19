
package primeThreads.threadMgmt;

public class CreateWorkers extends Thread {
	FileProcessor myFileProcessor;
	Results resultsInstance;
	IsPrime primeInstance;

	private static final Logger LOGGER = new Logger();

	CreateWorkers(FileProcessor myFileProcessor, Results resultsInstance, IsPrime primeInstance) {
		this.myFileProcessor = myFileProcessor;
		this.resultsInstance = resultsInstance;
		this.primeInstance = primeInstance;

		LOGGER.writeMessage("CreateWorkers Constructed", Logger::DebugLevel::FOUR)
	}
    // this class has the method startWokers(...)
	public void startWorkers(int NUM_THREADS) {	
		for (int i = 0; i < NUM_THREADS; ++i) {
			((new Thread(new WorkerThread(myFileProcessor, resultsInstance, primeInstance))).start()).join(); 
		}
	}
}
