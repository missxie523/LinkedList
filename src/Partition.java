/*
Given a linkedlist and a target value x, partition it such that all nodes less than x are listed before the nodes larger than or equal to x.
 */
public class Partition {
    private static ListNode head;
    private static int target;
    public ListNode partition(ListNode head, int target){
        if(head == null){
            return head;
        }
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode cur1 = dummy1;
        ListNode cur2 = dummy2;
        ListNode cur = head;
        while(cur!= null){
            if(cur.value < target){
                cur1.next = cur;
                cur = cur.next;
                cur1 = cur1.next;
            }else{
                cur2.next = cur;
                cur = cur.next;
                cur2 = cur2.next;
            }
        }
        cur1.next = dummy2.next;
        cur2.next = null;
        return dummy1.next;
    }
    public void printList(ListNode node){
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        Partition sol = new Partition();
        sol.head = new ListNode(85);
        sol.head.next = new ListNode(15);
        sol.head.next.next = new ListNode(4);
        sol.head.next.next.next = new ListNode(20);
        sol.head.next.next.next.next = new ListNode(30);
        sol.target = 25;
        sol.printList(sol.partition(head, target));
    }
}
