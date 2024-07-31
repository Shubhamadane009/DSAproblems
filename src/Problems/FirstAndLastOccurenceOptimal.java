package Problems;

public class FirstAndLastOccurenceOptimal {
    public static void main(String[] args) {
        int nums[]={2,4,6,8,8,8,11,13};
        int k=8,ans=0,result=0;

        int low=0,high=nums.length-1;
        int start=0,end=nums.length-1;

        while (low<=high)
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

        while (start<=end)
        {
            int mid=(start+end)/2;

            if(nums[mid]>k)
            {
                result=mid;
                end=mid-1;
            }
            else{

                start=mid+1;
            }
        }
        System.out.println(ans+","+result);
    }
}
