/*
 * SubjectI.java
 */
package studentRecordsBackup.bst;

import java.util.Observable;
import java.util.Observer;
import studentRecordsBackup.util.Filter;

public abstract class SubjectI extends Observable
{
	Filter filter;
	public void registerObserver(Observer o, Filter f) {
		addObserver(o);
		filter = f;	
	}
	public void removeObserver(Observer o) { }
}

