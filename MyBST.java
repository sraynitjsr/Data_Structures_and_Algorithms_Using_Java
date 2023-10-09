import java.util.*;

class Node {
	int key;
	Node left, right;
	Node(int item) {
		key = item;
		left = right = null;
	}
}

class MyBST {
	Node root;
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}
	Node insert(Node node, int key) {
		if (node == null)
			return new Node(key);
		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
		return node;
	}
	Node deleteNode(Node root, int key) {
		if (root == null)
			return root;
		if (root.key > key) {
			root.left = deleteNode(root.left, key);
			return root;
		} else if (root.key < key) {
			root.right = deleteNode(root.right, key);
			return root;
		}
		if (root.left == null) {
			Node temp = root.right;
			return temp;
		} else if (root.right == null) {
			Node temp = root.left;
			return temp;
		}
		else {

			Node succParent = root;
			Node succ = root.right;
			while (succ.left != null) {
				succParent = succ;
				succ = succ.left;
			}
			if (succParent != root)
				succParent.left = succ.right;
			else
				succParent.right = succ.right;
			root.key = succ.key;
			return root;
		}
	}
	public static void start() {
		BST tree = new BST();
		tree.root = tree.insert(tree.root, 30);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 50);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 40);

		System.out.print("Original BST => ");
		tree.inorder(tree.root);

		System.out.println("\n\nDelete a Leaf Node => 20");
		tree.root = tree.deleteNode(tree.root, 20);
		System.out.print("Modified BST tree after deleting Leaf Node =>\n");
		tree.inorder(tree.root);

		System.out.println("\n\nDelete Node with single child => 70");
		tree.root = tree.deleteNode(tree.root, 70);
		System.out.print("Modified BST tree after deleting single child Node => \n");
		tree.inorder(tree.root);
		
		System.out.println("\n\nDelete Node with both child => 50");
		tree.root = tree.deleteNode(tree.root, 50);
		System.out.print("Modified BST tree after deleting both child Node => \n");
		tree.inorder(tree.root);
	}
}
