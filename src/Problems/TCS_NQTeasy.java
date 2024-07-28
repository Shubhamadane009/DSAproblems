package Problems;

import java.util.Scanner;

public class TCS_NQTeasy {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();

        System.out.println("Enter divisior:");
        int divisior=sc.nextInt();

        int a1=num/divisior;
        int low=a1*divisior;
        int high=low+divisior;

        if(num==low)
            System.out.println(low);
        else if(num==high)
            System.out.println(high);
        else if(num-low >high-num)
        {
            System.out.println(high);
        }
        else{
            System.out.println(low);
        }
    }
}
