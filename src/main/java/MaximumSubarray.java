/**
 * Find the contiguous subarray within an array (containing at   least one number) which has the largest sum.

   For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
   the contiguous subarray [4,-1,2,1] has the largest sum = 6
 */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int nMaxSum, maxSum;
        nMaxSum = maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            nMaxSum = nMaxSum + nums[i];
            if(nMaxSum < 0) {
                nMaxSum = 0;
            } else if (nMaxSum > maxSum){
                maxSum = nMaxSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

    }
}






















