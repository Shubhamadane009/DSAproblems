package Problems;

import java.util.HashMap;
import java.util.Map;

public class FruitBasketOptimal {
    public static void main(String[]args)
    {
        int nums[]={0,1,2,2};


        int maxlen=0,l=0,r=0;

        Map<Integer,Integer>map=new HashMap<>();

       while(r<nums.length)
       {
           int currentCount=map.getOrDefault(nums[r],0);
           map.put(nums[r],currentCount+1);


           if(map.size()>2) {
               while (map.size() > 2) {
                   int count = map.get(nums[l]);
                   map.put(nums[l], count - 1);

                   if (count == 1) {
                       map.remove(nums[l]);
                   }
                   l++;
               }
           }
               if(map.size()<=2)
               {
                   maxlen=Math.max(maxlen,r-l+1);
               }
               r++;

       }
        System.out.println(maxlen);
    }
}
//time complexity-->O(2n)