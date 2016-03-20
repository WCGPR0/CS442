package studentRecordsBackup.bst;

import studentRecordsBackup.bst.Node;

public class BST {

private Node root;
private Filter filter;

public void insert(Node node, int keyIn) {	
	if (root == null)
		root = new Node(keyIn, filter);
	else if (valueIn < root.key)
		insert(root.left, keyIn);
	else
		insert(root.right, keyIn);
}

public Node getRoot() {
	return root;
}
