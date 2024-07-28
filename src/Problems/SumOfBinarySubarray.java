package Problems;

public class SumOfBinarySubarray {
    public static void main(String[]args)
    {
        int nums[]={1,0,1,0,1};
        int goal=0;

        int r=0,l=0,sum=0,count=0;

        while(r<nums.length)
        {
            sum+=nums[r];

            while(sum>goal)
            {
                sum-=nums[l];
                l++;
            }

            count+=r-l+1;

            r++;
        }
        System.out.println(count);
    }
}
