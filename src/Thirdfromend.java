public class Thirdfromend
{
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

    void  thirdfromendfunc(int n)
    {
        Node p = head;
        Node q = head;
        int count = 0;
        while(count<3)
        {
            q=q.next;
            count++;
        }
        while(q!=null)
        {
            q=q.next;
            p=p.next;
        }
        System.out.println(p.data);
    }

    public void push(int newdata)
    {
        Node newnode = new Node(newdata);
        newnode.next = head;
        head = newnode;
    }



    public static void main(String args[])
    {
        Thirdfromend t = new Thirdfromend();
        t.push(5);
        t.push(63);
        t.push(52);
        t.push(56);
        t.push(9);
        t.push(963);
        t.push(852);

        t.thirdfromendfunc(3);


    }


}
