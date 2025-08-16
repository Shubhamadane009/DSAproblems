package Recursion;

public class PrintNumbersLinerly {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int i)
    {
        if(i>10)
            return;

        System.out.println(i);
        print(i+1);
    }
}
