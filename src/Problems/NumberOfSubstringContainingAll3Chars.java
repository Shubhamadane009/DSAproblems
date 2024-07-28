package Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfSubstringContainingAll3Chars {
    public static void main(String[]args)
    {
        String s="aaacb";
        char[] c=s.toCharArray();

        int count=0,max=0;
         for(int i=0;i<c.length;i++)
         {
             Set<Character> set=new HashSet<>();
             for(int j=i;j<c.length;j++)
             {
                 set.add(c[j]);
                 if(set.size()==3 && set.contains('a') && set.contains('b') && set.contains('c'))
                 {
                     count++;
                     //max=Math.max(max,count);
                 }
                 else if(set.size()>3){
                     break;
                 }
             }
         }
        System.out.println(count);
    }
}

//Actualy time limit  gets exceeded if used this
//brute force approach.
//but its not like this code doesn't works but takes more time