package Trees;

public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = {5,2,1,4,6,7};
        tree.populate(nums);
        tree.display();
    }
    public class Node{
        int height;
        int value;
        Node right;
        Node left;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    Node root;

    public BinarySearchTree(){

    }

    public int height(Node node){
        if(node==null) return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){
        root = insert(value,root);
    }
    public Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(value,node.left);
        }
        if(value>node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;

        return node;
    }
    public void populate(int[] nums){
        for(int i = 0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null) return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public void populatedSorted(int[] arr){
        populatedSorted(arr,0,arr.length);
    }
    public void populatedSorted(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(arr[mid]);
        populatedSorted(null,start,mid);
        populatedSorted(null,mid+1,end);
    }

    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node==null) return;

        System.out.println(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(Node node){
        if(node==null) return;

        inOrder(node.left);
        System.out.println(node.value+ " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    public void postOrder(Node node){
        if(node==null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+ " ");
    }

    // DISPLAY LOGIC , DO NOT TOUCH THIS
    public void display() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        for (String line : build(root).lines) {
            System.out.println(line.replaceAll("\\s+$", ""));
        }
    }

    // A rendered subtree: its text lines, total width, and the column of its root label
    private static class Box {
        java.util.List<String> lines = new java.util.ArrayList<>();
        int width;
        int rootCol;
    }

    private int heightOf(Node n) {
        return n == null ? -1 : 1 + Math.max(heightOf(n.left), heightOf(n.right));
    }

    private char[] blankRow(int width) {
        char[] row = new char[width];
        java.util.Arrays.fill(row, ' ');
        return row;
    }

    private void put(char[] row, String s, int at) {
        for (int i = 0; i < s.length(); i++) row[at + i] = s.charAt(i);
    }

    private Box build(Node node) {
        String label = String.valueOf(node.value);
        int len = label.length();
        Box box = new Box();

        // Leaf node
        if (node.left == null && node.right == null) {
            box.lines.add(label);
            box.width = len;
            box.rootCol = (len - 1) / 2;
            return box;
        }

        Box L = node.left != null ? build(node.left) : null;
        Box R = node.right != null ? build(node.right) : null;

        int lOff = 0, rOff = 0, slashL = 0, slashR = 0, labelStart;

        if (L != null && R != null) {
            int dist = 3 + heightOf(node);                         // higher nodes spread wider
            rOff = Math.max(L.width + 1, L.rootCol + dist - R.rootCol);
            slashL = L.rootCol + 1;
            slashR = rOff + R.rootCol - 1;
            labelStart = (slashL + slashR + 1 - len) / 2;          // centre label between slashes
        } else if (L != null) {
            slashL = L.rootCol + 1;
            labelStart = slashL + 1;
        } else {
            slashR = R.rootCol - 1;
            labelStart = slashR - len;
        }

        // Shift everything right if anything went off the left edge
        int shift = Math.max(0, -labelStart);
        lOff += shift;
        rOff += shift;
        slashL += shift;
        slashR += shift;
        labelStart += shift;

        int width = labelStart + len;
        if (L != null) width = Math.max(width, lOff + L.width);
        if (R != null) width = Math.max(width, rOff + R.width);

        // Row 0: the node label
        char[] labelRow = blankRow(width);
        put(labelRow, label, labelStart);
        box.lines.add(new String(labelRow));

        // Row 1: the branches
        char[] slashRow = blankRow(width);
        if (L != null) slashRow[slashL] = '/';
        if (R != null) slashRow[slashR] = '\\';
        box.lines.add(new String(slashRow));

        // Remaining rows: children side by side
        int rows = Math.max(L != null ? L.lines.size() : 0, R != null ? R.lines.size() : 0);
        for (int i = 0; i < rows; i++) {
            char[] row = blankRow(width);
            if (L != null && i < L.lines.size()) put(row, L.lines.get(i), lOff);
            if (R != null && i < R.lines.size()) put(row, R.lines.get(i), rOff);
            box.lines.add(new String(row));
        }

        box.width = width;
        box.rootCol = labelStart + (len - 1) / 2;
        return box;
    }

}
