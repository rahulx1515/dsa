
class Node {
    int key;
    int height;
    Node left, right;

    Node(int key) {
        this.key = key;
        height = 1;
    }
}

public class AVL_Tree {

    static int height(Node n) {
        if (n == null) {
            return 0;
        }
        return n.height;
    }

    static int balance(Node n) {
        if (n == null) {
            return 0;
        }
        return height(n.left) - height(n.right);
    }

    // Right Rotation
    Node rightRotate(Node node) {
        Node a = node.left;
        Node b = a.right;

        a.right = node;
        node.left = b;

        node.height = Math.max(
            height(node.left), height(node.right)
        ) + 1;

        a.height = Math.max(
            height(a.left), height(a.right)
        ) + 1;

        return a;
    }

    // Left Rotation
    Node leftRotate(Node node) {
        Node a = node.right;
        Node b = a.left;

        a.left = node;
        node.right = b;

        node.height = Math.max(
            height(node.left), height(node.right)
        ) + 1;

        a.height = Math.max(
            height(a.left), height(a.right)
        ) + 1;

        return a;
    }

    // Insertion
    Node insert(Node node, int value) {

        // Step 1: Normal BST insertion
        if (node == null) {
            return new Node(value);
        }

        if (value < node.key) {
            node.left = insert(node.left, value);
        } else if (value > node.key) {
            node.right = insert(node.right, value);
        } else {
            return node; // No duplicates
        }

        // Step 2: Update height
        node.height = Math.max(
            height(node.left), height(node.right)
        ) + 1;

        // Step 3: Calculate balance factor
        int bf = balance(node);

        // Case 1: LL
        if (bf > 1 && value < node.left.key) {
            return rightRotate(node);
        }

        // Case 2: RR
        if (bf < -1 && value > node.right.key) {
            return leftRotate(node);
        }

        // Case 3: LR
        if (bf > 1 && value > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Case 4: RL
        if (bf < -1 && value < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Step 4: Return unchanged root
        return node;
    }

    // Inorder Traversal
    void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        AVL_Tree tree = new AVL_Tree();
        Node root = null;

        int[] values = {30, 20, 10, 25, 28, 27};

        for (int value : values) {
            root = tree.insert(root, value);
        }

        System.out.print("Inorder: ");
        tree.inorder(root);

        System.out.println("\nRoot: " + root.key);
    }
}
