package Random;

public class LargerstProductSubarray_CodeFactory {
    public static void main(String[] args) {
        int nums[]={-2,0,-1};
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int p=1;
            for(int j=i;j<nums.length;j++)
            {
                p=p*nums[j];
                max=Math.max(max,p);

            }
        }
        System.out.println(max);
    }
}
