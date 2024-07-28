package Problems;

public class MaxPointsYouCanObtainFromCards {
    public static void main(String[]args)
    {
        int nums[]={1,2,3,4,5,6,1};
        int k=3;
        int lsum=0,rsum=0,max=0;
        for(int i=0;i<k;i++) {
            lsum = lsum + nums[i];
            max = lsum;
        }
            int rIndex=nums.length-1;
            for(int i=k-1;i>=0;i--)
            {
                lsum=lsum-nums[i];
                rsum=rsum+nums[rIndex];
                rIndex=rIndex-1;

                max=Math.max(max,lsum+rsum);

            }
            System.out.println(max);


    }
}
