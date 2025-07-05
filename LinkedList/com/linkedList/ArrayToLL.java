class Node{
    int val;
    Node next;

    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    Node(int val){
        this.val = val;
    }
}


public class ArrayToLL {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,7};
        Node head = convertArrToLL(arr);
        printLL(head);
    }

    public static void printLL(Node head) {
       Node temp = head;
       while(temp != null){
        System.out.print(temp.val + " ");
        temp = temp.next;
       }
       System.out.println();
    }

    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1; i < arr.length; i++){
            Node node = new Node(arr[i]);
            node.next = null;
            temp.next = node;
            temp = node;
        }
        return head;
    }
}
