package LinkedList;

public class Intro {

    public static void main(String[] args) {
        Intro list = new Intro();
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
//        list.insertLast(7);
//        list.insert(3,12);
//        list.deleteFirst();
//        list.deleteLast();
//        list.delete(2);
//        list.display();
//        list.deleteDuplicates();
//        list.display();
//        System.out.println(list.lengthCycle());

    }
     Node head;
     Node tail;
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
    // Questions

    public void deleteDuplicates() {
        Node temp1 = head;
        Node temp2 = head;

        while (temp2 !=null){
            if (temp1.value==temp2.value){
                temp2 = temp2.next;
            }else{
                temp1.next = temp2;
                temp1 = temp2;
                temp2 = temp2.next;
            }
        }
        temp1.next = null;
    }

    public Node mergeTwoLists(Node list1, Node list2){
        Node head1 = list1;
        Node head2 = list2;
        Intro ans = new Intro();
        while (head1 != null && head2!=null){
            if (head1.value<=head2.value){
                ans.insertLast(head1.value);
                head1 = head1.next;
            } else {
                ans.insertLast(head2.value);
                head2 = head2.next;
            }
        }
        while (head1!=null){
            ans.insertLast(head1.value);
            head1 = head1.next;
        }
        while (head2!=null){
            ans.insertLast(head2.value);
            head2 = head2.next;
        }
        return ans.head;
    }

    public boolean hasCycle(Node head) {
        Node f = head;
        Node s = head;

        while (f != null && f.next != null){
            f = f.next.next;
            s = s.next;
            if (f==s){
                return true;
            }
        }
        return false;
    }
    public int lengthCycle(Node head){
        Node fast = head;
        Node slow = head;
//        int count = 0;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow){
                int count = 1;
                slow = slow.next;
                while (slow!=fast){
                    slow = slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    public Node detectCycle(Node head) {
        int cycleLength = lengthCycle(head);
        Node s = head;
        Node f = head;
        for (int i = 0; i < cycleLength; i++) {
            s = s.next;
        }
        while (s!=f){
            s = s.next;
            f = f.next;
        }
        return s;
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
