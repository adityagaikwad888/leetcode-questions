import java.util.*;

import javax.swing.tree.TreeNode;

public class Binary_Tree_Zigzag_Level_Order_Traversal {

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<TreeNode> temp1 = new ArrayList<>();
        int i = 0;
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                List<Integer> temp = new ArrayList<>();
                for (TreeNode n : temp1) {
                    temp.add(n.val);
                }
                // ans.add(temp);
                if (i % 2 == 0) {
                    Collections.reverse(temp);
                    ans.add(temp);
                } else {
                    ans.add(temp);
                }
                i++;
                temp1.clear();

                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
                temp1.add(curr);
                if (curr.right != null)
                    q.add(curr.right);
                if (curr.left != null)
                    q.add(curr.left);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();

    }
}
