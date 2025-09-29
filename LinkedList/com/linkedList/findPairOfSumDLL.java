/*
 * find all pairs of syum in a sorted DLL
 */

import java.util.HashMap;
import java.util.Map;

public class findPairOfSumDLL {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        DNode head = DoublyLL.convertArrToDLL(arr);
        findAllPairs(head,6);
    }

    private static void findAllPairs(DNode head, int k) {
       Map<DNode, DNode> map = new HashMap<>();

       DNode tail = findTail(head);
       DNode headTemp = head;

       while(headTemp.val < tail.val){
        if(headTemp.val + tail.val == k){
            map.put(tail, headTemp);
            headTemp = headTemp.next;
            tail = tail.prev;
        }
        else if(headTemp.val + tail.val < k){
            headTemp = headTemp.next;
        }
        else
            tail = tail.prev;
       }

       map.entrySet().forEach((K) -> {
            System.out.println("The sum pairs that sum upto " + k + " are " + K.getKey().val + " " + K.getValue().val);
       });

       
    }

    private static DNode findTail(DNode head) {
        DNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        return tail;
    }
}
