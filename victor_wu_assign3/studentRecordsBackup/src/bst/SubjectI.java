/*
 * SubjectI.java
 */
package studentRecordsBackup.bst;

import java.util.Observable;

public class SubjectI extends Observable
{
	public void registerObserver(Observer o, Filter f) {
		addObserver(o);
		filter = f;	
	}
	public void removeObserver(Observer o);	
}

