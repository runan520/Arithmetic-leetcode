package leetcode.editor.en;

import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
        HeightChecker.Solution solution = new HeightChecker().new Solution();
        int[] heights = new int[]{1, 0, 1, 1, 1, 0};
        System.out.println(solution.heightChecker(heights));
    }

    class Solution {
        public int heightChecker(int[] heights) {
            int[] arr = new int[heights.length];
            int count = 0;
            System.arraycopy(heights, 0, arr, 0, heights.length);
            Arrays.sort(arr);

            for (int i = 0; i < heights.length; i++) {

                if (heights[i] != arr[i]) {
                    count++;
                }
            }

            return count;
        }
    }
}
