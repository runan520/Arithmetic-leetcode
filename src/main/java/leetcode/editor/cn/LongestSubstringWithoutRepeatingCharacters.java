package leetcode.editor.cn;

//Given a string s, find the length of the longest substring without repeating 
//characters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s consists of English letters, digits, symbols and spaces. 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 6638 👎 0

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int rk = -1;
            int ans = 0;
            int n = s.length();

            Set<Character> occ = new HashSet<Character>();
            for (int i = 0; i < n; ++i) {
                if (i != 0) {
                    //做指针向右移动一格,移除一个字符
                    occ.remove(s.charAt(i - 1));
                }

                while (rk + 1 < n && occ.add(s.charAt(rk + 1))) {
                    //不断的移动右指针
                    ++rk;
                }
                ans = Math.max(ans, rk - i + 1);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}