package easy;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 *
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Day_007 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //当l1或者l2为空
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        //初始化result并添加头节点
        ListNode result = new ListNode();
        result = addNode(result, l1, l2);
        return result.next;
    }

    public ListNode addNode(ListNode l, ListNode l1, ListNode l2){
        if (l1 == null){
            l.next = l2;
            return l;
        }
        if (l2 == null){
            l.next = l1;
            return l;
        }

        if (l1.val <= l2.val){
            l.next = l1;
            addNode(l.next, l1.next, l2);
        }else {
            l.next = l2;
            addNode(l.next, l1, l2.next);
        }
        return l;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
