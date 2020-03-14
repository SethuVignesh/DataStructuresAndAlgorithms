package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public static void main(String[] args) {

//        buildTree(new int[]{9, 3, 15, 20, 7},
//                new int[]{9, 15, 7, 20, 3});
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
//        node= new TreeNode (8);
//        node= new TreeNode (9);
//        System.out.println(hasPathSum(node, 9));
        System.out.print(rightSideView(node));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list= new ArrayList<Integer>();
        Queue<TreeNode> q= new LinkedList();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode node=q.remove();

            if(node==null){
                q.add(null);
                if(q.peek()==null) break;
                continue;
            }
            if(q.peek()==null){
                list.add(node.val);
            }
            if(node.left!=null) q.add(node.left);
            if(node.right!=null)q.add(node.right);

        }

        return list;
    }

//    public static boolean hasPathSum(TreeNode root, int sum) {
//
//        return hasPathSum(root, sum, 0);
//    }
//
//    private static boolean hasPathSum(TreeNode root, int sum, int localSum) {
//        if (root == null) {
//            if (sum == 0) return true;
//            else return false;
//        }
//        localSum += root.val;
//        if (isLeaf(root)) {
//            if (sum == localSum) return true;
//        }
//        return hasPathSum(root.left, sum, localSum) || hasPathSum(root.right, sum, localSum);
//    }
//
//    private static boolean isLeaf(TreeNode node) {
//        return (node != null
//                && node.left == null
//                && node.right == null);
//    }
//
//
//    public static TreeNode buildTree(int[] inorder, int[] postorder) {
//        int root = postorder[postorder.length - 1];
//        int rootPos = -1;
//        for (int i = 0; i < inorder.length; i++) {
//            if (root == inorder[i]) {
//                rootPos = i;
//                break;
//            }
//        }
//        TreeNode node = new TreeNode(inorder[rootPos]);
//        construct(node, inorder, rootPos,0, postorder.length - 1);
////        constructRight(node, inorder, rootPos + 1, postorder.length-1);
//        return node;
//
//
//    }
//
//    private static void construct(TreeNode root, int[] inOrder,int rootPos, int start, int end) {
//        if (root == null) return;
//        if(end<start) return;
//        int rootPos=
//        root.left=
//        construct(root,inOrder,rootPos,0,rootPos-1);
//        construct(root,inOrder,rootPos,rootPos+1,inOrder.length-1);
//    }
//
//    private static int getRootPos(int[] inorder, int[] postorder,int start, int end){
//
//    }
//
//    private static void constructRight(TreeNode root, int[] inOrder, int left, int right) {
//        if (root == null) return;
//        if ((left < 0 && right < 0) || (left > inOrder.length - 1 && right > inOrder.length - 1)) return;
//        if (left >= 0 && left < inOrder.length) {
//            root.left = new TreeNode(inOrder[left]);
//        }
//
//
//        constructRight(root.right, inOrder, left + 1, left + 2);
////        constructRight(root.right, inOrder, left + 1, left + 2);
//        if (right < inOrder.length && right >= 0) {
//            root.right = new TreeNode(inOrder[right]);
//        }
//    }
}