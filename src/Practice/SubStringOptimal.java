package Practice;

import java.util.HashSet;
import java.util.Set;

public class SubStringOptimal {
    public static void main(String[]args)
    {
        String s=" ";

        if(s.length()==0)
        {
            System.out.println("404 error");
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            Set<Character>set=new HashSet<>();

            for(int j=i;j<s.length();j++)
            {
                if(set.contains(s.charAt(j)))
                {
                    max=Math.max(max,j-i);
                    break;
                }
                set.add(s.charAt(j));
            }
        }
        System.out.println(max);
    }
}
