package Recursion;
import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {
    public static void print(int i,int n,ArrayList<Integer> list,int arr[])
    {
          if(i>=n)
          {
              System.out.println(list);
              return;
          }
          list.add(arr[i]);
          print(i+1,n,list,arr);

          list.remove(list.size()-1);
          print(i+1,n,list,arr);
    }

    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        int arr[] = {3,1,2};

        print(0,arr.length, (ArrayList<Integer>) list,arr);

    }
}
