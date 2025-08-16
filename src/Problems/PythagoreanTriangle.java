package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PythagoreanTriangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();

        List<Double> list=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            System.out.println("enter "+n+" numbers");
            int num1=sc.nextInt();
            int num2=sc.nextInt();

            list.add(Math.sqrt(num1*num1+num2*num2));
        }
        System.out.println();

        for(Double x:list)
        {
            System.out.println(x);
        }


    }
}
