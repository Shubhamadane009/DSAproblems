package Recursion;

public class Printing1to10Backtracking {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int i)
    {
        if(i>10)
        return;

        print(i+1);
        System.out.println(i);
    }
}
