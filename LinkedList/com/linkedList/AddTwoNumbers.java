public class AddTwoNumbers {
public static void main(String[] args) {
    //numbers are stored in reverse, i.e LSB is first and MSB is last
    int[] num1 = {2,4,3};
    int[] num2 = {5,6,4};

    Node head1 = ArrayToLL.convertArrToLL(num1);
    Node head2 = ArrayToLL.convertArrToLL(num2);

    Node head3 = addNumbers(head1,head2);
    ArrayToLL.printLL(head3);
}

/*
 * carry =0
 * temp.val + temp2.val > 9 carry = 1 anss = 0
 */
private static Node addNumbers(Node head1, Node head2) {
    Node temp1 = head1;
    Node temp2 = head2;
    Node dummy = new Node(-1);
    Node temp3 = dummy;
    int carry = 0;
    while (temp1 != null && temp2 != null) {
        int sum = temp1.val + temp2.val + carry;
        if(sum > 9){
            carry = 1;
        }
        else{
            carry = 0;
        }
        Node newNode = new Node(sum%10);
        temp3.next = newNode;
        temp3 = temp3.next;
        temp1 = temp1.next;
        temp2 = temp2.next;
    }

    while (temp1 != null) {
        int sum = temp1.val + carry;
        if(sum > 9) carry = 1;
            else{
            carry = 0;
        }
        temp3.next = new Node(sum%10);
        temp3 = temp3.next;
        temp1 = temp1.next;
    }
       while (temp2 != null) {
        int sum = temp2.val + carry;
        if(sum > 9) carry = 1;
        temp3.next = new Node(sum%10);
        temp3 = temp3.next;
        temp2 = temp2.next;
    }
    if(carry == 1){
        temp3.next = new Node(carry);
    }
        else{
            carry = 0;
        }

    return dummy.next;
}
}
