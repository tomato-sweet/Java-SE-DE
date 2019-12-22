//二叉链
class Node{
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {
    public static int size = 0;
    public static int leafSize = 0;
    //private Node root = null;
    //前序遍历： 根  左子树  右子树
    public void preOrder(Node root){
        //终止条件: 空树
        if(root == null){
            return;
        }
        else{
            //递推
            //根
            System.out.print(root.value);
            //左子树
            preOrder(root.left);
            //右子树
            preOrder(root.right);
        }
    }

    public  void inOrder(Node root){
        if(root != null){
            //访问左子树
            inOrder(root.left);
            //根
            System.out.print(root.value);
            //访问右子树
            inOrder(root.right);
        }
    }
    public void postOrfer(Node root){
        if(root != null){
            //左子树
            postOrfer(root.left);
            //右子树
            postOrfer(root.right);
            //根
            System.out.print(root.value);
        }
    }

    public void getSize1(Node root){
        if(root != null){
            //左子树
            getSize1(root.left);
            //右子树
            getSize1(root.right);
            //根
            ++size;
        }
    }


    public int getSize2(Node root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        //整棵树节点： 当前节点 + 左右子树节点的个数
        return getSize2(root.left) + getSize2(root.right) + 1;
    }

    public void getLeafSize1(Node root){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            ++leafSize;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    // 子问题思路-求叶子结点个数
    // 整棵树的叶子 = 左右子树的叶子之和
    public int getLeafSize2(Node root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    public int getKSize(Node root, int k){
        if(root == null)
            return 0;
        if(k == 1)
            return 1;
        return getKSize(root.left, k - 1) + getKSize(root.right, k - 1);
    }
    public Node buildTree(){
        Node root = new Node('A');
        Node node1 = new Node('B');
        Node node2 = new Node('C');
        Node node3 = new Node('D');
        Node node4 = new Node('E');
        Node node5 = new Node('F');
        Node node6 = new Node('G');
        Node node7 = new Node('H');
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.right = node7;
        return root;
    }

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        Node root = bTree.buildTree();
        bTree.preOrder(root);
        System.out.println();
        bTree.inOrder(root);
        System.out.println();
        bTree.postOrfer(root);
        System.out.println();
        bTree.getSize1(root);
        System.out.println(BinaryTree.size);
        System.out.println(bTree.getSize2(root));
        bTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println(bTree.getLeafSize2(root));
        System.out.println(bTree.getKSize(root, 1));
        System.out.println(bTree.getKSize(root, 2));
        System.out.println(bTree.getKSize(root, 3));
        System.out.println(bTree.getKSize(root, 4));

    }
}
