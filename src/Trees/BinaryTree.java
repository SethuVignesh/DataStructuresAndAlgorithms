package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args) {
        BNode root = new BNode(1);
        BNode node = new BNode(2);
        root.left = node;
        node = new BNode(3);
        root.right = node;
        node = new BNode(4);
        root.left.left = node;
        node = new BNode(5);
        root.left.right = node;
        node = new BNode(6);
        root.right.left = node;
        node = new BNode(7);
        root.right.right = node;
//        preOrderTraversal(root);
//        inOrderTraversdal(root);
        levelOrder(root);
    }

    public static class BNode {
        int val;
        BNode left;
        BNode right;

        public BNode(int val) {
            this.val = val;
        }
    }

    public int getMax(BNode root) {
        if (root == null) return 0;
        int leftMax = getMax(root.left); // 6
        int rightMAx = getMax(root.right); // 7
        return Math.max(root.val, Math.max(leftMax, rightMAx));

    }

    public int getHeight(BNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }

//    public boolean isLeaf(BNode root) {
//        return root.left == null && root.right == null;
//    }

    public void deleteTree(BNode root) {
        if (root == null) return;
        deleteTree(root.left);
        deleteTree(root.right);
        root.left = null;
        root.right = null;

    }

    public BNode copyTree(BNode root) {
        if (root == null) return null;
        BNode rootClone = new BNode(root.val);
        rootClone.left = copyTree(root.left);
        rootClone.right = copyTree(root.right);
        return root;
    }

//    private static void preOrderTraversal(BNode node) {
//        if (root == null) {
//            return;
//        }
////        List<>
//        Stack<BNode> stack = new Stack<BNode>();
//
//        BNode temp = root;
//        stack.push(temp);
//        while (stack.isEmpty() == false) {
//
//            if (temp.right != null) {
//                stack.push(temp.right);
//            }
//
//            if (temp.left != null) {
//                stack.push(temp.left);
//            }
//            System.out.println(stack.peek().val);
//            temp = stack.pop();
//        }

//    private static void preOrderTraversal(BNode node) {
//        while (node == null) return;
//        BNode temp = node;
//        Stack<BNode> stack = new Stack();
//        while (true) {
//            while (temp != null) {
//                System.out.println(temp.val);
//                stack.push(temp);
//                temp = temp.left;
//            }
//
//            if (stack.isEmpty()) break;
//            temp = stack.pop();
//
//            temp = temp.right;
//        }
//        Queue<BNode> queue= new LinkedList<>() ;
//        queue.add(null);
//        queue.
//
//    }

    private static void levelOrder(BNode root) {
        List<List<Integer>> list= new LinkedList();
        List<Integer> innerlist= new LinkedList();
        Queue<BNode> q = new LinkedList<BNode>();

        q.add(root);
        q.add(null);
        BNode temp;
        while (!q.isEmpty()) {
            temp = q.remove();
            if(temp==null ) {
                if(q.peek()==null) break;
                list.add(innerlist);
                innerlist=new LinkedList();
                q.add(null);
                continue;
            }
            System.out.println(temp.val);
            innerlist.add(temp.val);

            if (temp.left != null) {
                q.add(temp.left);
            }

            if (temp.right != null) {
                q.add(temp.right);
            }
        }
//            return list;

    }

    private static void inOrderTraversdal(BNode node) {
        while (node == null) return;
        BNode temp = node;
        Stack<BNode> stack = new Stack();
        while (true) {
            while (temp != null) {
                System.out.println(temp.val);
                stack.push(temp);
                temp = temp.left;
            }

            if (stack.isEmpty()) break;
            temp = stack.pop();

            temp = temp.right;
        }
    }

    private boolean isLeaf(BNode node) {
        if (node == null) return false;
        if (node.left == null && node.right == null) return true;
        return false;
    }

    public boolean contains(BNode root, int data) {
        return false;
    }
//    public void insert() {
//    }
//
//    public void LevelOrderTraversal() {
//    }
//
//    public void inOrderTraversal() {
//    }
//
//    public void preOrederTraversal() {
//    }
//
//    public void postOrederTraversal() {
//    }
//
//    public void printLeaves() {
//    }
//
//    public void printLeft() {
//    }
//
//    public void printRight() {
//    }
//
//    public void printBoundary() {
//    }
//
//    public void getSize() {
//    }
//
//    public int getMax(BNode root) {
//        return -1;
//    }
//
//    public int getHeight(BNode root) {
//        return -1;
//    }
//
//    //GENERIC
//    public boolean delete(BNode root) {
//        return false;
//    }
//
//    public boolean deleteTree(BNode root) {
//        return false;
//    }
//
//    public void copyTree(BNode root) {
//    }
//
//    public boolean contains(BNode root, int data) {
//        return false;
//    }
//
//    boolean equals(BNode root1, BNode root2) {
//        return false;
//    }
//
//    public void mirrorTree(BNode root) {
//    }
//
//    public void printAncestors(BNode root, int data) {
//    }
//
//    public int level(int data) {
//    }
//
//    public int levelOfNode(BNode root, int data, int level) {
//    }
//
//    public boolean isSiblings(BNode root, int data1, int data2) {
//    }
//
//    public void maxNodes(BNode root) {
//    }
////skew tree full tree LST RST
//
//    int diameter(BNode root) {
//    }

}
