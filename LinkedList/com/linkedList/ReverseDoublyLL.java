public class ReverseDoublyLL {

    public static void main(String[] args) {
        int [] arr = {1,4,5,6,7,8,3,84};
    DNode head = DoublyLL.convertArrToDLL(arr);
    head = reverseDLL(head);
    DoublyLL.printDLL(head);
    }


    private static DNode reverseDLL(DNode head) {

        /*
         * first we store the prev in a variable
         * then we link the prev to next
         * and then we link next to prev
         * since prev has been linked to necxt we move temp = temp.prev
         */
        DNode temp = head;
        DNode prev = null;

        while(temp != null){
            prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;

            temp = temp.prev;
        }


        return prev.prev;
    }

    
    
}
