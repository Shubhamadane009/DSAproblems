package Recursion;

public class CountSubsequences {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(print(0,arr.length,arr,0));
    }

    private static int print(int i,int n,int arr[],int sum)
    {
        if(i>=n)
        {
            if(sum==2)
            {
                return 1;
            }
            return  0;
        }

        sum+=arr[i];
        int l=print(i+1,n,arr,sum);

        sum-=arr[i];
        int r=print(i+1,n,arr,sum);

        return l+r;
    }
}
