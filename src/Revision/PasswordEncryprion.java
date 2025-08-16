package Revision;


import java.util.Scanner;

public class PasswordEncryprion {
    public static void main(String[] args) {
        System.out.println("Enter password :");
        Scanner sc=new Scanner(System.in);
        String pass=sc.next();

        if(pass.length()>8)
        {
            System.out.println("Password length is geater than 8");
        }

        boolean isAlpha=false,isSamll=false,isDigit=false,isSpecial=false;
        for(int i=0;i<pass.length();i++)
        {
            char ch=pass.charAt(i);

            if(ch>='A' && ch<='Z')
            {
                isAlpha=true;
            }
            else if(ch>='a' && ch <='z')
            {
                isSamll=true;
            }
            else if(ch>='0' && ch<='9')
            {
                isDigit=true;
            }
            else{
                isSpecial=true;
            }
        }

        StringBuilder sb=new StringBuilder();
        char c;
        if(isAlpha && isDigit && isSamll && isSpecial)
        {
            for(int i=0;i<pass.length();i++)
            {
                char ch=pass.charAt(i);
                if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
                { c=(char) (ch+2);}
                else{
                    c=pass.charAt(i);
                }

                sb.append(c+"");

            }
            System.out.println("Password is accepted");
            System.out.println("Password before encryption :"+pass);
            System.out.println("Your encrypted password is :"+sb.toString());
        }
        else{
            System.out.println("Passord doesn't meet our citeria");
        }
    }
}
