public class reversels
{
    static Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;

        }

    }

    Node reverse(Node n)
    {
        Node prev = null;
        Node current = n;
        Node next= null;
        while(current!=null)
        {
            next= current.next;
            current.next=prev;
            prev=current;
            current = next;
        }
        n=prev;
        return n;
    }

    void listprint(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String args[])
    {
        reversels list = new reversels();
        list.head = new Node(52);
        list.head.next = new Node(85);
        list.head.next.next=new Node(43);
        list.head.next.next.next =new Node(56);

        System.out.println("Before");
        list.listprint(head);
        head=list.reverse(head);
        System.out.println("");
        System.out.println("After");
        list.listprint(head);
    }

}
