import java.util.ArrayList;
import java.util.List;

public class Prime {
    /**
     * 返回[lo, hi)间素数的个数
     * @param lo 下界, 闭区间
     * @param hi 上界， 开区间
     * @return 素数的数量
     */
    public static List<Integer> listPrimes(int lo, int hi) {
        // 将1排除在外
        if(lo == 1) { lo += 1; }
        List<Integer> primes = new ArrayList<>();

        for (int i = lo; i < hi; i++) {
            // i是否为素数标记
            boolean flag = false;
            // 优化: j < i / 2 或者 j <= Math.sqrt(i)
            // 从2开始检查i能不能被j整除
            for (int j = 2; j < i; j++) {
                // 找到了能整除i的数j，说明i不是素数
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            // 如果没有发现能整除i的数j，说明i是素数
            if (!flag) {
                // System.out.print(i + ","); // 调试
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        List<Integer> primes = listPrimes(101,200);
        for (Integer p : primes) {
            System.out.print(p + ", ");
        }
    }
}
