package Problems;

public class upperBound {
    public static void main(String[] args) {
        int nums[]={2,4,6,8,8,8,11,13};
        int target=8;

        int low=0,high=nums.length-1,ans=0;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>target)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
