package Practice;

public class ArrayConcat {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};

        int result[]=nums.clone();

        for(int i=0;i<nums.length;i++)
        {
            //result[]=nums[i];
        }


        for(int i=0;i<(result.length+nums.length);i++)
        {
            System.out.println(result[i]);
        }
    }
}
