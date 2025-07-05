public class PallindromeCheck {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,1,1,1};
        Node head= ArrayToLL.convertArrToLL(arr);
        Node head2 = ArrayToLL.convertArrToLL(arr);
        Node reverseHead = ReverseLL.reverseRecursively(head2);
        ArrayToLL.printLL(reverseHead);
        System.out.println("The value " + isPallindrome(head,reverseHead));
    }

    private static boolean isPallindrome(Node head, Node reverseHead) {
        if(head == null && reverseHead == null)
            return true;
        Node temp = head;
        Node tempReverse  = reverseHead;
        while(temp != null && tempReverse != null){
            System.out.println(temp.val + " " + tempReverse.val);
            if(temp.val != tempReverse.val)
                return false;
            temp = temp.next;
            tempReverse = tempReverse.next;
        }
        return true;

    }
}
