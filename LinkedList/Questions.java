package LinkedList;

public class Questions {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        int[] ll = {1,1,2,3,3};

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

//        public static ListNode deleteDuplicates(ListNode head) {
//            ListNode temp1 = head;
//            ListNode temp2 = head;
//
//            while (temp2.next !=null){
//                if (temp1.val==temp2.val){
//                    temp2 = temp2.next;
//                }
//                temp1.next = temp2;
//                temp1 = temp2;
//            }
//            return
//        }

    }
}
