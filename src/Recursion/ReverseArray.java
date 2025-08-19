package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,5,6,3,2,13};

        reverse(arr,0);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int arr[],int i)
    {
        if(i>=arr.length/2)
            return;

        swap(i,arr.length-i-1,arr);

        reverse(arr,i+1);
    }

    public static void swap(int l,int r,int arr[])
    {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r]= temp;
    }
}
