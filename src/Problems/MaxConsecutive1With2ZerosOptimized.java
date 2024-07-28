package Problems;

public class MaxConsecutive1With2ZerosOptimized {
    public static void main(String[]args)
    {
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int l=0,r=0,maxlength=Integer.MIN_VALUE,zeros=0;

        while(r<nums.length)
        {
            if(nums[r]==0)
            {
                zeros++;
            }
            while(zeros>k)
            {
                if(nums[l]==0)
                {
                    zeros--;
                }
                l++;
            }
            if(zeros<=k)
            {
                maxlength=Math.max(maxlength,r-l+1);
            }
            r++;
        }
        System.out.println(maxlength);
    }
}
