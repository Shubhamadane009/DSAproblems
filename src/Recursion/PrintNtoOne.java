package Recursion;

public class PrintNtoOne {
    public static void main(String[] args) {
          print(10);
    }
    public static void print(int i)
    {
        if(i<1)
            return;

        System.out.println(i);
        print(i-1);
    }
}
