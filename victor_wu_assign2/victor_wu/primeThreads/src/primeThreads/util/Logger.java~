package primeThreads.util;

/**
 * class Logger that declares an enum of all debugging options
 * has the method setDebugValue that switches upon different debugLevels
 */
public class Logger{

/**
 * an enum with all the options
 */
    public static enum DebugLevel { CONTENT, ENTRY, RUN, CONSTRUCTOR 
                                   };

    private static DebugLevel debugLevel;

/**
 * sets the debug values
 * @param levelIn the debugValue that comes in as an arg from the command
 * line
 * if 1, logs the content
 * if 2, logs the entry
 * if 3, logs the run
 * if 4, logs the constructor
 */
    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	  case 1: debugLevel = DebugLevel.CONTENT; break;
	  case 2: debugLevel = DebugLevel.ENTRY; break;
	  case 3: debugLevel = DebugLevel.RUN; break;
	  case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	}
    }
/**
 * the setter
 * @param levelIn the debugValue
 */
    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    /**
     * the writeMessage method writes a message in system out
     * based on the debug level specified
     * @param message the string
     * @param levelIn the debugValue specified
     * @return void
     */
    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
