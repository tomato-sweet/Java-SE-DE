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
public class PostorderTraversal
    public void  _postorder(TreeNode root, List<Integer> list){
        if (root != null){
            _postorder(root.left,list);
            _postorder(root.right,list);
            list.add(root.val);
        }
    }

        public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        _postorder(root,list);
        return list;
    }
}
