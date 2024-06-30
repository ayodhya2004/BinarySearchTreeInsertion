package binarytree;


	// Main class to test the BST implementation
	public class BinrySearchTreeInsertionMain {
	    public static void main(String[] args) {
	    	BinrySearchTreeInsertion tree = new BinrySearchTreeInsertion();

	        // Inserting the nodes to form the given BST
	        tree.insert(8);
	        tree.insert(3);
	        tree.insert(10);
	        tree.insert(1);
	        tree.insert(6);
	        tree.insert(14);
	        tree.insert(4);
	        tree.insert(7);
	        tree.insert(13);

	        // Insert the values 20 and 2
	        tree.insert(20);
	        tree.insert(2);

	        // Printing the in-order traversal of the tree
	        tree.printInorder();

	        // Finding nodes in the tree
	        int[] nodesToFind = {2, 20};
	        for (int val : nodesToFind) {
	            boolean found = tree.findNode(val);
	            System.out.println("Node " + val + " found: " + found);
	        }
	    }
	}