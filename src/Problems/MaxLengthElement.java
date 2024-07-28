package Problems;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthElement {
    public static void main(String[]args)
    {
        int nums[]={1,2,3,4,4,5,4,3,6,3,4,5,6,6,6,6,6,6,6,7,8,9};

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],count);
            }

            map.computeIfPresent(nums[i],(k,v)->v+1);
           //if the key is already present in out map
            //then this method will increment the value associated
            //with it by 1
        }
        int maxKey=Integer.MIN_VALUE;
        int maxValue=Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer>entry: map.entrySet())
        {
            if(entry.getValue()>maxValue)
            {
                maxValue= entry.getValue();
                maxKey= entry.getKey();
            }
        }
        System.out.println(map);
        System.out.println(maxKey);

    }
}
