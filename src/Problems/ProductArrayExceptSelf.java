package Problems;

public class ProductArrayExceptSelf {
    public static void main(String[]args)
    {
        int nums[]={1,2,3,4};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int p=1;
            for(int j=0;j<nums.length;j++)
            {
                if(j!=i)
                {
                    p*=nums[j];
                }
            }
            System.out.println(p);
        }

    }
}
