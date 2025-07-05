public class ReverseLL {
    public static void main(String[] args) {
        int[] arr = {1,2,45,1,6,8,2,3,121,5,434,4};
        Node head = ArrayToLL.convertArrToLL(arr);
        head = reverseIteratively(head);
        ArrayToLL.printLL(head);
        head = reverseRecursively(head);
        ArrayToLL.printLL(head);
    }

    public static Node reverseRecursively(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node newNode = reverseRecursively(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newNode;

    }

    public static Node reverseIteratively(Node head) {
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

}
