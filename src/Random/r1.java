package Random;

import java.util.Arrays;

public class r1 {
    public static void main(String[] args) {
        String s="balllloon";

        int char_count[]=new int[26];

        for(int i=0;i<s.length();i++)
        {
            char_count[s.charAt(i)-'a']++;
        }

        int min=char_count[0];
        min=Math.min(min,char_count[11]/2);

        System.out.println(Arrays.toString(char_count));
    }
}
