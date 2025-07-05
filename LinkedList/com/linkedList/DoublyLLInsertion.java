public class DoublyLLInsertion {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        DNode head = DoublyLL.convertArrToDLL(arr);
        head = insertBeforeHead(head,10);
        DoublyLL.printDLL(head);
        head = insertBeforeTail(head, 20);
        DoublyLL.printDLL(head);
        head = insertBeforeKthElement(head, 30, 9);
        DoublyLL.printDLL(head);
        
    }

    private static DNode insertBeforeKthElement(DNode head, int i, int k) {
        DNode temp = head;
        if(k == 1) return insertBeforeHead(head, i);
        int counter = 1;

        while (temp != null) {
            if(counter == k) break;
            counter++;
            temp = temp.next;
        }

        if(counter < k) return head;

        DNode prev = temp.prev;
        DNode next = temp.next;

        if(prev == null) return insertBeforeHead(head, i);
        else if(next == null) return insertBeforeTail(head, i);
        DNode dNode = new DNode(i,prev,next);
        prev.next = dNode;
        next.prev = dNode;

        return head;
    }

    private static DNode insertBeforeTail(DNode head, int i) {
        DNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        DNode prev = temp.prev;
        DNode dNode = new DNode(i);
        prev.next = dNode;
        dNode.next = temp;
        temp.prev = dNode;
        dNode.prev = prev;

        return head;
    }

    private static DNode insertBeforeHead(DNode head, int val) {
        DNode dNode = new DNode(val);
        dNode.next = head;
        head.prev = dNode;
        return dNode;
    }

}
