package Problems;

public class MaxConsecutive1With2Zeros {
    public static void main(String[]args)
    {
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==0)
                {
                    count++;
                }
                else if(count<=k)
                {
                    max=Math.max(max,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(max);

    }
}

//Time complexity-->O(n^2)
//Space complexity--->O(1)

//we just shifted j in forward direction untill it encounters
// 3rd zero ,the movement it encounters third zero the inner loop will get breaked.
// and the outer loop will increment the value of i by 1
// this precess will be continued untill i completes the outer loop iterations.
//And in the mean time the max length will be stored in max variable
//by calculating the length between ith index and jth index.
//thats all