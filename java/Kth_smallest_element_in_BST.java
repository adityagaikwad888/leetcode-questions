import java.util.*;

import javax.swing.tree.TreeNode;

public class Kth_smallest_element_in_BST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private void help(TreeNode root,ArrayList<Integer> l){
        if (root == null) {
            return;
        }
        help(root.left, l);
        l.add(root.val);
        help(root.right, l);
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        help(root, l);
        return l.get(k);
    }
}
