package Random;

public class CodeFactory63 {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int k=2;

        int low=0,high=nums.length,ans=0;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>=k)
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
