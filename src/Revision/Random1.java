package Revision;

import java.util.*;

public class Random1 {
    public static void main(String[]args)
    {
        int nums[]={1,1,2,3,3,4,4};//1122334

       // Arrays.sort(nums);

        if(nums[0]!=nums[1])
        {
            System.out.println(nums[0]);
            return;
        }

        if(nums[nums.length-1]!=nums[nums.length-2])
        {
            System.out.println(nums[nums.length-1]);
            return;
        }

       for(int i=1;i<nums.length-1;i++)
       {
           if(nums[i-1]==nums[i] || nums[i+1]==nums[i])
           {
               continue;
           }
           else{
               System.out.println(nums[i]);
               return;
           }
       }
    }
}
