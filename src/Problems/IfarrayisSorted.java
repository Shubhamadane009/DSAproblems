package Problems;

public class IfarrayisSorted {
    public static void main(String[]args)
    {
        int nums[]={1,2,3,4,5,6,7,8};

        boolean ans=false;
        for(int i=1;i<nums.length;i++)
        {
           for(int j=i-1;j<nums.length;j++)
           {
               if(nums[j]<nums[i])
               {
                   ans=true;

               }

           }
        }

        if(ans==true)
        {
            System.out.println("Array is sorted ");
        }
        else if(ans==false){
            System.out.println("Array is not sorted ");
        }
    }

}
