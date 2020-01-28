import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        if (root == null)
            return  new ArrayList<>();
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.addLast(null);
        LinkedList<Integer>tempList = null;
        while (!queue.isEmpty()){
            TreeNode node = queue.removeFirst();
            if(node == null){
                if (tempList != null){
                    ((LinkedList<List<Integer>>)result).addFirst(tempList);
                    tempList = null;
                    queue.addLast(null);
                    continue;;
                }
            }else {
                if (tempList == null){
                    tempList = new LinkedList<>();
                }
                tempList.addLast(node.val);
                if (node.left != null){
                    queue.addLast(node.right);
                }
            }
        }
        return result;
    }
}
