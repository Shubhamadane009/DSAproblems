package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences2 {
    public static void main(String[] args) {
         int arr[]={1,2,1};
         List<Integer> list = new ArrayList<>();
         print(0,arr.length,list,arr,0);

    }

    public static void print(int i,int n,List<Integer>list,int arr[],int sum)
    {
        if(i>=n)
        {
            if(sum==2)
            {
                System.out.println(list);

            }
            return;
        }
        list.add(arr[i]);
        sum+=arr[i];

        print(i+1,n,list,arr,sum);

        sum-=list.get(list.size()-1);
        list.remove(list.size()-1);
        print(i+1,n,list,arr,sum);


    }

}
