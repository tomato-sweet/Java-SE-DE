import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InorderTraversal {
    public void  _inOrder(TreeNode root,List<Integer> list){
        if (root != null){
            _inOrder(root.left,list);
            list.add(root.val);
            _inOrder(root.right,list);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    _inOrder(root,list);
    return list;
    }
}