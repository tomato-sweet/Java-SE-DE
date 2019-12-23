import javax.xml.soap.Node;

class Node{
    Node left;
    Node right;
    int value
}
public class BinaryTree {
    public Node find(Node root,int value){
        if(root == null);
        return root;
        if (root.value == value)
            return root;
        Node node = find(root.left,value);
        if (node!= null
            return node;
        return find(root.right,value);
    }
}
