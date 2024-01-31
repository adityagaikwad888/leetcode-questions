import java.util.*;

public class Binary_Tree_Maximum_Path_Sum {
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

    //////////////////
    //////////////////  Not completed 
    //////////////////
    public int maxPathSum(TreeNode root,int ans) {
        if(root == null) {
            ans = 0;
            return 0;
        }
        int ls = maxPathSum(root.left,ans);
        int rs = maxPathSum(root.right,ans);

        ans = Math.max(ls+root.val, rs+root.val);
        return ans;
    }
}
