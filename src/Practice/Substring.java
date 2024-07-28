package Practice;

public class Substring {
    public static void main (String[]args)
    {
        String[] s={"shubham"};


        for(int i=0;i<s.length;i++)
        {
            String sub="";

            for(int j=0;j<s.length;j++)
            {

                sub+=s[i];


            }
            System.out.println(sub);
        }
    }
}
