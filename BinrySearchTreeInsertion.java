package binarytree;

public class BinrySearchTreeInsertion {

	TreeNode4 root;

	    // Constructor
	    public BinrySearchTreeInsertion() {
	        root = null;
	    }

	    // Function to insert a node in the tree
	    public void insert(int val) {
	        root = insertRecursive(root, val);
	    }

	    // Recursive function to insert nodes in the tree
	    private TreeNode4 insertRecursive(TreeNode4 root, int val) {
	        if (root == null) {
	            root = new TreeNode4(val);
	            return root;
	        }

	        if (val < root.val) {
	            root.left = insertRecursive(root.left, val);
	        } else if (val > root.val) {
	            root.right = insertRecursive(root.right, val);
	        }

	        return root;
	    }

	    // Function to find a node in the tree
	    public boolean findNode(int val) {
	        return findNodeRecursive(root, val);
	    }

	    // Recursive function to find a node in the tree
	    private boolean findNodeRecursive(TreeNode4 root, int val) {
	        if (root == null) {
	            return false;
	        }

	        if (root.val == val) {
	            return true;
	        }

	        if (val < root.val) {
	            return findNodeRecursive(root.left, val);
	        } else {
	            return findNodeRecursive(root.right, val);
	        }
	    }

	    // Function to print the tree in inorder traversal
	    public void printInorder() {
	        System.out.print("In-order traversal: ");
	        inOrderRecursive(root);
	        System.out.println();
	    }

	    // Recursive function to perform inorder traversal
	    private void inOrderRecursive(TreeNode4 root) {
	        if (root != null) {
	            inOrderRecursive(root.left);
	            System.out.print(root.val + " ");
	            inOrderRecursive(root.right);
	        }
	    }
	}
