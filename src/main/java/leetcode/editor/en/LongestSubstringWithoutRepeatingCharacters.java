package leetcode.editor.en;

//Given a string s, find the length of the longest substring without repeating c
//haracters. 
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
// 0 <= s.length <= 5 * 104 
// s consists of English letters, digits, symbols and spaces. 
// 
// Related Topics Hash Table String Sliding Window 
// 👍 22278 👎 998

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        solution.lengthOfLongestSubstring("bbbb");
    }

    class Solution {
        public int lengthOfLongestSubstring(String s) {

            int left = 0;
            int right = 0;
            int length = s.length();
            int result = 0;
            String currChar = "";
            String current = "";
            while (true) {
                if (length == 0) {
                    return result;
                }

                if (length == 1) {
                    return 1;
                }
                currChar = Character.toString(s.charAt(right));

                if (current.contains(currChar)) {
                    left++;
                } else {
                    right++;
                }


                if (right >= length) {
                    break;
                }
                result = Math.max(result, current.length());

                current = s.substring(left, right);
            }

            return result;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
//leetcode submit region end(Prohibit modification and deletion)

}

