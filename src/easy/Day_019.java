package easy;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class Day_019 {

     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode result = head;
            while (head != null && head.next != null){
                if (head.val == head.next.val){
                    head.next = head.next.next;
                }else {
                    head = head.next;
                }

            }
            return result;
        }
    }
}
