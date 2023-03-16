package leetcode.editor.cn;

//You are given two non-empty linked lists representing two non-negative 
//integers. The digits are stored in reverse order, and each of their nodes contains a 
//single digit. Add the two numbers and return the sum as a linked list. 
//
// You may assume the two numbers do not contain any leading zero, except the 
//number 0 itself. 
//
// 
// Example 1: 
//
// 
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
// 
//
// Example 2: 
//
// 
//Input: l1 = [0], l2 = [0]
//Output: [0]
// 
//
// Example 3: 
//
// 
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in each linked list is in the range [1, 100]. 
// 0 <= Node.val <= 9 
// It is guaranteed that the list represents a number that does not have 
//leading zeros. 
// 
// Related Topics 递归 链表 数学 👍 7276 👎 0

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)


    //    Definition for singly-linked list.
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            int carry = 0;
            ListNode curr = dummyHead;

            while (l1 != null && l2 != null) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = x + y + carry;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                l1 = l1.next;
                l2 = l2.next;
            }

            ListNode remaining = l1 == null ? l2 : l1;
            while (remaining != null) {
                int sum = remaining.val + carry;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                remaining = remaining.next;
            }

            if (carry > 0) {
                curr.next = new ListNode(carry);
            }

            return dummyHead.next;
        }

        //必须仍指向先转变，而去再把全部的之赋值给转向的结点
        private ListNode reverse(ListNode head) {
            ListNode prev = null;

            while (head != null) {
                //先保存元素
                ListNode next = head.next;
                //需要将内部的指向前面的对象
                head.next = prev;
                //开始互换对象
                prev = head;
                //进行下一步
                head = next.next;
            }

            return prev;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
