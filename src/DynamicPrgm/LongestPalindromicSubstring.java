package DynamicPrgm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "ababad";
        String str1 = "daddy";
        longestPalindromeSubstring(str);
    }

    private static void longestPalindromeSubstring(String str) {
        if (str == null || str.isEmpty()) return;
        List<String> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {

                temp = temp + str.charAt(j);
                if (isPalindrome(temp))
                    list.add(temp);
//            System.out.println(temp);
            }
//        System.out.println(temp);
        }
        System.out.println(list);
    }

    private static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) ;
            else {

                return false;
            }
        }
        return true;
    }
}
