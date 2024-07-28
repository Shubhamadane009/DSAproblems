package Problems;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int nums[] = {6, 7, 1, 2, 3, 4, 5};
        int target=3;
        int low=0,high=nums.length-1,mid;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                System.out.println("element found");
                break;
            }

            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=target && target>=nums[mid])
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else
            {
                if(nums[mid]>=target && target<=nums[high])
                {
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }


    }
}
