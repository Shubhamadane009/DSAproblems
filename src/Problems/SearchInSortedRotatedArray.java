package Problems;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int nums[]={3,4,5,6,7,1,2};
        int target=1;

        int low=0,high=nums.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                System.out.println("true");
                return;
            }
            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=target && target<=nums[mid])
                {

                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else {
                if(target>=nums[mid] && target <=nums[high])
                {

                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        System.out.println("false");

    }
}
