import java.util.*;

public class MaxWidthBinaryTree {

    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    class Pair {
        Node node;
        long c;

        Pair(Node node, long c) {
            this.node = node;
            this.c = c;
        }
    }

    Node root;

    void createTree() {
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

    int widthOfBinaryTree(Node root) {

        if (root == null) {
            return 0;
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int width = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            long start = q.peek().c;
            long end = start;

            for (int i = 0; i < size; i++) {

                Pair p = q.poll();

                end = p.c;

                if (p.node.left != null) {
                    q.add(new Pair(p.node.left, 2 * p.c));
                }

                if (p.node.right != null) {
                    q.add(new Pair(p.node.right, 2 * p.c + 1));
                }
            }

            width = Math.max(width, (int)(end - start + 1));
        }

        return width;
    }

    public static void main(String[] args) {

        MaxWidthBinaryTree tree = new MaxWidthBinaryTree();

        tree.createTree();

        System.out.println("Maximum Width: " +
                tree.widthOfBinaryTree(tree.root));
    }
}