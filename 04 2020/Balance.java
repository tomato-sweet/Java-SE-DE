import javax.swing.tree.TreeNode;

/*
二叉树平衡检查
实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。
 */

public class Balance {
    public static boolean isBalance(TreeNode root) {
        // write code here
        int res = isBalanceCore(root);
        return res != -1;
    }

    public static int isBalanceCore(TreeNode root) {
        // write code here
        if (root == null)
            return 1;
        int leftHeight = isBalanceCore(root.left);
        int rightHeight = isBalanceCore(root.right);
        if (leftHeight == -1 || rightHeight == -1)
            return -1;
        if (leftHeight - rightHeight > 1 || leftHeight - rightHeight < -1)
            return -1;
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }
}