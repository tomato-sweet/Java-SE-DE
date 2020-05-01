class Preorder {
    public void _inOrder(TreeNode root,List<Integer> list){
        if(root != null){
	list.add(root.val);
            _inOrder(root.left,list);
            _inOrder(root.right,list);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        _inOrder(root,list);
        return list;

    }
}