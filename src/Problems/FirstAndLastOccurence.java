package Problems;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int nums[]={2,4,6,8,8,8,11,13};
        int target=8;

        int first=-1,last=-1;

        for(int i=0;i<nums.length;i++)
        {


                if(nums[i]==target)
                {
                    if(first==-1)
                    {
                        first=i;
                    }
                    else{
                        last=i;

                    }

            }
        }
        System.out.println(first+","+last);
    }
}


//time complexity O(N)