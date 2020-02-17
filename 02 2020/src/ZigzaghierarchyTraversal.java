/*
给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 */

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
public class ZigzaghierarchyTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root == null) return levels;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int level = 0;
        queue.add(root);
        while(!queue.isEmpty()) {
            levels.add(new ArrayList<Integer>());
            int lens = queue.size();
            for(int i = 0; i < lens; i++) {
                TreeNode p = queue.poll();
                if (level % 2 == 0) {
                    levels.get(level).add(p.val);
                }
                else {
                    levels.get(level).add(0, p.val);//倒序输入数值满足要求，始终将其新的值放在最前面
                }
                if(p.left != null) queue.add(p.left);
                if(p.right != null) queue.add(p.right);
            }
            level++;
        }
        return levels;
    }
}
