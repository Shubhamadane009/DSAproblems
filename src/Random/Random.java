package Random;

import com.sun.security.jgss.GSSUtil;

public class Random {
    public static void main(String[] args) {
        String s="123";
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(Integer.parseInt(String.valueOf(ch))%2==0)
            {
                max=Math.max(max,Integer.parseInt(String.valueOf(ch)));
            }
        }
        System.out.println(max);
    }
}
