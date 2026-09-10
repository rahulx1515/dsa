class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack using Linked List
class MyStackLL {
    Node top;

    public MyStackLL() {
        top = null;
    }

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow !!");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !!");
            return -1;
        }
        return top.data;
    }

    // Check empty
    public boolean isEmpty() {
        return top == null;
    }
}

// Main class
class StackLL {

    public static void main(String[] args) {
        MyStackLL stack = new MyStackLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top after pop: " + stack.peek()); // 20
    }
}

