package studentRecordsBackup.util;

import studentRecordsBackup.bst.BST;
import studentRecordsBackup.bst.Node;

import java.util.LinkedList;
import java.util.ListIterator;

public class BSTBuilder {
	protected BST bst;
	
	public BST getBST() {	return bst;	}
	public void createNewBSTProduct() {	bst = new BST();	}

	public Node buildNode(int keyIn) {
		return bst.insert(bst.getRoot(), keyIn);	
	}	
	public String toString() {
	/*	LinkedList<String> results = bst.visitAllNodes();
		ListIterator<String> listIterator = results.listIterator();
		String resultsString = "";
		while (listIterator.hasNext()) {
			resultsString += listIterator.next() + "\n";
		}	*/
		return bst.visitAllNodes().toString();
	}
}
