package Random;

import java.util.Scanner;

public class SumOfAllPrimeNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num:");
        int num=sc.nextInt();

        int sum=0;

        for(int i=1;i<=num;i++)
        {
            int count=0;
            for(int j=1;j<=num;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(" "+i);
            }

        }
       // System.out.println(sum);
    }
}
