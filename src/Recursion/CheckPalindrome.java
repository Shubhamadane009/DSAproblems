package Recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        Boolean ans = Palindrome(0,"madam");
        System.out.println(ans);
    }
    public static Boolean Palindrome(int i,String s)
    {
        if(i>s.length()/2)
            return true;

        if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;

        return Palindrome(i+1,s);
    }
}
