package primeThreads.util;

import primeThreads.util.Logger;

public class IsPrime {

private static final Logger LOGGER = new Logger();

	public IsPrime() {
		LOGGER.writeMessage("IsPrime Constructed", Logger.DebugLevel.CONSTRUCTOR);
	}

	public boolean isOdd(int x) {
		return (x & 1) == 0 ? false : true;
	}
}
