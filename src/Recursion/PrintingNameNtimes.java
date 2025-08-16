package Recursion;

public class PrintingNameNtimes {
    public static void main(String[] args) {
        int n=5;
         print(1,n);
    }

    public static void print(int i,int n)
    {
        if(i>n)
            return;

        print(i+1,n);
        System.out.println("hi shubham");



    }

}



