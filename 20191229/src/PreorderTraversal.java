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
class PreorderTraversal {
    public void _preOrder(TreeNode root,List<Integer> list){
        if(root!=null){
            list.add(root.val);
            _preOrder(root.left,list);
            _preOrder(root.right,list);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        _preOrder(root,list);
        return list;
    }

    public static void main(String[] args) {

    }
}