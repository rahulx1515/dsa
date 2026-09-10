class Node {
    int data;
    Node left;
    Node right; 

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    
    }

    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    
    }
}

public class basics {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println("Inorder Traversal:");
        root.inorder(root);
        System.out.println("\nPreorder Traversal:");
        root.preorder(root);
        System.out.println("\nPostorder Traversal:");
        root.postorder(root);
    }
    
}