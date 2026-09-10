class Main{
    public static void main(String[] args) {
        doubly d = new doubly ();
        d.addFirst(10);
        d.addLast(20);
        d.insertAtPosition(15, 1);
        d.print();
    }
}

class Node{
    int data;
    Node next;
    Node prev;


    Node(int data){
        this.data = data;
    }
}


class doubly{
    Node head;
    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.prev = ptr;
    }

    void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }
    }

    void deleteLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.prev.next = null;
    } 
    
    void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 0){
            addFirst(data);
            return;
        }
        Node ptr = head;
        for(int i=0; i<position-1; i++){
            if(ptr == null){
                return;
            }
            ptr = ptr.next;
        }
        if(ptr == null){
            return;
        }
        newNode.next = ptr.next;
        newNode.prev = ptr;
        if(ptr.next != null){
            ptr.next.prev = newNode;
        }
        ptr.next = newNode;
    }

    void addFirst(int data){

        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void print(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        doubly d = new doubly ();
        d.addFirst(10);
        d.addLast(20);
        d.insertAtPosition(15, 1);
        d.print();

    }
}


