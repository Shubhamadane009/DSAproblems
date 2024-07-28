package Problems;

import java.util.HashMap;
import java.util.Map;

public class FruitBasketOptimized {
    public static void main(String[]args)
    {
        int nums[]={1,2,3,2,2};

        Map<Integer,Integer>map=new HashMap<>();

        int l=0,r=0,max=Integer.MIN_VALUE;

        while(r<nums.length)
        {
            int CurrCount=map.getOrDefault(nums[r],0);
            map.put(nums[r],CurrCount+1);

            if(map.size()>2)
            {
                int count=map.get(nums[l]);
                map.put(nums[l],count-1);

                if(count==1)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            if(map.size()<=2)
            {
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        System.out.println(max);
    }
}
