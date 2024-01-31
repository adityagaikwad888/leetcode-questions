import java.util.*;


public class all_elements_BTS {
    private List<Integer> l = new ArrayList<>();
    private void inorder_r1(TreeNode root1){
        if (root1==null) {
            return;
        }

        l.add(root1.val);
        inorder_r1(root1.left);
        inorder_r1(root1.right);
    }
    private void inorder_r2(TreeNode root2){
        if (root2==null) {
            return;
        }

        l.add(root2.val);
        inorder_r2(root2.left);
        inorder_r2(root2.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if (root1 != null) {
            inorder_r1(root1);
        }
        if (root2!=null) {
            inorder_r1(root2);
        }

        Collections.sort(l);
        return l;
    }

}
