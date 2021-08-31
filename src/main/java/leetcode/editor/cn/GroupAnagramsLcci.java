package leetcode.editor.cn;

//Write a method to sort an array of strings so that all the anagrams are in the
// same group. 
//
// Note: This problem is slightly different from the original one the book. 
//
// Example: 
//
// 
//Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//Output:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// Notes: 
//
// 
// All inputs will be in lowercase. 
// The order of your output does not matter. 
// 
// Related Topics 哈希表 字符串 排序 
// 👍 46 👎 0

import java.util.*;

public class GroupAnagramsLcci {
    public static void main(String[] args) {
        Solution solution = new GroupAnagramsLcci().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            List<List<String>> list = new ArrayList<>();

            //遍历所有的字符串
            for (int i = 0; i < strs.length; i++) {

                //字符串转换成字符数组
                char[] temp = strs[i].toCharArray();
                //然后将字符数组排序
                Arrays.sort(temp);
                //将排好序的字符数组放到map里
                String key = new String(temp);
                //新建一个arraylsit
                List<String> stringList = new ArrayList<>();
                //放到String list 然后根据是否含有
//                stringList.add(strs[i]);
                //看是否需要建立新的 list
                //得到的是value
                List<String> strings = map.getOrDefault(key, stringList);
                //把相应的加入
                strings.add(strs[i]);
                //最后把list加入到map里
                map.put(key, strings);
                //
            }

            for (List<String> listValue : map.values()) {
                list.add(listValue);
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}