class HasCycle {
    private static ListNode head;

    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        HasCycle sol = new HasCycle();
        sol.head = new ListNode(85);
        sol.head.next = new ListNode(15);
        sol.head.next.next = new ListNode(4);
        sol.head.next.next.next = new ListNode(20);
        sol.head.next.next.next.next = new ListNode(30);
        sol.head.next.next.next.next = sol.head.next.next;
        System.out.println(sol.hasCycle(head));
    }
}
