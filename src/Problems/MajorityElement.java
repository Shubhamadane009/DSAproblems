package Problems;

public class MajorityElement {
    public static void main (String[]args)
    {
        int nums[]={3,2,3,3,1};
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;

            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>(nums.length)/2)
            {
                result=nums[i];

            }
        }
        System.out.println("Majority element :");
        System.out.println(result);
    }
}
