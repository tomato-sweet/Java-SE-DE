import javax.swing.tree.TreeNode;

/*
 给定一个二叉树，检查它是否是镜像对称的。
 解题思路：首先根相同，其次以根为延伸的左右子树应当（左子树的左子树应与右子树的右子树相同，左子树的右子树应与右子树的左子树相同）
 */
public class Symmetric {
    public boolean _isSymmetric(TreeNode left,TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        return left.val == right.val
                && _isSymmetric(left.left,right.right)
                && _isSymmetric(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return _isSymmetric(root.left,root.right);
    }
}
