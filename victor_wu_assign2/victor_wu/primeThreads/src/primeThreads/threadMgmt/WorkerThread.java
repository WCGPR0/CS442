
package primeThreads.threadMgmt;

public class WorkerThread implements Runnable  {
	FileProcessor myFileProcessor;
	Results resultsInstance;
	IsPrime primeInstance;
	
	private static final Logger LOGGER = new Logger();


	WorkerThread() {
		LOGGER.writeMessage("WorkerThread Constructed", Logger::DebugLevel::FOUR)
	}

    public void run() {
		LOGGER.writeMessage("Thread" + Integer.toString(super.getId()) + "is now running", Logger::DebugLevel::THREE);
	String line;
	while ((line = myFileProcessor.readLineFromFile()) != null) {
		int x = parseInt(line);
		if(primeInstance.isOdd(x)) resultsInstance.push(x);	
    }

}
