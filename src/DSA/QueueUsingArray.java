package DSA;

import java.util.Scanner;

public class QueueUsingArray {
    int front=0,rear=0,count=0,maxsize=5;

    int nums[]=new int[maxsize];

    void push(Scanner sc)
    {
        if(count==maxsize)
        {
            System.out.println("Queue is full");
            return;
        }
        else{
            System.out.println("Enter data :");
            int data=sc.nextInt();
             nums[rear%maxsize]=data;
             rear++;
             count++;
            System.out.println("Item pushed");
            return;
        }
    }

    void pop()
    {
        if(count==0)
        {
            System.out.println("Queue empty");
            return;
        }
        else{
            front++;
            nums[front%maxsize]=-1;
            count--;
            System.out.println("Item popped");
            return;
        }
    }

    void top()
    {
        if(count==0)
        {
            System.out.println("Queue is empty");
            return;
        }
        else{
            System.out.println(nums[front%maxsize]);
            return;
        }
    }

    void isEmpty()
    {
        if(count==0)
        {
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty");
        }
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        QueueUsingArray q=new QueueUsingArray();
        int ch=0;
        while (ch!=5)
        {
            System.out.println("1.push 2.pop 3.top 4.IsEmpty 5.Exit");
            System.out.println("Enter choice:");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1: q.push(sc);
                break;

                case 2:q.pop();
                break;

                case 3:q.top();
                break;

                case 4:q.isEmpty();
                break;

                case 5:{
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                }

                default:
                    System.out.println("**Enter valid choice**");
            };

        }
    }

}
