package Problems;
import java.util.*;
public class Armstrong {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int num=sc.nextInt();

        int temp=num;
        int temp1=num;

        double length=0,rem,sum=0;
        while(temp!=0)
        {
            temp/=10;
            length++;
        }




            while(temp1!=0)
            {
                rem=temp1%10;
                sum=sum+Math.pow(rem,length);
                temp1/=10;
            }



        if(sum==num)
        {
            System.out.println("Entered number "+num+" is a armstrong number");
        }
        else{
            System.out.println("Entered number is not a armstrong number");
        }
        //System.out.println(length);
    }
}
