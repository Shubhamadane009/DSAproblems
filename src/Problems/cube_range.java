package Problems;

public class cube_range {

    public static void main(String[] args) {
       int res=0;

        for(int i=4;i<=9;i++)
        {
            res=res+i*i*i;

        }
        System.out.println(res);
    }
}
