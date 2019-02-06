public class Isbst {

    static class Node{
        int data;
        Node left,right;

        public Node(int item){
            data=item;
            left=right=null;
        }

    }

    public static class BinaryTree{
        Node root;

        boolean isBST(){
            return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }

        boolean isBSTUtil(Node n,int min,int max){
            if(n == null)
                return true;

            if(n.data<=min || n.data>max)
                return false;

            return(isBSTUtil(n.left,min,n.data-1)&& isBSTUtil(n.right,n.data+1,max));
        }

        public static void main(String args[]){

            BinaryTree t = new BinaryTree();
            t.root = new Node(4);
            t.root.left = new Node(5);
            t.root.right = new Node(2);
            t.root.left.left = new Node(7);
            t.root.left.right = new Node(8);

            if(t.isBST())
                System.out.println(" yes bst");
            else
                System.out.println("no bst");
        }
    }


}
