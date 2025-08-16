package Random;

public class CodeFactory63_1 {
    public static void main(String[] args) {
        int num=-121;
        int temp=num;

        if(num<0)
        {
            System.out.println("negative number cant be reversed");
            return;
        }
        int sum=0,rem=0;
        while(num!=0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        if(sum==temp)
        {
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
