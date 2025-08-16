package Revision;

import java.util.Arrays;

public class GroupAnagram {
    public static void main(String[] args) {
        String strs[]={"eat","tea","tan","ate","nat","bat"};

        Arrays.sort(strs);

        for(int i=0;i<strs.length;i++) {
            System.out.println(strs[i]);
        }
    }
}
