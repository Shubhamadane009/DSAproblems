package Problems;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithKDifferentIntegersOptimal {
    public static void main(String[]args)
    {
        int nums[]={1,2,1,2,3};
        int k=2;

        Map<Integer,Integer> map=new HashMap<>();
        int r=0,l=0,count=0;

        while(r<nums.length)
        {
            int currCount=map.getOrDefault(nums[r],0);
            map.put(nums[r],currCount+1);

                     while (map.size() > k) {
                         int cnt = map.get(nums[l]);
                         map.put(nums[l], cnt - 1);

                         if (map.get(nums[l]) == 0) {
                             map.remove(nums[l]);
                         }
                         l++;
                     }

                count=count+(r-l+1);

            r++;
        }
        System.out.println(count);
    }
}

