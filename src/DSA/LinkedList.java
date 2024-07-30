package DSA;

import java.util.Scanner;

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
    public void createatend(Scanner sc)
    {
        System.out.println("enter data :");
        int data=sc.nextInt();

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
    public void createatstart(Scanner sc)
    {
        System.out.println("enter data :");
        int data=sc.nextInt();

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
    public void createatloc(Scanner sc)
    {
        System.out.println("enter data :");
        int data=sc.nextInt();

        System.out.println("enter position :");
        int pos=sc.nextInt();

        Node n=new Node(data);
        {
            if(pos<1 || pos >size+1)
            {
                System.out.println("Invalid position");
            }

            else if (pos==1)
            {
                if(head==null)
                {
                    head=n;
                    tail=n;
                }
                else{
                    n.next=head;
                    head=n;
                }

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


    void deleteatloc(Scanner sc)
    {
        System.out.println("enter data :");
        int data=sc.nextInt();

        System.out.println("enter position :");
        int pos=sc.nextInt();

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
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();

       int ch=0;

       while(ch!=8)
       {
           System.out.println();
           System.out.println("1.Create at start");
           System.out.println("2.Create at end");
           System.out.println("3.Create at given Location");
           System.out.println("4.Delete at end");
           System.out.println("5.Delete at Given location");
           System.out.println("6.Delete at start");
           System.out.println("7.Display");
           System.out.println("7.exit");
           System.out.println("Enter choice");
           ch=sc.nextInt();

           switch(ch)
           {
               case 1: ll.createatstart(sc);
                   break;

               case 2:ll.createatend(sc);
                   break;

               case 3:ll.createatloc(sc);
                   break;

               case 4:ll.deleteatstart();
                   break;

               case 5:ll.deleteatend();
                   break;

               case 6:ll.deleteatloc(sc);
                   break;

               case 7:ll.display();
               break;

               case 8:
               {
                   System.out.println("exiting...");
                   System.exit(0);
               }

                   break;

               default:{
                   System.out.println("Enter valid choice");
               }

           };

       }




    }



}
