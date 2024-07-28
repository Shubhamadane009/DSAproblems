package Problems;

public class ProductSubarray {
    public static void main(String[]args)
    {
        int nums[]={1,3,0,2};

        int result=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int p=1;
            for(int j=i;j<nums.length;j++)
            {
                 p=p*nums[j];
                 result= Math.max(result,p);
            }
        }
        System.out.println("Product subarray :"+result);
    }
}
