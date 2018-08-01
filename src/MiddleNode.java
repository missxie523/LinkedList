class MiddleNode {
    private static ListNode head;

    public ListNode middleNode(ListNode head){
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        MiddleNode sol = new MiddleNode();
        sol.head = new ListNode(85);
        sol.head.next = new ListNode(15);
        sol.head.next.next = new ListNode(4);
        sol.head.next.next.next = new ListNode(20);
        ListNode node = sol.middleNode(head);
        System.out.println(node.value);
    }
}
