package studentRecordsBackup.bst;

import java.util.Observable;
import java.util.Observer;

import studentRecordsBackup.util.Filter;
import studentRecordsBackup.bst.ObserverI;
import studentRecordsBackup.bst.SubjectI;

public class Node extends SubjectI implements ObserverI {
	int B_Number;

	protected Node left, right;
	private int key; 
	
	private Filter filter;

	Node(int keyIn, Filter filterIn) {
		key = keyIn;
		filter = filterIn;
	}
	
	public void change(int keyIn) {	
	key = keyIn;
	if (filter.check(key)) {	
		setChanged();
		notifyObservers();
	}	
	}

	public int getKey() {
		return key;
	}

	public void update(Observable o, Object arg) {
		key = ((Node)o).key;
	}

}
