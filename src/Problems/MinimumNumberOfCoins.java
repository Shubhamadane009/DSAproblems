package Problems;

import java.util.Vector;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        int coins[]={1,5,6,9};
        int v=11;


        int count=0 ;

        Vector<Integer>ans=new Vector<>();

        for(int i=coins.length-1;i>=0;i--)
        {
            while(coins[i]<=v)
            {
                v=v-coins[i];
                ans.add(coins[i]);

            }
        }

        for(int i=0;i<ans.size();i++)
        {
            System.out.println(" "+ans.elementAt(i));
        }

    }
}

//actually the algorithm used is greedy algoritj=hm
//but we have certian bugs in this code
//eg. [1,4,5,6,9] and v=11
//then greedy algo gives us a answer as 3i.e 9+1+1
//but it can have better solution using Dynamic programming like
// 2 with 5+6