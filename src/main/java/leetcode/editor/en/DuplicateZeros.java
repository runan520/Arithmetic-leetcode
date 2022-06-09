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
        int[] arr = new int[]{8,4,5,0,0,0,0,7};
        solution.duplicateZeros(arr);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void duplicateZeros(int[] arr) {
            int len = arr.length - 1;
            int count = 0;

            for (int i = 0; i <= len - count; i++) {
                if (arr[i] == 0) {
                    //这个就是最后一个是零
                    if (i == len - count) {
                        arr[len] = 0;
                        len -= 1;
                        break;
                    }
                    count++;
                }
            }
            int flag = len - count;
            for (int i = flag; i >= 0; i--) {
                if (arr[i] != 0) {
                    arr[i + count] = arr[i];
                } else {
                    arr[i + count] = 0;
                    count--;
                    arr[i + count] = 0;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}