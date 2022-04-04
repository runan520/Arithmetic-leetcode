package leetcode.editor.en;

//Given two sorted arrays nums1 and nums2 of size m and n respectively, return 
//the median of the two sorted arrays. 
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
// 
// Constraints: 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
// Related Topics Array Binary Search Divide and Conquer 👍 15600 👎 1934

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            for (int i : nums1) {
                pq.add(i);
            }

            for (int i : nums2) {
                pq.add(i);
            }

            int lenght = nums1.length + nums2.length;

            boolean add = false;
            if (lenght%2==0) add=true;
            if (lenght==1) return pq.poll();
            int count =1;
            while (!pq.isEmpty()) {
                if (lenght/2 == count  && add) {
                    int a = pq.poll();int b = pq.poll();
                    double x = (double)(a+b)/2;
                    return x;

                }else if (lenght / 2 == count && !add){
                    pq.poll();
                    return pq.poll();
            }else {
                pq.poll();
            }
                count++;

        }
            return 0.0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
