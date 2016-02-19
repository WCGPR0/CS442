
package primeThreads.util;

public class Logger{


    public static enum DebugLevel { CONTENT, ENTRY, RUN, CONSTRUCTOR 
                                   };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	  case 1: debugLevel = DebugLevel.CONTENT; break;
	  case 2: debugLevel = DebugLevel.ENTRY; break;
	  case 3: debugLevel = DebugLevel.RUN; break;
	  case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
