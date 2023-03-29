package leetcode.editor.en;

/**
 * <p>Given the <code>head</code> of a singly linked list, sort the list using <strong>insertion sort</strong>, and return <em>the sorted list's head</em>.</p>
 *
 * <p>The steps of the <strong>insertion sort</strong> algorithm:</p>
 *
 * <ol>
 * <li>Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.</li>
 * <li>At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.</li>
 * <li>It repeats until no input elements remain.</li>
 * </ol>
 *
 * <p>The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.</p>
 * <img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif" style="height:180px; width:300px" />
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/03/04/sort1linked-list.jpg" style="width: 422px; height: 222px;" />
 * <pre>
 * <strong>Input:</strong> head = [4,2,1,3]
 * <strong>Output:</strong> [1,2,3,4]
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/03/04/sort2linked-list.jpg" style="width: 542px; height: 222px;" />
 * <pre>
 * <strong>Input:</strong> head = [-1,5,3,4,0]
 * <strong>Output:</strong> [-1,0,3,4,5]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li>The number of nodes in the list is in the range <code>[1, 5000]</code>.</li>
 * <li><code>-5000 &lt;= Node.val &lt;= 5000</code></li>
 * </ul>
 *
 * <div><div>Related Topics</div><div><li>Linked List</li><li>Sorting</li></div></div><br><div><li>👍 2596</li><li>👎 833</li></div>
 */
public class InsertionSortList {
    public static void main(String[] args) {
        Solution solution = new InsertionSortList().new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode insertionSortList(ListNode head) {
            ListNode dummy = new ListNode();
            ListNode curr = head;

            while (curr != null) {
                ListNode prev = dummy;
                while (prev.next != null && prev.next.val <= curr.val) {
                    prev = prev.next;
                }
                ListNode next = curr.next;
                curr.next = prev.next;
                prev.next = curr;

                curr = next;
            }
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}










