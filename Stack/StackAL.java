import java.util.ArrayList;

class MyStack {

    private ArrayList<Integer> al;
    private int size;

    public MyStack(int size) {
        this.size = size;
        al = new ArrayList<>();
    }

    public void push(int item) {
        if (al.size() == size) {
            System.out.println("Stack overflow");
            return;
        }
        al.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return al.remove(al.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return al.get(al.size() - 1);
    }

    public boolean isEmpty() {
        return al.size() == 0;
    }
}

public class StackAL {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element after pop: " + stack.peek());
    }
}
