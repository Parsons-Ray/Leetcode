/**
 * Merge two sorted linked lists and return it as a new list. The new
 * list should be made by splicing together the nodes of the first two lists.
 * 1->2->4, 1->3->5->7
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int val) {
         this.val = val;
         this.next = null;
    }
}

public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = new ListNode(l1.val);
            }else{
                cur.next = new ListNode(l2.val);
            }
            cur = cur.next;
        }
        if(l1 != null) {
            cur.next = l1;
        }else{
            cur.next = l2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        MergeTwoSortedLists_21 test = new MergeTwoSortedLists_21();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);
        l2.next.next = new ListNode(7);
        System.out.println(test.mergeTwoLists(l1, l2));
    }
}
