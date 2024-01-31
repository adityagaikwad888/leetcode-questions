import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Binary_Tree_Inorder_Traversal {
    public void inorder(TreeNode root, List<Integer> L) {
        if (root == null) {
            return;
        }

        inorder(root.left, L);
        L.add(root.val);
        inorder(root.right, L);

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> L = new ArrayList<>();
        if (root == null) {
            L.add(0);
            return L;
        }

        inorder(root, L);
        return L;
    }
}
