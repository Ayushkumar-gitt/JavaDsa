package LinkedList;

public class Intro {

    public static void main(String[] args) {
        Intro list = new Intro();
        list.insertFirst(9);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(1);
        list.insertLast(45);
        list.insert(3,12);
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        list.display();
    }
    private Node head;
    private Node tail;
    private  int size;
    public Intro(){
        this.size = 0;
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
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail==null){
            tail = head;
        }

        size = size+1;
    }

    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteFirst(){
        Node temp = head;
        head = temp.next;
        temp.next = null;
        size--;

        if (head==null){
            tail = null;
        }
    }

    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }
        tail = temp.next;
        temp.next = null;
    }

    public void delete(int index){
        if (index ==0){
            deleteFirst();
        }
        if (index==size-1){
            deleteLast();
        }
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
