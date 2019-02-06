public class Depth_binarytree
{
    public static class Node
    {
        int input;
        Node left,right;

        Node(int item)
        {
            input=item;
            left=right=null;
        }
    }

    public static class BT
    {
        Node root;

        int depth(Node n)
        {
            if(n==null)
                return 0;
            else
            {
                int l = depth(n.left);
                int r = depth(n.right);

                if(l>r)
                    return (l+1);
                else
                    return (r+1);
            }
        }
    }

    public static void main(String[] args)
    {
        BT t = new BT();

        t.root = new Node(5);
        t.root.left = new Node(4);
        t.root.right = new Node(8);
        t.root.left.left = new Node(2);
        t.root.left.right= new Node(1);

        System.out.println("Depth of tree: "+t.depth(t.root));


    }

}
