package Problems;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithKDifferentIntegers {
    public static void main(String[]args)
    {
        int nums[]={1,2,1,2,3};
        int k=2;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
               set.add(nums[j]);

               if(set.size()==k )
               {
                   count++;
               }
               else if(set.size()>k){
                   break;
               }

            }
        }
        System.out.println(count);
    }
}
//actually its exceeding time limit on leetcode
//otherwise it runs well.