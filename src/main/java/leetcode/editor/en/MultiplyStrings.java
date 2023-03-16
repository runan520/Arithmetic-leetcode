package leetcode.editor.en;

//Given two non-negative integers num1 and num2 represented as strings, return 
//the product of num1 and num2, also represented as a string. 
//
// Note: You must not use any built-in BigInteger library or convert the inputs 
//to integer directly. 
//
// 
// Example 1: 
// Input: num1 = "2", num2 = "3"
//Output: "6"
// Example 2: 
// Input: num1 = "123", num2 = "456"
//Output: "56088"
// 
// 
// Constraints: 
//
// 
// 1 <= num1.length, num2.length <= 200 
// num1 and num2 consist of digits only. 
// Both num1 and num2 do not contain any leading zero, except the number 0 
//itself. 
// 
// Related Topics Math String Simulation 👍 4359 👎 1730

public class MultiplyStrings {
    public static void main(String[] args) {
        Solution solution = new MultiplyStrings().new Solution();
        System.out.println(solution.multiply("123456789", "987654321"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String multiply(String num1, String num2) {

            int n1 = num1.length();
            int n2 = num2.length();

            Long[] nums1 = new Long[n1];
            Long[] nums2 = new Long[n2];

            long sum = 0;
            int index = 10;

            extracted(num1, n1, nums1, index);
            extracted(num2, n2, nums2, index);

            for (int i = 0; i < n1; i++) {

                for (int j = 0; j < n2; j++) {
                     sum += nums1[i] * nums2[j];
                }
            }

            return String.valueOf(sum);
        }

        private void extracted(String num, int n, Long[] nums, int index) {
            //每次都乘10
            for (int i = n - 1; i >= 0; i--) {


                Long parseInt = Long.parseLong(Character.toString(num.charAt(i)));
                if (i == n-1) {
                    nums[i] = parseInt;
                } else {
                    nums[i] = parseInt * index;
                    index *= 10;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}