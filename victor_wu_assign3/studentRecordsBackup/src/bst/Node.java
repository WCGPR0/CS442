package studentRecordsBackup.bst;

import java.util.Observable;
import java.util.Observer;

import studentRecordsBackup.util.Filter;
import studentRecordsBackup.bst.ObserverI;
import studentRecordsBackup.bst.SubjectI;

public class Node implements ObserverI, SubjectI {
	int B_Number;

	private Node next;
	private int key; 
	
	private Filter filter;

	Node(int keyIn, filterIn) {
		key = keyIn;
		filter = filterIn;
	}
	
	public void insert(int keyIn) {
	next = new Node(key);
	next.key = keyIn;
	if (filter.check(next.key)) {	
		setChanged();
		notifyObservers();
	}	
	}


}
