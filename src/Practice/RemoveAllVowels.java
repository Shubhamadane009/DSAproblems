package Practice;

import java.util.Scanner;

public class RemoveAllVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string :");
        String s=sc.next();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
               continue;
            }
            else{
                System.out.print(c);
            }
        }
    }
}
