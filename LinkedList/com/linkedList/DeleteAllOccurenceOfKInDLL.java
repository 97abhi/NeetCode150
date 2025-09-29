public class DeleteAllOccurenceOfKInDLL {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,2,4,2,6,7,8,2};
        DNode head = DoublyLL.convertArrToDLL(arr);
        head = deleteAllOccurence(head,2);
        DoublyLL.printDLL(head);
    }

    private static DNode deleteAllOccurence(DNode head, int i) {
       DNode temp = head;
       while(temp != null){
        if(temp.val == i){
            if(temp == head){
                head = temp.next;
            }

            DNode prev = temp.prev;
            DNode next = temp.next;
            if(next != null) next.prev = prev;
            if(prev != null) prev.next = next;

            temp = next;
        }
        else{
            temp = temp.next;
        }
       }

       return head; 
    }
}
