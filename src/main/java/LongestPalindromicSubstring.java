public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {

            String t = palindromeLength(s, i);
            if(res.length() < t.length()) {
                res = t;
            }
        }
        return res;
    }

    static String palindromeLength(String s, int index) {
        int lo=index, hi=index;
        while (lo-1 > -1 && s.charAt(lo-1) == s.charAt(index)) { lo--;}
        while (hi+1 < s.length() && s.charAt(hi+1) == s.charAt(index)) { hi++; }

        System.out.println(lo + ":" + hi);

        while (lo-1 > -1 && hi+1 < s.length() && s.charAt(lo-1) == s.charAt(hi+1)){ lo--; hi++;}
        System.out.println(lo + ":" + hi);

        return s.substring(lo, hi+1);
    }

    public static void main(String[] args) {
        // System.out.println(palindromeLength("aaabbbaa", 4));
        System.out.println(longestPalindrome("cbbd"));
    }
}
