
/**
 * 7. Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {
    public static int reverse(int x) {
        long res = 0;
        while(x != 0) {
            res = res*10 + x % 10;

            x /= 10;
            // 检查是否有溢出
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1230));
    }
}
