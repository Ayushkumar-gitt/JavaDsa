package Trees;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void populate(Scanner sc) {
        System.out.println("Enter the root node: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    public void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter value of left: ");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter value of right: ");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    // DISPLAY THING, DO NOT MESS WITH IT, WRITTEN WITH AI
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

    private int height(Node n) {
        return n == null ? -1 : 1 + Math.max(height(n.left), height(n.right));
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
            int dist = 3 + height(node);                           // higher nodes spread wider
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