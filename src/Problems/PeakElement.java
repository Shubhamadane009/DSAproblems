package Problems;

import java.util.*;

public class PeakElement {
    public static void main(String[]args)
    {
        int nums[]={2,3,4,5,1};

        if(nums[0]>nums[1])
            System.out.println("Peak element :"+nums[0]);
        if(nums[nums.length-1]>nums[nums.length-2])
            System.out.println("Peak element :"+nums[nums.length-1]);

        int low=1,high=nums.length-2;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                System.out.println("Peak element :"+nums[mid]);
                break;
            }

            else if(nums[mid]>nums[mid-1])
            {
                low=mid+1;
            }
            else if(nums[mid]>nums[mid+1]){
                high=mid-1;
            }
            else{
                high=mid-1;
            }
        }


    }
}
