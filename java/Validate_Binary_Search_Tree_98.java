import java.util.*;

import javax.swing.tree.TreeNode;

public class Validate_Binary_Search_Tree_98 {

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

    public void inorderT(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        inorderT(root.left, arr);
        int x = root.val;
        arr.add(x);
        inorderT(root.right, arr);
    }

    public boolean isValidBST(TreeNode root) {
        boolean flag = true;
        ArrayList<Integer> arr = new ArrayList<>();
        inorderT(root, arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                flag = false;
            }
        }

        return flag;
    }

    public static void main(String args[]) {

    }
}