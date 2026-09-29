package LinkedList;

public class DoublyLL {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(9);
        list.insertFirst(7);
        list.insertFirst(4);
        list.insertFirst(1);
        list.insertLast(10);
        list.insert(3,14);
        list.display();
    }
    Node head;
    int size;
    public DoublyLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);

        newNode.prev = null;
        newNode.next = head;
        if (head!=null) head.prev = newNode;
        head = newNode;

    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        Node temp = head;

        if (head==null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (temp.next!=null){ // Traversing to get last node
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insert(int index,int val){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next,temp);
        temp.next.prev = node;
        temp.next = node;

        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
