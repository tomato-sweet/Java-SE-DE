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
//判断根是否相同，然后左子树右子树分别相同   是否为空
class IssameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null){
        return true;
    }else {
        if(p == null || q == null){
            return false;
        }
        if (p.value == q.value){
            return isSame(p.left,q.left) && isSame(p.right,q.right);
        }else {
            return false;
        }
    }
}
