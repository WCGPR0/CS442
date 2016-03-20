/*
 * ObserverI.java
 */
package studentRecordsBackup.bst;

import java.util.Observer;

public class ObserverI extends Observer
{

	public void update(Observable o, Object arg) {	
		key = o.key;	
	}
}

