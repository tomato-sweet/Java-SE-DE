import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class IssubTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else {
            if (p == null || q == null) {
                return false;
            }
            if (p.value == q.value) {
                return isSame(p.left, q.left) && isSame(p.right, q.right);
            } else {
                return false;
            }
        }
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
       if (s == null)
           return false;
       if (isSameTree(s,t))
           return true;
       if (isSubtree(s.left,t))
           return true;
       return isSubtree(s.right,t);
        }
    }
}
