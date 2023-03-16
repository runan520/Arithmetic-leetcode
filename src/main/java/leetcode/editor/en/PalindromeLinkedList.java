package leetcode.editor.en;

//Given the head of a singly linked list, return true if it is a palindrome or 
//false otherwise. 
//
// 
// Example 1: 
// 
// 
//Input: head = [1,2,2,1]
//Output: true
// 
//
// Example 2: 
// 
// 
//Input: head = [1,2]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [1, 10⁵]. 
// 0 <= Node.val <= 9 
// 
//
// 
//Follow up: Could you do it in 
//O(n) time and 
//O(1) space?
//
// Related Topics Linked List Two Pointers Stack Recursion 👍 11995 👎 668

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {

            List<Integer> list = new ArrayList<>();
            ListNode current = head;

            while (current != null) {
                list.add(current.val);
                current = current.next;
            }

            int front = 0;
            int back = list.size() - 1;
            while (front < back) {
                if (!list.get(front).equals(list.get(back))) {
                    return false;
                }

                front++;
                back--;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

 