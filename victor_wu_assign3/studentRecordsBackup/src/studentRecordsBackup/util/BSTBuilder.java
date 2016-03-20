package studentRecordsBackup.util;

import studentRecordsBackup.bst.BST;
import studentRecordsBackup.bst.Node;

public class BSTBuilder {
	protected BST bst;
	
	public BST getBST() {	return bst;	}
	public void createNewBSTProduct() {	bst = new BST();	}

	public Node buildNode(int keyIn) {
		return bst.insert(bst.getRoot(), keyIn);	
	}	
}
