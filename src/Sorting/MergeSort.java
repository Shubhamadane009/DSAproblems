package Sorting;

import java.util.ArrayList;

public class MergeSort{
    public static void merge(int[] nums,int low,int mid,int high)
    {
        ArrayList<Integer>temp=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high)//this condition works until either of the two arrays gets exhausted
        {
            if(nums[left]<=nums[right])
            {
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(nums[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            nums[i]=temp.get(i-low);
        }

    }

    public static void mergesort(int[] nums,int low,int high)
    {
        if(low>=high)
            return;
        int mid=(low+high)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);

    }
    //info about this psuedocode is well in written form

    public static void main(String[] args) {
        int nums[]={3,1,2,4,1,5,2,6,4};
        int n= nums.length;

        MergeSort.mergesort(nums,0,n-1);

       for(int i=0;i<n;i++)
       {
           System.out.print(nums[i]+" ");
       }
    }
}