import javax.swing.tree.TreeNode;
import java.util.*;

public class RightTree {
        public List<Integer> rightSideView(TreeNode root) {
            Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
            int max_depth = -1;

            Stack<TreeNode> nodeStack = new Stack<TreeNode>();
            Stack<Integer> depthStack = new Stack<Integer>();
            nodeStack.push(root);
            depthStack.push(0);

            while (!nodeStack.isEmpty()) {
                TreeNode node = nodeStack.pop();
                int depth = depthStack.pop();

                if (node != null) {
                    max_depth = Math.max(max_depth, depth);

                    /* The first node that we encounter at a particular depth contains
                     * the correct value. */
                    if (!rightmostValueAtDepth.containsKey(depth)) {
                        rightmostValueAtDepth.put(depth, node.val);
                    }

                    nodeStack.push(node.left);
                    nodeStack.push(node.right);
                    depthStack.push(depth+1);
                    depthStack.push(depth+1);
                }
            }

            /* Construct the solution based on the values that we end up with at the
             * end. */
            List<Integer> rightView = new ArrayList<Integer>();
            for (int depth = 0; depth <= max_depth; depth++) {
                rightView.add(rightmostValueAtDepth.get(depth));
            }

            return rightView;
        }
    }

