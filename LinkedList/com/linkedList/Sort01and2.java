public class Sort01and2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,1,1,0,2,1};
        Node head = ArrayToLL.convertArrToLL(arr);
        head = sort(head);
        ArrayToLL.printLL(head);
    }

    private static Node sort(Node head) {
       Node temp = head;
       Node zeroLL = new Node(-1);
       Node oneLL = new Node(-1);
       Node twoLL = new Node(-1);
       Node zero = zeroLL;
       Node one = oneLL;
       Node two = twoLL;

       while(temp != null){
            if(temp.val == 0){
                zero.next = temp;
                zero = zero.next;

            }else if (temp.val == 1) {
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
       }

       zero.next = oneLL.next != null ? oneLL.next : twoLL.next;
       one.next =  twoLL.next;
       two.next = null;
       
       return zeroLL.next;
    }

}
