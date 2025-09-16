package Revision;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int max= Integer.MIN_VALUE;

        int k=2;

        for(int i=0;i<nums.length;i++)
        { int zero=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==0)
                {
                    zero++;
                }
                if(zero>k)
                {
                    break;
                }
                max = Math.max(max,j-i+1);

            }
        }
        System.out.println(max);
    }
}
