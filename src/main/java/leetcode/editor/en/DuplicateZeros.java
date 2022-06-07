package leetcode.editor.en;

//Given a fixed-length integer array arr, duplicate each occurrence of zero, 
//shifting the remaining elements to the right. 
//
// Note that elements beyond the length of the original array are not written. 
//Do the above modifications to the input array in place and do not return 
//anything. 
//
// 
// Example 1: 
//
// 
//Input: arr = [1,0,2,3,0,4,5,0]
//Output: [1,0,0,2,3,0,0,4]
//Explanation: After calling your function, the input array is modified to: [1,0
//,0,2,3,0,0,4]
// 
//
// Example 2: 
//
// 
//Input: arr = [1,2,3]
//Output: [1,2,3]
//Explanation: After calling your function, the input array is modified to: [1,2
//,3]
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 10⁴ 
// 0 <= arr[i] <= 9 
// 
// Related Topics Array Two Pointers 👍 1703 👎 544

public class DuplicateZeros {
    public static void main(String[] args) {
        Solution solution = new DuplicateZeros().new Solution();
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void duplicateZeros(int[] arr) {
            int count = 0;
            for (int i = 0; i <= arr.length - count; i++) {
                int temp = arr[i];
                if (temp == 0) {

                    count++;
                }
            }

            int last = arr.length - count - 1;
            for (int i = last; i > 0; i--) {

            }

        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}