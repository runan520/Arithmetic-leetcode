package leetcode.editor.en;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CheckIfNAndItsDoubleExist
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2022-06-16 10:34
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist.Solution solution = new CheckIfNAndItsDoubleExist().new Solution();
        int[] arr = new int[]{375,373,886,135,29,-523,751,-160,981,-440,574,355,-138,-184,-443,11,-800,370,701,707,-735,-618,145,-968,-71,543,-909,0,-562,-194,685,495,103,684,893,-312,859,-502,-808,-843,388,528,-913,733,-135,707,-96,-614,959,-646,219,28,-611,735,43,-212,68,-262,-597,-524,-264,348,797,200,550,591,-868,-302,855,-894,-62,-910,708,250,-638,825,-698,748,856,922,-416,-40,-912,194,26,-868,773,711,158,-189,-812,-181,631,48,724,172,323,-383,-193,-452,854,-279,-37,968,914,-900,130,940,863,785,-23,-965,-126,-377,205,533,-351,628,-695,220,206,138,742,-432,-866,771,243,612,619,588,-261,-150,-200,64,619,-952,178,191,-768,-925,175,84,-971,-794,847,-320,-311,910,-246,536,128,-930,305,-242,193,-849,-7,835,299,-829,734,105,-87,-315,24,882,659,114,-994,889,-671,863,-335,-261,-562,-701,835,188,-697,207,-780,-173,-351,775,41};
        System.out.println(solution.checkIfExist(arr));
    }

    class Solution {
        public boolean checkIfExist(int[] arr) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                hashMap.put(arr[i], i);
            }

            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i] / 2;

                if (arr[i] != 0) {
                    if (hashMap.containsKey(temp) && arr[i] % 2 == 0) {
                        return true;
                    }
                } else {
                    if (i == hashMap.get(arr[i])) {
                        continue;
                    } else {
                        flag = true;
                    }
                }
            }
            return flag;
        }
    }
}
