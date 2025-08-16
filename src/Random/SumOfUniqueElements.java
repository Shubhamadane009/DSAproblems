package Random;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int nums[]={1,2,1,3,};

       Set<Integer> set=new HashSet<>();

       for(int i=0;i<nums.length;i++)
       {
           set.add(nums[i]);
       }
       int sum=0;

       for(int x:set)
       {
           sum+=x;
       }
        System.out.println(sum);

    }
}
