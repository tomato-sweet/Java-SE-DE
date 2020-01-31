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
    public class Balanced {
        public int getHight(TreeNode root){
            return root == null ? 0:Math.max(getHight(root.left)
                    ,getHight(root.right))+1;
        }
        public boolean isBalanced(TreeNode root) {
            if(root == null)
                return true;
            int left = getHight(root.left);
            int right = getHight(root.right);
            return Math.abs(left - right) < 2
                    && isBalanced(root.left)
                    && isBalanced(root.right);
        }
    }