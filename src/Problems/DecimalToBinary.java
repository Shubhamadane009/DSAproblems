package Problems;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num :");
        int num=sc.nextInt();

        int rem=0,res=0;
        while(num!=0)
        {
            rem=num%2;
            res=res*10+rem;
            num/=2;
        }
        System.out.println(res);
    }
}
