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