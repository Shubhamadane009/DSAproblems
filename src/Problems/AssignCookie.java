package Problems;

import java.util.Arrays;

public class AssignCookie {
    public static void main(String[] args) {
        int greed[]={1, 5, 3, 3, 4};//r pointer initialized at greed[0]
        int cookies[]={4, 2, 1, 2, 1, 3};//l pointer is initialized at cookies[0]

        int r=0,l=0;

        Arrays.sort(greed);
        Arrays.sort(cookies);

        while(r<greed.length && l<cookies.length)
        {
           if(greed[r]<=cookies[l])
           {
               r++;
           }
            l++;


        }
        System.out.println(r);
    }
}
