package Problems;
import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n:");
        int num1=sc.nextInt();

        int a=0,b=1;
        int c=a+b;

        System.out.println(a);
        System.out.println(b);

        for(int i=3;i<=num1;i++)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;



        }
    }
}
