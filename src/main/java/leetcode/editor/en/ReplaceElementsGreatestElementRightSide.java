package leetcode.editor.en;

import java.util.Arrays;

/**
 * @ClassName ReplaceElementsGreatestElementRightSide
 * @Description Array01
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2022-06-22 15:04
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class ReplaceElementsGreatestElementRightSide {
    public static void main(String[] args) {
        ReplaceElementsGreatestElementRightSide.Solution solution = new ReplaceElementsGreatestElementRightSide().new Solution();
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
    }

    class Solution {
        public int[] replaceElements(int[] arr) {
            int length = arr.length;

            int max = -1;
            for (int i = length -1; i >= 0; i--) {
                int temp = arr[i];
                arr[i] = max;
                if (max < temp) {
                    max = temp;
                }
            }

            return arr;
        }
    }
}
