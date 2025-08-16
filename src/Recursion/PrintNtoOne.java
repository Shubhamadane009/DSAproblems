package Recursion;

public class PrintNtoOne {
    public static void main(String[] args) {
          print(10);
    }
    public static void print(int i)
    {
        if(i<1)
            return;

        print(i-1);
        System.out.println(i);
//this is backtracking when the print statement is after the function call
    }
}
