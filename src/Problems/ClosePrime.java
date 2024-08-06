package Problems;

import java.util.Scanner;

public class ClosePrime {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number :");
        int num=sc.nextInt();


        for(int i=num;i<=Integer.MAX_VALUE;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i+" is closest prime");
                break;
            }
        }

    }
}
