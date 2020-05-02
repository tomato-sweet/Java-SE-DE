class Inorder {
    public void _inOrder(TreeNode root,List<Integer> list){
        if(root != null){
            _inOrder(root.left,list);
            list.add(root.val);
            _inOrder(root.right,list);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        _inOrder(root,list);
        return list;

    }
}