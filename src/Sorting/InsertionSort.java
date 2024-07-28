package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {23,4,13,22};

        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;

            }

        }
        System.out.println("Insertion sort...");
        for(int x:nums)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}

//here the array is divided into two parts sorted and unsorted
//and  the 1st element of array is considerd as by default sorted .
//pick an element from unsorted part and place it accordingly in the sorted part
