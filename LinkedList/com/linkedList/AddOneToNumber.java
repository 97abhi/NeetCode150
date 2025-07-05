/*
 * Add one to the number . Here msb is the first digit and lsb is the last
 */

public class AddOneToNumber {

    public static void main(String[] args) {
        int [] arr = {9,9,9,9,9,9};
        Node head = ArrayToLL.convertArrToLL(arr);
        head = addOne(head);
        ArrayToLL.printLL(head);
    }

    private static Node addOne(Node head) {
       int carry = addHelper(head);
       Node newNode = null;
       if(carry > 0){
         newNode = new Node(carry);
         newNode.next = head;
         head = newNode;
       }
       return head;
    
    }

    private static int addHelper(Node head) {
        if(head == null){
            return 1;
        }

        int carry = head.val + addHelper(head.next);
        if(carry > 9){
            head.val =carry%10;
        }
        else
            head.val = carry;
        return carry/10;
    }
}
