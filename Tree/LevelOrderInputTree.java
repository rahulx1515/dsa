import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderInputTree {

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public LevelOrderInputTree() {
        CreateTree();
    }

    private void CreateTree() {
        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();

        if (item == -1) {
            return;
        }

        root = new Node(item);

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            Node temp = q.poll();

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            if (c1 != -1) {
                temp.left = new Node(c1);
                q.add(temp.left);
            }

            if (c2 != -1) {
                temp.right = new Node(c2);
                q.add(temp.right);
            }
        }
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        LevelOrderInputTree tree = new LevelOrderInputTree();

        System.out.println("Preorder:");
        tree.display();
    }
}