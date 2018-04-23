public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x < 0) { return false; }
        int n = 0;
        int tx = x;
        while (tx != 0) {
            n ++;
            tx /= 10;
        }

        for (int i = 0, j = n-1; i <=j; i++,j--) {
            if(!getKMthNumber(x, i, j)){
                return false;
            }
        }

        return true;
    }

    static boolean getKMthNumber(int x, int lo, int hi) {
        // System.out.printf("%d,%d,%d\n", x, lo, hi);
        int i = 0;
        for (; i < lo; i++) {
            x /= 10;
        }

        int lonum = x % 10;

        for (int j = i; i < hi; i++) {
            x /= 10;
        }

        int hinum = x % 10;

        // System.out.println(lonum + ":" + hinum);

        return lonum == hinum;
    }

    public static void main(String[] args) {
       // System.out.println(getKMthNumber(272,0,2));
        System.out.println(isPalindrome(1));
    }
}
