package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FruitBasket {
    public static void main (String[]args)
    {
        int nums[]={3,3,3,1,2,1,1,2,3,3,4};
        int max=Integer.MIN_VALUE;


       for(int i=0;i<nums.length;i++)
       {
           Set<Integer>set=new HashSet<>();
           for(int j=i;j<nums.length;j++)
           {
               set.add(nums[j]);

               if(set.size()<=2)
               {
                   max=Math.max(max,j-i+1);
               }
               else{
                   break;
               }
           }
       }
        System.out.println(max);

    }
}

//time complexity-->O(n^2)
//fruits basket is all about length of longest contigious
//subarray having 2 distinct element at the most