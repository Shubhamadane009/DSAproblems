package Problems;

public class SearchInUnsortedArray {
    public static void main(String[]args)
    {
        int nums[]={1,2,34,23,56,33,67,68,98,14,55};
        int target=56;
        int front=0,back= nums.length-1;

        while(front<=back)
        {
            if(nums[front]==target || nums[back]==target)
            {
                System.out.println("search success");
                break;
            }
            front++;

            back--;
        }

    }
}
