boolean hasCycle(Node head) 
{
    
    if(head==null)
        return false;
    
    Node fast=head;
    Node slow=head;
    
    while(slow != null && slow.next != null)
    {        
        slow = slow.next;
        fast = fast.next.next;
        
        if(fast == null || slow == null) 
            return false;
        
        if(fast == slow)
            return true;
        
    }
    
    return false;
        
        
        

}