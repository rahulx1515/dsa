class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
    
class LinkedList{
    Node head;

    public Node getMiddleNode(){
        if(this.head == null){
            return null;
        }
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast;
    }


    public boolean search(int target){
        Node ptr = this.head;
        while(ptr!=null){
            if(ptr.data == target){
                return true;
            }
            ptr=ptr.next;
        }
        return false;
    }


    public void addFirst(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            return;
        }
        Node ptr = this.head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }

    public boolean compare(LinkedList tl){
        Node ptr1 = this.head;
        Node ptr2 = tl.head;
        while(ptr1 != null && ptr2 != null){
            if(ptr1.data != ptr2.data){
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // if(ptr1 == null && ptr2 == null){
        //     return true;
        // } else {
        //     return false;
        // }
        return ptr1 == null && ptr2 == null;
    }

}

public class basics {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(30);
        l1.addFirst(50);
        l1.getMiddleNode();

        System.out.println("Search 20: " + l1.search(20));
    }
}

