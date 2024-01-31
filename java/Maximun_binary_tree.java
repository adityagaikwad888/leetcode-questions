import java.util.*;

import javax.swing.tree.TreeNode;

public class Maximun_binary_tree {
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

    private TreeNode add_node(int nums[], int s, int e) {
        if (s > e)
            return null;
        int max = Integer.MIN_VALUE;
        int index = s;
        for (int i = s; i <= e; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i;
            }
        }

        TreeNode node = new TreeNode(nums[index]);

        node.right = add_node(nums, index + 1, e);
        node.left = add_node(nums, s, index - 1);

        return node;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 1)
            return new TreeNode(nums[0]);

        return add_node(nums, 0, nums.length - 1);
    }
}
