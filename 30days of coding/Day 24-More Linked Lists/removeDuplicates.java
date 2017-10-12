/* A Node class is provided for you in the editor. A Node object has an 
integer data field, data, and a Node instance pointer, next, pointing to another
 node (i.e.: the next node in a list).

A removeDuplicates function is declared in your editor, which takes
 a pointer to the head node of a linked list as a parameter. Complete
  removeDuplicates so that it deletes any duplicate nodes from the
   list and returns the head of the updated list. */


//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
//easy 2 pointes game.
public static Node removeDuplicates(Node head) {
    if(head == null || head.next==null){
        return head;
    }
    Node slow = head;
    Node fast = head;
    
    while(fast.next!=null){
        fast = fast.next;
        if(slow.data==fast.data){
            slow.next = null;
        }
        else{
            slow.next = fast;
            slow = slow.next;
        }
    }
    return head;
}