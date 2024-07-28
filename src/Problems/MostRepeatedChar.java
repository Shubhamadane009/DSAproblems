package Problems;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedChar {
    public static void main (String[]args)
    {
        String s="shubham";

        Map<Character,Integer> map=new HashMap<>();


        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int count=0;

           if(!map.containsKey(c))
            {
               map.put(c,count);
            }

            map.computeIfPresent(c,(k,v)->v+1);

        }
        System.out.println(map);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        char c2= '\0';
        char c3='\0';

        for(Map.Entry<Character,Integer>entry: map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max= entry.getValue();
                c2= entry.getKey();
            }

        }
        System.out.println("Max character :"+c2);
    }
}
