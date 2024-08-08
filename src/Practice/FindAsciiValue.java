package Practice;

import java.util.Scanner;

public class FindAsciiValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter character");
        String s=sc.next();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            System.out.println((int) c);
        }

    }
}
