/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Postorder {
    public void _postOrder(TreeNode root,List<Integer> list){
        if(root != null){
            _postOrder(root.left,list);
            _postOrder(root.right,list);
            list.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        _postOrder(root,list);
        return list;
    }
}