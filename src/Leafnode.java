public class Leafnode
{
    public static void main(String args[])
    {
        Node h = new Node("h");
        Node e = new Node("e");
        Node f = new Node("f");
        Node i = new Node("i");

        Node d = new Node("d",h,null);
        Node g = new Node("g",i,null);

        Node b = new Node("b",d,e);
        Node c = new Node("c",f,g);
        Node root = new Node("a",b,c);

        leafprint(root);

    }

    static class Node {
        String s;
        Node left;
        Node right;

        Node(String s) {
            this.s = s;
        }

        Node(String data, Node left, Node right) {
            this.s = data;
            this.left = left;
            this.right = right;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }
    }

        static void leafprint(Node n)
        {
            if(n==null)
                return;
            if(n.isLeaf()){
                System.out.printf("%s",n.s);
            }

            leafprint(n.left);
            leafprint(n.right);
        }





}
