package leetcode.editor.cn;

//Given two sorted arrays nums1 and nums2 of size m and n respectively, return t
//he median of the two sorted arrays. 
//
// The overall run time complexity should be O(log (m+n)). 
//
// 
// Example 1: 
//
// 
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
// 
//
// Example 2: 
//
// 
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
// 
//
// Example 3: 
//
// 
//Input: nums1 = [0,0], nums2 = [0,0]
//Output: 0.00000
// 
//
// Example 4: 
//
// 
//Input: nums1 = [], nums2 = [1]
//Output: 1.00000
// 
//
// Example 5: 
//
// 
//Input: nums1 = [2], nums2 = []
//Output: 2.00000
// 
//
// 
// Constraints: 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -106 <= nums1[i], nums2[i] <= 106 
// 
// Related Topics 数组 二分查找 分治 
// 👍 4267 👎 0

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        System.out.println(solution.findMedianSortedArrays(a, b));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double res;
            //新建一个list
            ArrayList<Integer> a = new ArrayList<>();
            //
            for (int i : nums1) {
                a.add(i);
            }
            //
            for (int i : nums2) {
                a.add(i);
            }

            //合并好的list
            int length = a.size();
            //对list进行排序
            Collections.sort(a);


            //判断是否为偶数D
            if (length % 2 == 0) {
                res = (a.get(length / 2) + a.get((length - 1) / 2))/2.0;
            } else {
                res = a.get(length / 2);
            }
            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}