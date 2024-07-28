package Problems;

public class Frequency {

    public static void main(String[]args)
    {
        int nums[]={1,2,3,2,3,2,3,4,5,45,5};

        int visit[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            visit[i]=0;
        }

        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            if(visit[i]==1)
            {
                continue;
            }
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                    visit[j]=1;
                }
            }
            System.out.println(nums[i]+"-->"+count);
        }
    }
}
