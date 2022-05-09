package leetcode.editor.en;

////Given a string s, find the length of the longest substring without 
//repeating 
////characters. 
////
//// 
//// Example 1: 
////
//// 
////Input: s = "abcabcbb"
////Output: 3
////Explanation: The answer is "abc", with the length of 3.
//// 
////
//// Example 2: 
////
//// 
////Input: s = "bbbbb"
////Output: 1
////Explanation: The answer is "b", with the length of 1.
//// 
////
//// Example 3: 
////
//// 
////Input: s = "pwwkew"
////Output: 3
////Explanation: The answer is "wke", with the length of 3.
////Notice that the answer must be a substring, "pwke" is a subsequence and not 
//a 
////substring.
//// 
////
//// 
//// Constraints: 
////
//// 
//// 0 <= s.length <= 5 * 10⁴ 
//// s consists of English letters, digits, symbols and spaces. 
//// 
//// Related Topics Hash Table String Sliding Window 👍 22306 👎 998
//

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int right = 0;
            int res = 0;
            Integer[] chars = new Integer[128];
            while (right < s.length()) {
                char c = s.charAt(right);
                Integer index = chars[c];
                if (index != null && index >= left && index < right) {
                    left = index + 1;
                }

                res = Math.max(res, right - left + 1);
                chars[c]=right;
                right++;

            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
