import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class midTest {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //用栈实现
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                //访问左子树
                stack.push(cur);
                cur = cur.left;
            }
            //访问根
            cur = stack.pop();
            System.out.println(cur.val);
            //访问右子树
            cur = cur.right;
        }
    }
}

