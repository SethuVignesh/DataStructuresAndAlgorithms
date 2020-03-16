package DynamicPrgm;

public class LongestValidParenthesis {
    public static void main(String[] args) {
System.out.print(longestValidParanathesis("()()()()))"));
    }

    private static int longestValidParanathesis(String str) {
        int counter = 0;
        int validLength=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else if (str.charAt(i) == ')') {
                if(counter<1) continue;
                counter --;
            }
            validLength++;
        }

        return validLength;
    }
}
