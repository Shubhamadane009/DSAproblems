package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String s1=sc.next();

        System.out.println("enter string 2");
        String s2=sc.next();

        if(s1.length()!=s2.length())
        {
            System.out.println("not anagram");
            return;
        }

        char[]c1=s1.toCharArray();
        char[]c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean ans=false;
        for(int i=0;i< c1.length;i++)
        {
            if(c1[i]==c2[i])
            {
                ans=true;
            }
        }

        if(ans==true)
        {
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}
