Node Reverse(Node head) {
    if (head==null || head.next==null)
        return head;
    
    Node second = head.next;
    head.next = null;
    
    Node rest = Reverse(second);
    second.next = head;
    
    return rest;

}
