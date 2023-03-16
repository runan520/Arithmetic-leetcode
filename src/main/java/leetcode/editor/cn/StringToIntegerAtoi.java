package leetcode.editor.cn;

//Implement the myAtoi(string s) function, which converts a string to a 32-bit s
//igned integer (similar to C/C++'s atoi function). 
//
// The algorithm for myAtoi(string s) is as follows: 
//
// 
// Read in and ignore any leading whitespace. 
// Check if the next character (if not already at the end of the string) is '-' 
//or '+'. Read this character in if it is either. This determines if the final res
//ult is negative or positive respectively. Assume the result is positive if neith
//er is present. 
// Read in next the characters until the next non-digit charcter or the end of t
//he input is reached. The rest of the string is ignored. 
// Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no
// digits were read, then the integer is 0. Change the sign as necessary (from ste
//p 2). 
// If the integer is out of the 32-bit signed integer range [-231, 231 - 1], the
//n clamp the integer so that it remains in the range. Specifically, integers less
// than -231 should be clamped to -231, and integers greater than 231 - 1 should b
//e clamped to 231 - 1. 
// Return the integer as the final result. 
// 
//
// Note: 
//
// 
// Only the space character ' ' is considered a whitespace character. 
// Do not ignore any characters other than the leading whitespace or the rest of
// the string after the digits. 
// 
//
// 
// Example 1: 
//
// 
//Input: s = "42"
//Output: 42
//Explanation: The underlined characters are what is read in, the caret is the c
//urrent reader position.
//Step 1: "42" (no characters read because there is no leading whitespace)
//         ^
//Step 2: "42" (no characters read because there is neither a '-' nor '+')
//         ^
//Step 3: "42" ("42" is read in)
//           ^
//The parsed integer is 42.
//Since 42 is in the range [-231, 231 - 1], the final result is 42.
// 
//
// Example 2: 
//
// 
//Input: s = "   -42"
//Output: -42
//Explanation:
//Step 1: "   -42" (leading whitespace is read and ignored)
//            ^
//Step 2: "   -42" ('-' is read, so the result should be negative)
//             ^
//Step 3: "   -42" ("42" is read in)
//               ^
//The parsed integer is -42.
//Since -42 is in the range [-231, 231 - 1], the final result is -42.
// 
//
// Example 3: 
//
// 
//Input: s = "4193 with words"
//Output: 4193
//Explanation:
//Step 1: "4193 with words" (no characters read because there is no leading whit
//espace)
//         ^
//Step 2: "4193 with words" (no characters read because there is neither a '-' n
//or '+')
//         ^
//Step 3: "4193 with words" ("4193" is read in; reading stops because the next c
//haracter is a non-digit)
//             ^
//The parsed integer is 4193.
//Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
// 
//
// Example 4: 
//
// 
//Input: s = "words and 987"
//Output: 0
//Explanation:
//Step 1: "words and 987" (no characters read because there is no leading whites
//pace)
//         ^
//Step 2: "words and 987" (no characters read because there is neither a '-' nor
// '+')
//         ^
//Step 3: "words and 987" (reading stops immediately because there is a non-digi
//t 'w')
//         ^
//The parsed integer is 0 because no digits were read.
//Since 0 is in the range [-231, 231 - 1], the final result is 0.
// 
//
// Example 5: 
//
// 
//Input: s = "-91283472332"
//Output: -2147483648
//Explanation:
//Step 1: "-91283472332" (no characters read because there is no leading whitesp
//ace)
//         ^
//Step 2: "-91283472332" ('-' is read, so the result should be negative)
//          ^
//Step 3: "-91283472332" ("91283472332" is read in)
//                     ^
//The parsed integer is -91283472332.
//Since -91283472332 is less than the lower bound of the range [-231, 231 - 1], 
//the final result is clamped to -231 = -2147483648. 
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 200 
// s consists of English letters (lower-case and upper-case), digits (0-9), ' ',
// '+', '-', and '.'. 
// 
// Related Topics 字符串 
// 👍 1176 👎 0

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        Solution solution = new StringToIntegerAtoi().new Solution();

        System.out.println(solution.myAtoi("+0a32"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int myAtoi(String s) {
            //读入字符串并丢弃无用的前导空格
            int length = s.length();
            if (s.length() == 0) {
                return 0;
            }
            String str = s.trim();
            if (str.length() == 0) {
                return 0;
            }
            length = str.length();

            if (s.length() == 1 && (str.charAt(0) == '+' || str.charAt(0) == '-')) {
                return 0;
            }
            char first = '0';

            StringBuilder sb = new StringBuilder();

            int flag = 1;
            if ((str.charAt(0) == '+' && str.charAt(1) == '+') || (str.charAt(0) == '-' && str.charAt(1)== '-') ||(str.charAt(0) == '+' && str.charAt(1) == '-') || (str.charAt(0) == '-' && str.charAt(1) == '+')) {
                return 0;
            }
            //检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                first = str.charAt(0);
                //遍历所有的字符
                for (int i = 1; i < length; i++) {
                    if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                        break;
                    }
                    sb.append(str.charAt(i));
                }

            } else if (str.charAt(0) < '0' || str.charAt(0) > '9') {
                return 0;
            } else if (str.charAt(0) >= '0' || str.charAt(0) <= '9') {
                //遍历所有的字符
                for (int i = 0; i < length; i++) {
                    if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                        break;
                    }
                    sb.append(str.charAt(i));
                }
            }

            //读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
            //将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
            //如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
            //返回整数作为最终结果。


            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(0) > '0') {
                    break;
                }
                sb.deleteCharAt(0);
            }


            if (sb.length() == 0) {
                return 0;
            }
            if (first == '-') {
                flag = -1;
            }

            long res = Long.parseLong(sb.toString()) * flag;
            if(res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else if(res>Integer.MAX_VALUE){
                return  Integer.MAX_VALUE;
            }
                return (int)res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}