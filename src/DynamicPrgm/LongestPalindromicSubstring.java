package DynamicPrgm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "ababad";
        String str1 = "daddy";
        System.out.println(str1);
        longestPalindromeSubstring(str1);
    }

    private static void longestPalindromeSubstring(String str) {
//        boolean[][] dpt = new boolean[str.length()][str.length()];
////        traverse2d(dpt);
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i; j < str.length(); j++) {
//                if (i == j) dpt[j][i] = true;
//                if (i + 1 < j - 1) {
//                    if ((str.charAt(j) == str.charAt(i)) && dpt[i + 1][j - 1]) {
//                        dpt[j][i] = true;
//                    }
//                }
//            }
//        }
//
//        traverse2d(dpt);

String path="/a/../../b/../c//.//";
        String[] str2=path.split("../");
    }

    private static void traverse2d(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("   " + arr[i][j]);
            }
            System.out.println();
        }
    }


//    private static void longestPalindromeSubstring(String str) {
//        if (str == null || str.isEmpty()) return;
//        List<String> list = new LinkedList<>();
//        for (int i = 0; i < str.length(); i++) {
//            String temp = "";
//            for (int j = i; j < str.length(); j++) {
//
//                temp = temp + str.charAt(j);
//                if (isPalindrome(temp))
//                    list.add(temp);
////            System.out.println(temp);
//            }
////        System.out.println(temp);
//        }
//        System.out.println(list);
//    }
//
//    private static boolean isPalindrome(String str) {
//
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) ;
//            else {
//
//                return false;
//            }
//        }
//        return true;
//    }
}
