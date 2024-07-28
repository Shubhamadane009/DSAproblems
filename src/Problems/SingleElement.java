package Problems;

public class SingleElement {
    public static void main(String[]args)
    {
        int nums[]={1,1,3,3,4,5,5,6,6};

        System.out.println("Single element is :");
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums.length==1)
                System.out.println(nums[0]);
            if(i==0 && nums[i]!=nums[i+1])
                System.out.println(nums[i]);
            if(i==nums.length-1 && nums[i]!=nums[i-1])
                System.out.println(nums[i]);
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1])
                System.out.println(nums[i]);
        }



    }
}
