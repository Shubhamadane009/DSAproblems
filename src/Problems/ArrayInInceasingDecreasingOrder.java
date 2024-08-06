package Problems;

import java.util.Arrays;

public class ArrayInInceasingDecreasingOrder {
    public static void main(String[] args) {
        int nums[]={4 ,2 ,8 ,6 ,15, 5 ,9 ,20 };

        Arrays.sort(nums);

        for(int i=0;i<(nums.length/2);i++)
        {
            System.out.print(nums[i]+" ");
        }

        for(int i=nums.length-1;i>=(nums.length/2);i--)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
