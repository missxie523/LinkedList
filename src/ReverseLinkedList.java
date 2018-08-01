class ReverseLinkedList {
    private static ListNode head;

    //Iterative way
    public ListNode reverseLinkedListI(ListNode head){
        ListNode prev = null, cur = head, next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }//Time: O(n), Space: O(1)
    //Recursion way
    public ListNode reverseLinkdListII(ListNode head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseLinkdListII(head.next);
        ListNode n = head.next;
        n.next = head;
        head.next = null;
        return newHead;
    }//
    public void printList(ListNode node){
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        ReverseLinkedList sol = new ReverseLinkedList();
        sol.head = new ListNode(85);
        sol.head.next = new ListNode(15);
        sol.head.next.next = new ListNode(4);
        sol.head.next.next.next = new ListNode(20);
        sol.printList(head);
        head = sol.reverseLinkedListI(head);
        System.out.println(" ");
        System.out.println("Reversed LinkedList list");
        sol.printList(head);

        head = sol.reverseLinkdListII(head);
        System.out.println(" ");
        System.out.println("Reversed LinkedList again");
        sol.printList(head);
    }
}
