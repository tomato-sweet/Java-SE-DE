/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Subtree {
    public boolean isSameTree(TreeNode s, TreeNode t) {
     if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;
        if(s.val == t.val){
            return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
        }else{
            return false;
        }
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return false;
        if(isSameTree(s,t))
            return true;
        if(isSubtree(s.left,t))
            return true;
        if(isSubtree(s.right,t))
            return true;
    }
}