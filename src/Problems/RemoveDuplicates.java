package Problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};

       Set<Integer>set=new HashSet<>();

       for(int i=0;i<nums.length;i++)

       {
           set.add(nums[i]);
       }

        for(int x:set)
        {
            System.out.print(x+" ");
        }



    }
}
