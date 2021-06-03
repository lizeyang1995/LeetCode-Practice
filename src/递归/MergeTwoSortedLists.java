package 递归;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode forkHead = new ListNode(0);
        ListNode currentNode = forkHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                currentNode.next = l1;
                currentNode = currentNode.next;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                currentNode = currentNode.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            currentNode.next = l2;
        } else {
            currentNode.next = l1;
        }
        return forkHead.next;
    }
}
