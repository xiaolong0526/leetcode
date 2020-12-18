package 剑指offer.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/18 21:42
 */
public class _52_两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
