package Problems;

public class MaxConsecutive1With2ZerosOptimal {
    public static void main(String[]args)
    {
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};

        int r=0,l=0;
        int max=Integer.MIN_VALUE;
        int zeros=0;
        int k=2;
        while(r<nums.length)
        {
            if(nums[r]==0)
            {
                zeros++;
            }
            if(zeros>k)
            {
                if(nums[l]==0)
                {
                    zeros--;
                }
                l++;
            }
            if(zeros<=k)
            {
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        System.out.println(max);

    }
}


//time complexity-->O(2n)
//this is sliding window approach