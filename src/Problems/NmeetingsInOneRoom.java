package Problems;

import java.util.Arrays;

public class NmeetingsInOneRoom {
    public static void main(String[] args) {
        int start[]={0,3,1,5,5,8};
        int end[]={5,4,2,9,7,9};

        Arrays.sort(start);
        Arrays.sort(end);
        int count=0;
        int l=0,r=0;
       while(l<start.length && r<end.length){

           if(start[l]>end[r])
           {
               count++;
               r++;
           }
           else {
               l++;
           }
        }
        System.out.println(count);
    }
}
