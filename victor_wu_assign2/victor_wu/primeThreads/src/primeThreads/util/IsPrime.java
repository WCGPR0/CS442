
package primeThreads.util;

public class IsPrime {

private static final Logger LOGGER = new Logger();

	IsPrime() {
		LOGGER.writeMessage("IsPrime Constructed", Logger::DebugLevel::FOUR)
	}

	boolean checkPrime(int x) {
		assert x > 0;
		//Basic cases: return false for 0, 1, and return true for 2, 3
		if (x < 4) return x < 2 ? false : true;
		//If x mods 2 or 3, returns false
		if (x & 1 == 0 || x % 3 == 0) return false;
		long end = (long) Math.sqrt(x) + 1;
		for (long i = 6L; i < end; i += 6)
			if (x%(i-1) == 0 || x%(i+1) == 0) return false;
		return true;
	}
	boolean isOdd(int x) {
		return x & 1 == 0 ? false : true;
	}
}
