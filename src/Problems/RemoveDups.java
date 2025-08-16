package Problems;

public class RemoveDups {
    public static void main(String[] args) {
        int  nums[]={1,1,2,3,4,3,5};

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    for(int k=j;k<nums.length-1;k++) {
                        nums[k] = nums[k + 1];

                    }
                    j--;
                }
            }
            System.out.print(" "+nums[i]);
        }

    }
}
