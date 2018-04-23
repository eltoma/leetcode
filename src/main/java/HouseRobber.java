public class HouseRobber {
    public static void main(String[] args) {

    }

    public static int rob(int[] num) {
        int with = 0;
        int no = 0;

        for(int n : num){
            int temp = no;
            // 不偷该房子， 为偷或者不投上一个房子的最大值
            no = Math.max(with, no);
            // 偷该房子， 为不偷上一个房子 + 本房子
            with = temp + n;
        }

        return Math.max(with, no);
    }

    // top-to-down method
    private static int[] rob(int[] num, int lo) {
       if(lo == num.length) { return new int[2]; }

       /* key step firstly, solve sub-question */
       int[] subRes = rob(num, lo + 1);

       /* now, solve origin-question by sub-question's answer */
       int[] res = new int[2];
       /* rob first house */
       res[0] = Math.max(subRes[0], subRes[1]);
       /* ignore first house */
       res[1] = num[lo] + subRes[0];

       return res;
    }

    public static int rob1(int[] num) {
        if(num.length == 0) return 0;
        int[] res = rob(num, 0);
        return Math.max(res[0], res[1]);
    }
}
