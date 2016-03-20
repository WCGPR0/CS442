package studentRecordsBackup.bst;

import studentRecordsBackup.bst.Node;
import studentRecordsBackup.util.Filter;

public class BST {

private Node root;
private Filter filter;

public Node insert(Node node, int keyIn) {	
	while (root != null) {
	if (keyIn < root.getKey())	insert(root.left, keyIn);
	insert(root.right, keyIn);
	}
	root = new Node(keyIn, filter);
	return root;
}

public Node getRoot() {
	return root;
}
}
