package DSA;

import java.util.Scanner;

public class StackUsingArray {

    int top;
    int maxsize=10;
    int nums[]=new int [maxsize];

    StackUsingArray()
    {
        top=-1;
    }

    Boolean push()
    {
        Scanner sc=new Scanner(System.in);
        if(top==maxsize-1)
        {
            System.out.println("Stack overflow");
            return false;
        }
        else{
            System.out.println("Enter data :");
            int data=sc.nextInt();

            top++;

            nums[top]=data;
            System.out.println("Data pushed");
            return true;
        }
    }

    Boolean pop()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
            return false;
        }
        else{
            top--;
            System.out.println("data popped");
            return true;
        }
    }

    Boolean display()
    {
        if(top==-1)
        {
            System.out.println("stack empty");
            return false;
        }
        else{
            for(int i=top;i<=0;i--)
            {
                System.out.println(nums[i]);

            }
            return true;
        }
    }
}

