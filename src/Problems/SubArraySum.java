package Problems;

public class SubArraySum {
    public static void main(String[]args)
    {
        int nums[]={1,0,1,0,1};
        int key=2;
        int count=0;


        boolean ans=false;

        for(int i=0;i<nums.length;i++)
        {
            int curr_sum=0;
            for(int j=i;j<nums.length;j++)
            {
                if((curr_sum+=nums[j])==key)
                {
                    ans=true;
                    count++;
                }



            }

        }
        if(ans==true)
        {
            System.out.println("True");
        }
        else if(ans==false){
            System.out.println("False");
        }
        System.out.println("subarray count:"+count);
    }
}
