package Random;

import java.util.Arrays;

public class Random1 {
    public static void main(String[] args) {
        int nums[]={5,1,2,3,4};
        int num1[]= nums.clone();

        Arrays.sort(nums);

        int count=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]!=num1[i])
           {
               count++;
           }
       }
        System.out.println(count);

    }
}
