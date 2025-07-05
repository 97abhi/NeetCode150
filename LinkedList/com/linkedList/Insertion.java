public class Insertion {

    public static void main(String[] args) {
        int[] arr = {1,3,45,6,7,2};
        Node head = ArrayToLL.convertArrToLL(arr);
        head = insertNodeAtHead(head, 10);
        ArrayToLL.printLL(head);
        head = insertNodeAtTail(head,30);
        ArrayToLL.printLL(head);
        head = insertAtKPos(head, 50,4);
        ArrayToLL.printLL(head);
        head = insertNodeBeforeX(head, 100, 50);
        ArrayToLL.printLL(head);
    }

    private static Node insertNodeBeforeX(Node head, int val, int x) {
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.val == x){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }

        return head;
    }

    private static Node insertAtKPos(Node head,int val, int k) {
       Node temp = head;
        int counter = 1;

        while(counter < k-1) {
            temp = temp.next;
            counter++;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
       return head;
    }

    private static Node insertNodeAtTail(Node head, int val) {
        Node temp = head;

        if(head == null){
            return new Node(val);
        }
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = new Node(val);

        return head;
    }

    private static Node insertNodeAtHead(Node head, int val) {
       Node temp = new Node(val);
       if(head == null){
        head = temp;
       }
       else{
        temp.next = head;
       }
       return temp;
    }
}
