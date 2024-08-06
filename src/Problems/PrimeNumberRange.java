package Problems;
import java.util.*;
public class PrimeNumberRange {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter start:");
        int s=sc.nextInt();
        System.out.println("Enter end :");
        int e=sc.nextInt();

        for(int i=s;i<=e;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }

            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
