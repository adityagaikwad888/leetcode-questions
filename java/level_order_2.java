import java.util.*;

import javax.swing.tree.TreeNode;

public class level_order_2 {

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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> TQ = new LinkedList<>();
        if (root == null) return ans;

        TQ.add(root);
        TQ.add(null);
        List<Integer> temp = new ArrayList<>();

        while (!TQ.isEmpty()) {
            TreeNode curr = TQ.remove();
            if (curr == null) {
                List<Integer> temp1 = new ArrayList<>();
                for (int i = 0; i < temp.size() ; i++) {
                    temp1.add(temp.get(i));
                }
                ans.add(temp1);
                temp.clear();
                if (TQ.isEmpty()) {
                    break;
                }else{
                    TQ.add(null);
                }
            }else{
                temp.add(curr.val);
                if (curr.left != null) {
                    TQ.add(curr.left);
                }
                if (curr.right != null) {
                    TQ.add(curr.right);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
