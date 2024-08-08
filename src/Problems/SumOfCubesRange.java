package Problems;

import java.util.Scanner;

public class SumOfCubesRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num 1:");
        int num1=sc.nextInt();

        System.out.println("enter num2 :");
        int num2=sc.nextInt();

        int sum=0;

        for(int i=num1;i<=num2;i++)
        {
            int res=i*i*i;
            sum=sum+res;
        }
        System.out.println(sum);
    }
}
