import javax.swing.tree.TreeNode;

/*
将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 */
public class BstDemo {
        int[] nums;
        public TreeNode helper(int left, int right) {
            if (left > right) return null;
            int p = (left + right) / 2;
            TreeNode root = new TreeNode(nums[p]);
            root.left = helper(left, p - 1);
            root.right = helper(p + 1, right);
            return root;
        }
        public TreeNode sortedArrayToBST(int[] nums) {
            this.nums = nums;
            return helper(0, nums.length - 1);
    }

}
