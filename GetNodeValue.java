/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node ptr1=head;
    Node ptr2=head;
    
    int count = 1;
    while(count <=n && ptr1.next != null)
    {
        ptr1=ptr1.next;
        count++;
    }
    
    while(ptr1.next!=null)
    {
        ptr1=ptr1.next;
        ptr2=ptr2.next;
    }
    
    return ptr2.data;
    
    
   


}

