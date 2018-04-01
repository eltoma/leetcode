import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class FindLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }

        int longest = 1;

        int fromIndex = 0;
        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            //System.out.println("== " + c);
            int index = indexOfString(s, fromIndex, i, c);

            int length = i - fromIndex;
            if(index >= 0) {
                if(length > longest) {
                    longest = length;
                }
                fromIndex = index + 1;
            } else {
                length += 1;
                if(length > longest) {
                    longest = length;
                }
            }
        }

        return longest;
    }

    public static int indexOfString(String s, int from, int end, char ch) {

        int index = s.substring(from,end).indexOf(ch);
        if(index < 0) {
            return -1;
        } else {
            return index + from;
        }
    }

    public static  int lengthOfLongestSubstring1(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                // 如果重复字符的上一次位置在j之后，更新j,如果在j之前不改变
                j = Math.max(j,map.get(s.charAt(i))+1);
                System.out.println("i:" + i + " |ch:" + s.charAt(i) + " |j:" + j);
            }
            // 更新字符的位置为最近的值
            map.put(s.charAt(i),i);
            // 更新长度
            max = Math.max(max,i-j+1);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abba"));
    }
}
