class DNode{
    int val;
    DNode prev;
    DNode next;

    DNode(int val){
        this.val = val;
    }
    DNode(int val, DNode prev, DNode next){
        this.next = next;
        this.prev = prev;
        this.val = val;
    }
}

public class DoublyLL {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        DNode head = convertArrToDLL(arr);
        printDLL(head);
         head = deleteHead(head);
        printDLL(head);
        head = DeleteTail(head);
        printDLL(head);
        head = removeKElement(head, 3);
        printDLL(head);
        removeNode(head.next.next);
        printDLL(head);

    }

    private static void removeNode(DNode node) {
        DNode prev = node.prev;
        DNode next = node.next;

        if(next == null){
            prev.next = null;
            next.prev = null;
            return;
        }
        prev.next = next;
        next.prev = prev;
        node.next = node.prev = null;

    }

    private static DNode removeKElement(DNode head, int k) {
        if(k == 1)
        return head;

        if(head ==  null)
            return head;
       
        DNode temp = head;
        int counter = 1;
        while(temp!=null)
        {   
            if(counter == k) break;
                        counter++;

            temp = temp.next;
        }
        DNode next = temp.next;
        DNode prev = temp.prev;

        if(next== null && prev == null){
            return head;
        }
        else if(prev == null) return DeleteTail(head);
        else if(next == null) return deleteHead(head);
        
        prev.next = next;
        next.prev = prev;

        temp.next =null;
        temp.prev = null;

       return head;
    }

    private static DNode DeleteTail(DNode head) {
        if(head == null || head.next == null)
            return head;

        DNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        DNode prev = temp.prev;
        prev.next = null;
        temp.prev = null;
        temp = null;

        return head;

    }

    private static DNode deleteHead(DNode head) {
        if(head == null || head.next == null){
            return head;
        }

        DNode prev = head;
      head = head.next;
      head.prev = null;
      prev = null;

      return head;
    }

    public static void printDLL(DNode head) {
        DNode temp = head;
        while(temp.next != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(temp.val + " ");
        System.out.println("Now reverse");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static DNode convertArrToDLL(int[] arr) {
       if(arr.length == 0)
        return null;

        DNode head = new DNode(arr[0]);
        DNode temp = head;
        for(int i = 1; i < arr.length; i++){
            DNode node = new DNode(arr[i], temp, null);
            temp.next = node;
            temp = node;
        }
       return head;
    }

}
