package Practice;

import java.util.HashSet;
import java.util.Set;

public class ValidInputString {
    public static void main(String[] args) {
        String s="{}[]{}";

        char[]c=s.toCharArray();

      if(s.length()==0)
      {
          System.out.println("false");
          return;
      }
      Set<Character>set=new HashSet<>();
      for(int i=0;i<c.length;i++)
      {
          if(c[i]=='(' || c[i]=='{' || c[i]=='[')
          {
              set.add(c[i]);
          }

           else if(c[i]==')')
          {
              if(!set.contains('(' ))
              {

                  System.out.println("false");
                  return;
              }
          }
           else if(c[i]=='}')
           {
               if(!set.contains('{' ))
               {

                   System.out.println("false");
                   return;
               }
           }
           else
           {
               if(!set.contains('[' ))
               {

                   System.out.println("false");
                   return;
               }
           }
      }
        System.out.println("true");

    }
}
