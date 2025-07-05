/*
 * Example of fast pointer and slow pointer
 * 
 * 
 * 1-2-3-4-5-76-8-9-10
 * 
 * delete 8 when n = 2;
 */

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,76,8,9,10};
        Node head = ArrayToLL.convertArrToLL(arr);
        head = DeleteNodefromEnd(head, 9);
        ArrayToLL.printLL(head);
    }

    private static Node DeleteNodefromEnd(Node head, int n) {
       //we take two pointer fast and slow and then move fast exactly n times and then we start fast and slow together with slow starting from head 
       //and fast starting from n+1 , when fast reaches end slow would be exactly a node before the node we wanna delete
       // if fast == null that means we wanna delete the head.

       Node fast = head;
       for(int i = 0; i < n; i++){
        fast = fast.next;
       }
        if(fast == null){
        return head.next;
       }
       Node slow = head;
       while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
       }
  
       Node del = slow.next;
       slow.next = slow.next.next;
      
       del.next = null;
       return head;
    }
}
