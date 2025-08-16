package Revision2;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s="shubham";
        int max=0;

        for(int i=0;i<s.length();i++)
        {
            int hash[] =new int[255];

            for(int j=i;j<s.length();j++)
            {
                char ch = s.charAt(j);
                int ascii = (int)ch;

                if(hash[ascii]==1)
                 break;

                hash[ascii]=1;
                max = Math.max(max,j-i+1);
            }
        }
        System.out.println(max);
    }
}
