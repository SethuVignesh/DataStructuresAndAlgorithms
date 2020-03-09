package Trees;

public class BinaryTree {

    public class BNode {
        int val;
        BNode left;
        BNode right;
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

    public boolean isLeaf(BNode root) {
        return root.left == null && root.right == null;
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
