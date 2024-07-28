package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {23, 221, 45, 675, 32, 57, 2, 4, 677};

         for(int i=0;i<nums.length-1;i++)
         {
             for(int j=i+1;j<nums.length;j++)
             {
                 if(nums[i]>nums[j])
                 {
                     int temp=nums[i];
                     nums[i]=nums[j];
                     nums[j]=temp;
                 }
             }
         }

        System.out.println("Bubble sort...");
        for(int x:nums)
        {
            System.out.print(x+" ");
        }
    }
}
//each element is compared with its adjacent element