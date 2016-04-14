package studentRecordsBackup.bst;

import studentRecordsBackup.bst.Node;
import studentRecordsBackup.util.Filter;
import java.util.LinkedList;

public class BST {

private Node root;
private Filter filter;

public Node insert(Node node, int keyIn) {
	if (node != null) {
//		System.out.println("WORKS" + node);
		if (keyIn < node.getKey())	insert(node.left, keyIn);
		else	insert(node.right, keyIn);
	}
	else {
		node = new Node(keyIn, filter);
		if (root == null) root = node;
//		else System.err.println("Non-nil root but nil node error. Proceed with caution." + root);
	}
	return node;
}

public LinkedList<String> visitAllNodes() {
	LinkedList<String> results = new LinkedList<String>();
	traverse(root, results);
        return results;	
}

public void traverse(Node node, LinkedList<String> results) {
	if (node == null) return;
	results.add(node.toString());
	if (node.left != null)
		traverse(node.left, results);
	if (node.right != null)
		traverse(node.right, results);	
}

public Node getRoot() {
	return root;
}
}
