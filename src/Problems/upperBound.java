package Problems;

public class upperBound {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=3;

        int low=0,high=nums.length-1,ans=0;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>target)
            {
                ans=nums[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
