import java.util.HashMap;
import java.util.Map;

/**
 * Created by elotoma on 2017/10/30.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(hash.containsKey(diff)) {
                return new int[] {hash.get(diff), i};
            }

            hash.put(nums[i], i);
        }

        return res;
    }
}
