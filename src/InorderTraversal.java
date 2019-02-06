import java.util.Stack;

public class InorderTraversal
{
    static class Node
    {
        int data;
        Node left,right;

        Node(int item)
        {
            data=item;
            left=right=null;
        }

        boolean isLeaf()
        {
            return left == null ? right == null : false;
        }

    }

    Node root;

    public void inorder()
    {
        Stack<Node> n = new Stack<>();
        Node current = root;

        while(!n.isEmpty() || current != null)
        {
            if(current != null)
            {
                n.push(current);
                current = current.left;
            }else{
                Node node = n.pop();
                System.out.println("data is: "+node.data);
                current = node.right;
            }
        }
    }

    public static InorderTraversal create()
    {
        InorderTraversal tree = new InorderTraversal();

        tree.root = new Node(5);
        tree.root.left = new Node(9);
        tree.root.left.left = new Node(2);
        tree.root.left.left.left = new Node(7);
        tree.root.left.right = new Node(21);
        tree.root.right = new Node(12);
        tree.root.right.right = new Node(15);
        tree.root.right.right.right = new Node(18);

        return tree;

    }

    public static void main(String args[])
    {
        InorderTraversal in = InorderTraversal.create();
        in.inorder();
    }

}
