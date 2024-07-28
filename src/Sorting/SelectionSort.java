package Sorting;

public class SelectionSort {
    public static void main(String[]args)
    {
        int nums[]={23,12,34,11,4,21};

        for(int i=0;i<nums.length;i++)
        {
            int min=i;

            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[min]>nums[j])
                {
                    min=j;
                }
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        System.out.println("Selection sort...");
        for(int x:nums)
        {
            System.out.print(x+" ");
        }
    }
}
//In selection sort we ba