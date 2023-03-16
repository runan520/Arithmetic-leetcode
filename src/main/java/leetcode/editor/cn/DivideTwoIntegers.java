package leetcode.editor.cn;

//Given two integers dividend and divisor, divide two integers without using 
//multiplication, division, and mod operator. 
//
// The integer division should truncate toward zero, which means losing its 
//fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be 
//truncated to -2. 
//
// Return the quotient after dividing dividend by divisor. 
//
// Note: Assume we are dealing with an environment that could only store 
//integers within the 32-bit signed integer range: [−2³¹, 2³¹ − 1]. For this problem, if 
//the quotient is strictly greater than 2³¹ - 1, then return 2³¹ - 1, and if the 
//quotient is strictly less than -2³¹, then return -2³¹. 
//
// 
// Example 1: 
//
// 
//Input: dividend = 10, divisor = 3
//Output: 3
//Explanation: 10/3 = 3.33333.. which is truncated to 3.
// 
//
// Example 2: 
//
// 
//Input: dividend = 7, divisor = -3
//Output: -2
//Explanation: 7/-3 = -2.33333.. which is truncated to -2.
// 
//
// Example 3: 
//
// 
//Input: dividend = 0, divisor = 1
//Output: 0
// 
//
// Example 4: 
//
// 
//Input: dividend = 1, divisor = 1
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= dividend, divisor <= 2³¹ - 1 
// divisor != 0 
// 
// Related Topics 位运算 数学 👍 761 👎 0

public class DivideTwoIntegers {
    public static void main(String[] args) {
        Solution solution = new DivideTwoIntegers().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int divide(int dividend, int divisor) {
            //如果最小的值除以-1，会超时
            if (dividend == Integer.MIN_VALUE && divisor == -1)
                return Integer.MAX_VALUE;

            int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;

            //环境只支持储存32位整数,由于最小的负数变为整数会越界。
            if (dividend > 0) dividend = -dividend;
            if (divisor > 0) divisor = -divisor;

            int res = 0;

            while (dividend <= divisor) {
                dividend -= divisor;
                res++;
            }

            return sign == 1 ? res : -res;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}