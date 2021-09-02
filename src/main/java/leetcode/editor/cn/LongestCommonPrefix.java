package leetcode.editor.cn;

//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lower-case English letters. 
// 
// Related Topics 字符串 👍 1763 👎 0

public class LongestCommonPrefix{
  public static void main(String[] args) {
    Solution solution = new LongestCommonPrefix().new Solution();
    
  }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prifix = strs[0];
        //横向遍历
        for (int i = 1; i < strs.length; i++) {
            prifix = longestCommonPrefix(prifix, strs[i]);
            if (prifix.length() == 0){
                break;
            }
        }
        return prifix;

    }
    public String longestCommonPrefix(String str1, String str2){

        int length = Math.min(str1.length(), str2.length());
        //从头开始遍历
        int index = 0;
        while (index < length && str1.charAt(index)== str2.charAt(index)){
            index++;
        }

        return str1.substring(0,index);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}