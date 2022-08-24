package leetcode.editor.en;

//Given an integer n, return true if it is a power of three. Otherwise, return 
//false. 
//
// An integer n is a power of three, if there exists an integer x such that n ==
// 3ˣ. 
//
// 
// Example 1: 
//
// 
//Input: n = 27
//Output: true
// 
//
// Example 2: 
//
// 
//Input: n = 0
//Output: false
// 
//
// Example 3: 
//
// 
//Input: n = 9
//Output: true
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= n <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you solve it without loops/recursion?
//
// Related Topics Math Recursion 👍 1351 👎 150

public class PowerOfThree {
    public static void main(String[] args) {
        Solution solution = new PowerOfThree().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPowerOfThree(int n) {
            return (Math.log10(n) / Math.log10(3)) % 1 == 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    }

 