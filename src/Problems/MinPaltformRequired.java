package Problems;

public class MinPaltformRequired {
    public static void main(String[] args) {
       long arr[] = {900,940,955,1100,1500,1800};
       long dep[] = {910,1200,1120,1130,1900,2000};

       int max=0;

       for(int i=0;i<dep.length;i++)
       {
           int count=0;
           for(int j=i+1;j<arr.length;j++)
           {
               if((arr[i]>=arr[j] && arr[i]<=dep[j]) ||
                       (arr[j]>=arr[i] && arr[j]<=dep[i]))
               {
                   count++;
               }
               max=Math.max(max,count);
           }
       }
        System.out.println(max+1);
    }
}

//time comlexity -->near about O(2N)