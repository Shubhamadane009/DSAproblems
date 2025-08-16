package Problems;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TCS_NQThard {



    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a password:");
        String p=sc.next();

        if(p.length()<8)
        {
            System.out.println("length too short");
            return;
        }

        Boolean hasupper=false;
        Boolean haslower=false;
        Boolean hasdigit=false;
        Boolean hasspecial=false;
        Boolean accepted=false;

        for(int i=0;i<p.length();i++)
        {
            char c=p.charAt(i);

            if((c>='a' && c<='z'))
            {
               haslower=true;
            }
            else if((c>='0' && c<='9'))
            {
               hasdigit=true;
            }
            else if(c>='A' && c<='Z')
            {
                hasupper=true;
            }

            else{
                hasspecial=true;
            }
        }
        if(haslower && hasupper && hasdigit && hasspecial)
        {
            System.out.println("Password accepted");
        }
        else{
            System.out.println("Password rejected");
            return;
        }


    }
}
