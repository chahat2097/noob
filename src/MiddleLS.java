public class MiddleLS {

    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data =d;
            next = null;
        }
    }

    void middlefunc()
    {
        Node p = head;
        Node q = head;
        if(head!=null)
        {
            while(q!=null && q.next!=null)
            {
                q=q.next.next;
                p=p.next;
            }
            System.out.println("Middle Element is [" + p.data + "]\n");
        }
    }

    public void push(int newdata)
    {
        Node newnode = new Node(newdata);
        newnode.next = head;
        head = newnode;
    }

    public void printlist()
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]){
        MiddleLS l = new MiddleLS();
        for(int i=5;i>0;--i)
        {
            l.push(i);
            l.printlist();
            l.middlefunc();

        }
    }



}
