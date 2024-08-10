package Problems;

import java.util.Arrays;

public class MinPlatformOptimized {
    public static void main(String[] args) {

        long arr[] = {900,940,955,1100,1500,1800};
        long dep[] = {910,1200,1120,1130,1900,2000};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0,j=0,count=0,max=0;

        while(i<arr.length)
        {
            if(arr[i]<=dep[j])
            {
                count++;
                i++;
            }
            else if(arr[i]>=dep[j])
            {
                count--;
                j++;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);

    }
}
