public class Deletion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        Node head = ArrayToLL.convertArrToLL(arr);
        // ArrayToLL.printLL(head);
        // head = deleteTail(head);
        // ArrayToLL.printLL(head);
        // head =  deleteKElement(head, 1);
        // ArrayToLL.printLL(head);
        head = DeleteNodeBasedOnValue(head,6);
        ArrayToLL.printLL(head);
    }

    private static Node DeleteNodeBasedOnValue(Node head, int val) {
       Node temp = head;
       Node prev = null;
       if(head == null){
        return head;
       }
       if(head.val == val){
        head = head.next;
        return head;
       }
        while(temp != null && temp.val != val){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            prev.next = null;
        }
        else{
            prev.next = prev.next.next;
        }
       return head;
    }

    private static Node deleteKElement(Node head, int k) {
       Node temp = head;
        int counter = 1;
        if(k == 1){
            head = head.next;
            return head;
        }
        while(counter < k-1){
            temp = temp.next;
            counter++;
        }
        temp.next = temp.next.next;

        return head;
    }

    private static Node deleteTail(Node head) {
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
