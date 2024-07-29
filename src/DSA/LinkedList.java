package DSA;

public class LinkedList {
    int size=0;
    //Node class
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    Node head=null;
    Node tail=null;

    //create  at end method
    public void createatend(int data)
    {
        Node n=new Node(data);

        if(head==null)
        {
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
        size++;
    }

    //create at start
    public void createatstart(int data)
    {
        Node n=new Node(data);

        if(head==null)
        {
            head=n;
            tail=n;
        }
        else{
            n.next=head;
            head=n;
        }
        size++;

    }

    //create at given location
    public void createatloc(int data,int pos)
    {
        Node n=new Node(data);
        {
            if(pos<1 || pos >size+1)
            {
                System.out.println("Invalid position");
            }

            else if (pos==1)
            {
//                if(head==null)
//                {
//                    head=n;
//                    tail=n;
//                }
//                else{
//                    n.next=head;
//                    head=n;
//                }
                createatstart(data);
            }
            else{
                Node temp=head;

                for(int i=1;i<pos-1;i++) //if our input position is 3 then this loop will stop at 2
                {
                    temp=temp.next;//this will keep moving the temp pointer
                }
                n.next=temp.next;
                temp.next=n;



            }
            size++;
        }
    }

    public void deleteatstart()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        else{
            if(head!=tail)
            {
                head=head.next;
            }
            else{
                head=tail=null;
            }
        }
        size--;
    }
    public void deleteatend()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
        }

        else if(head!=tail)
        {
            Node current=head;

            while(current.next!=tail)
            {
                current=current.next;
            }
            tail=current;
            tail.next=null;

        }
        else
        {
            head=tail=null;
        }
        size--;
    }


    void deleteatloc(int data,int pos)
    {

        if(pos<1 || pos>size+1)
        {
            System.out.println("Invalid position");
        }
        if (pos==1)
        {
            if(head==null)
            {
                System.out.println("Linked List is empty");
            }
            else{
                head=head.next;
            }
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }

        }
    }

    //display method
    public  void display()
    {
        Node mover=head;


        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        else{
            while(mover!=null)
            {
                System.out.print(mover.data +"->");


                mover=mover.next;
            }System.out.print("null");
        }

    }

    public static void main(String[]args)
    {
        LinkedList ll=new LinkedList();

        //created at end
        ll.createatend(1);
        ll.createatend(2);
        ll.createatend(3);
        ll.createatend(4);
        ll.createatend(5);
        ll.createatend(6);

        //create at start
        ll.createatstart(10);
        ll.createatstart(20);
        ll.createatstart(30);
        ll.createatstart(40);
        ll.createatstart(50);
        ll.createatstart(60);

        ll.createatloc(23,1);

        System.out.println();

        //---------delete at start------
//        ll.deleteatstart();
//        ll.deleteatstart();
        //   ll.deleteatend();
        System.out.println("Linked list created is ....");
        ll.display();
        //System.out.println(ll.size);




    }



}
