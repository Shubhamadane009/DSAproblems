package Problems;

public class LowerBound {
    public static void main(String[]args)
    {
        int nums[]={1,3,5,6};

        int target=2;
        int ans=nums.length;

        int low=0,high=nums.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<=target)
            {
                ans=nums[mid];
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
