package Problems;

import java.util.HashMap;
import java.util.Map;

public class TopKfrequentElement {
    public static void main(String[] args) {

        int nums[]={1,1,1,2,2,3};

        int k=2;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {

           int count= map.getOrDefault(nums[i],0);
            map.put(nums[i],count+1);

            if(map.size()>k)
            {

            }
        }

    }
}
