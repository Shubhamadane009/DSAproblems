package Random;

public class Power {
    public static void main(String[] args) {
        int nums1[]={1,2,3};
        int nums2[]={2,1};

        int count=0;

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(Math.pow(nums1[i],nums2[j])>Math.pow(nums2[j],nums1[i]))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
