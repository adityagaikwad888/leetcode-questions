import java.util.*;

import javax.swing.tree.TreeNode;

public class Range_Sum_of_BST {
    class Solution {
        //// Method - 2

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

        int sum = 0;

        public void getarr(TreeNode root, int low, int high) {
            if (root == null) {
                return;
            }

            if (root.val >= low && root.val <= high) {
                sum += root.val;
            }
            getarr(root.left, low, high);
            getarr(root.right, low, high);
            return;
        }
        //// Method -1
        // public void getarr(ArrayList<Integer> arr, TreeNode root){
        // if(root == null){
        // return ;
        // }

        // arr.add(root.val);
        // getarr(arr,root.left);
        // getarr(arr,root.right);
        // return;
        // }

        public int rangeSumBST(TreeNode root, int low, int high) {

            //// Method-1

            // ArrayList<Integer> arr = new ArrayList<>();
            // getarr(arr,root);
            // Collections.sort(arr);
            // int ptr = 0;
            // int sum = 0;
            // for(int i = 0 ; i < arr.size() ; i++){
            // if(arr.get(i) >= low && arr.get(i) <= high){
            // sum += arr.get(i);
            // }
            // }
            // return sum;

            getarr(root, low, high);
            return sum;
        }
    }
}
