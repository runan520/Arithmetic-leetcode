package leetcode.editor.en;

import java.util.Arrays;

/**
 * <p>Given an array of integers <code>nums</code>, sort the array in ascending order and return it.</p>
 *
 * <p>You must solve the problem <strong>without using any built-in</strong> functions in <code>O(nlog(n))</code> time complexity and with the smallest space complexity possible.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [5,2,3,1]
 * <strong>Output:</strong> [1,2,3,5]
 * <strong>Explanation:</strong> After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [5,1,1,2,0,0]
 * <strong>Output:</strong> [0,0,1,1,2,5]
 * <strong>Explanation:</strong> Note that the values of nums are not necessairly unique.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
 * <li><code>-5 * 10<sup>4</sup> &lt;= nums[i] &lt;= 5 * 10<sup>4</sup></code></li>
 * </ul>
 *
 * <div><div>Related Topics</div><div><li>Array</li><li>Divide and Conquer</li><li>Sorting</li><li>Heap (Priority Queue)</li><li>Merge Sort</li><li>Bucket Sort</li><li>Radix Sort</li><li>Counting Sort</li></div></div><br><div><li>👍 4706</li><li>👎 682</li></div>
 */
public class SortAnArray {
    public static void main(String[] args) {
        Solution solution = new SortAnArray().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // Function to merge two sub-arrays in sorted order.


        public int[] sortArray(int[] nums) {
            int[] temporaryArray = new int[nums.length];
            mergeSort(nums, 0, nums.length - 1, temporaryArray);
            return nums;
        }

        // Recursive function to sort an array using merge sort
        private void mergeSort(int[] nums, int left, int right, int[] temporaryArray) {
            if (left >= right) {
                return;
            }
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid, temporaryArray);
            mergeSort(nums, mid + 1, right, temporaryArray);
            merge(nums, left, mid, right, temporaryArray);
        }

        private void merge(int[] nums, int left, int mid, int right, int[] temporaryArray) {
            int start1 = left;
            int start2 = mid + 1;
            int n1 = mid - left + 1;
            int n2 = right - mid;

            for (int i = 0; i < n1; i++) {
                temporaryArray[start1 + i] = nums[start1 + i];
            }
            for (int i = 0; i < n2; i++) {
                temporaryArray[start2 + i] = nums[start2 + i];
            }

            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (temporaryArray[start1 + i] <= temporaryArray[start2 + j]) {
                    nums[k] = temporaryArray[start1 + i];
                    i += 1;
                } else {
                    nums[k] = temporaryArray[start2 + j];
                    j += 1;
                }
                k += 1;
            }

            while (i < n1) {
                nums[k] = temporaryArray[start1 + i];
                i += 1;
                k += 1;
            }
            while (j<n2) {
                nums[k] = temporaryArray[start2 + j];
                j += 1;
                k += 1;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}








