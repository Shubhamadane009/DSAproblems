package Problems;

import java.util.Scanner;

public class FactorialRecursive {

    public static long facto(long n)
    {
        if(n>1)
        return n*facto(n-1);

        else
            return 1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        long n=sc.nextInt();

        System.out.println("Factorial using recursion :"+facto(n));
    }
}
