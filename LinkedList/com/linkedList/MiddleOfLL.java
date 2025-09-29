
public class MiddleOfLL {

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,8,9,10};
        Node head = ArrayToLL.convertArrToLL(arr);
        Node middleNode = findMiddleNode(head);
        System.out.println(middleNode.val + " is the middle Node");
    }

    private static Node findMiddleNode(Node head) {
       Node fastPointer = head;
       Node slowPointer = head;
       while(fastPointer != null && fastPointer.next != null){
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next.next;
       }

       return slowPointer;
    }
}
