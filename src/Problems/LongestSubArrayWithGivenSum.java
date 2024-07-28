package Problems;

public class LongestSubArrayWithGivenSum {
    public static void main(String[]args)
    {
        int nums[]={1,2,3,4,5};
        int k=14;
        int result=Integer.MIN_VALUE;


       for(int i=0;i<nums.length;i++)
       {
           int curr_sum=0;

           for(int j=i;j<nums.length;j++)
           {

               if((curr_sum+=nums[j])==k)
               {

                   result=Math.max(result,j-i+1);

               }

           }

       }

        System.out.println(result);



    }
}

