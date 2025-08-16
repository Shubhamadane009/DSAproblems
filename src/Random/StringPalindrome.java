package Random;

public class StringPalindrome {
    public static void main(String[] args) {
        String s="1231";
        int num=Integer.parseInt(String.valueOf(s));
        String temp=s;

        int rem=0,sum=0;

       for(int i=0;i<s.length();i++)
       {
           while(num!=0)
           {
               char ch=s.charAt(i);

               rem=num%10;
               sum=sum*10+rem;
               num/=10;
           }
       }
       if(sum==Integer.parseInt(String.valueOf(temp)))
       {
           System.out.println("palindrome");
       }
       else{
           System.out.println("not palindrome");
       }
    }
}
