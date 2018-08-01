/*
Merge two sorted LinkedList
 */
public class Merge {
    private static ListNode head1;
    private static ListNode head2;

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode cur1 = head1, cur2 = head2;
        while(cur1 != null && cur2 != null){
            if(cur1.value < cur2.value){
                cur.next = cur1;
                cur = cur.next;
                cur1 = cur1.next;
            }else{
                cur.next = cur2;
                cur = cur.next;
                cur2 = cur2.next;
            }
        }
        if(cur1 == null){
            cur.next = cur2;
        }
        if(cur2 == null){
            cur.next = cur1;
        }
        return dummy.next;
    }
    public void printList(ListNode node){
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        Merge sol = new Merge();
        sol.head1 = new ListNode(4);
        sol.head1.next = new ListNode(15);
        sol.head1.next.next = new ListNode(20);
        sol.head1.next.next.next = new ListNode(30);
        sol.head1.next.next.next.next = new ListNode(85);

        sol.head2 = new ListNode(8);
        sol.head2.next = new ListNode(11);
        sol.head2.next.next = new ListNode(26);
        sol.head2.next.next.next = new ListNode(33);
        sol.head2.next.next.next.next = new ListNode(46);

        sol.printList(sol.merge(head1, head2));

    }
}
