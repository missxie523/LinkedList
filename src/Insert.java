/*
Insert a target value into a sorted linkedlist
 */
class Insert {
    private static ListNode head;
    private static int target;

    public ListNode insert(ListNode head, int target){
        if(head == null || target <= head.value){
            ListNode newHead = new ListNode(target);
            newHead.next = head;
            return newHead;
        }
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            if(cur.value < target){
                prev = cur;
                cur = cur.next;
            }else{
                prev.next = new ListNode(target);
                prev.next.next = cur;
                return head;
            }
        }
        prev.next = new ListNode(target);
        return head;
    }
    public void printList(ListNode node){
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        Insert sol = new Insert();
        sol.head = new ListNode(4);
        sol.head.next = new ListNode(15);
        sol.head.next.next = new ListNode(20);
        sol.head.next.next.next = new ListNode(30);
        sol.head.next.next.next.next = new ListNode(85);
        sol.target = 25;
        sol.insert(head, target);
        sol.printList(head);
    }
}
