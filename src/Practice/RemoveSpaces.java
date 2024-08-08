package Practice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string :");
        String s=sc.nextLine();

        s.trim();
        System.out.println(s.length());
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                System.out.print(c);
            }

        }
    }
}
