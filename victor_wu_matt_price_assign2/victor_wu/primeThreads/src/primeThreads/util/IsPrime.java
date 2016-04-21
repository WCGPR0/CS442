package primeThreads.util;

import primeThreads.util.Logger;

/**
 * IsPrime class has an isOdd method that returns true 
 * if odd, and false if even
 */
public class IsPrime {

private static final Logger LOGGER = new Logger();

/**
 * IsPrime constructor logs the creation of the constructor
 */
	public IsPrime() {
		Logger.writeMessage("IsPrime Constructed", Logger.DebugLevel.CONSTRUCTOR);
	}

/**
 * isOdd method returns true if input is odd, and false otherwise
 * @param int x the input from the file
 * @return boolean false or true
 */
	public boolean isOdd(int x) {
		return (x & 1) == 0 ? false : true;
	}
}
