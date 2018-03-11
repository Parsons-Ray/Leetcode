/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */
import java.util.ArrayList;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x;}
}
public class BinaryTreeInorderTraversal_94 {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        helper(root, res);
        return res;
    }
    public void helper(TreeNode root, ArrayList<Integer> res) {
        if(root == null);
        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
    }

}
