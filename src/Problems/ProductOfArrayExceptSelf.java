package Problems;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[]={-1,1,0,-3,3};

        for(int i=0;i<nums.length;i++)
        {
            int p=1;
            for(int j=0;j<nums.length;j++)
            {
                if(j!=i)
                {
                    p=p*nums[j];
                }
            }
            System.out.print(" "+p);
        }
    }
}
