package Problems;

import java.util.Scanner;

public class AutoMorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number :");
        int num=sc.nextInt();

        int ans=num*num;
        int length=0;

        while(num!=0)
        {
            num/=10;
            length++;
        }

        int rem=0,result=0;

       for(int i=0;i<length;i++)
       {
          while(length!=0)
          {
              rem=ans%10;
              result=result*10+rem;
          }
       }
        System.out.println(result);
        System.out.println(length);
//       if(result==num)
//       {
//           System.out.println("number is automorphic");
//       }
//       else{
//           System.out.println("not automorphic");
//       }
    }
}
