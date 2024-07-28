package Problems;

public class MaxConsecutive1s {
    public static void main(String[]args)
    {
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==1)
                {
                    count++;
                    max= Math.max(max,count);

                }else {
                    count=0;

                }
            }
        }
        System.out.println(max);

    }
}
