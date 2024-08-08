package Practice;

import java.util.Scanner;

public class RemoveCharactersExceptAlphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string :");
        String s=sc.nextLine();


        System.out.println(s);

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c>='a' && c <='z')
            {
                System.out.print(c);
            }
        }
    }
}
