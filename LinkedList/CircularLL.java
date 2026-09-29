package LinkedList;

public class CircularLL {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertLast(10);
        list.insertLast(5);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(18);
        list.display();
    }
    Node head;
    Node tail;
    int size = 0;

    public void insertLast(int val){
        Node newNode = new Node(val);
        if (head==null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }
    public void display(){
        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.val + " --> ");
                node = node.next;
            }while (node!=head);
            System.out.print("HEAD");
        }
    }

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
