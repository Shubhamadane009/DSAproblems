package Random;

import java.util.Arrays;

public class NoOfUnSortedElements {
    public static void main(String[] args) {
        int nums[]={5,1,2,3,4};
        int count=0;



        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
