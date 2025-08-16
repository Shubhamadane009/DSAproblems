package Random;

public class StringISPrimeOrNot {
    public static void main(String[] args) {
        String s="18";
        int count=0;
        for(int i=1;i<=(Integer.parseInt(String.valueOf(s)));i++)
        {
            if(Integer.parseInt(String.valueOf(s))%i==0)
            {
                count++;
            }
        }
        System.out.println(count);
        if(count==2)
        {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
