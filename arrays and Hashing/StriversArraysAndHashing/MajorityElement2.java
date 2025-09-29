public class MajorityElement2 {

    public static void main(String[] args) {
        int[] arr = {2,1,1,3,1,4,5,6};
        int count1 = 0, count2 = 1;
        int ele1 = 0, ele2 = 0;
        for(int i =0; i < arr.length; i++){
            if(count1 == 0 && arr[i] != ele2){
                count1 =1;
                ele1 = arr[i];
            }
            else if(count2 ==0 && arr[i] != ele1){
                count2 = 1;
                ele2 = arr[i];
            }
            else if(arr[i] == ele1){
                count1++;
            }
            else if (arr[i] == ele2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele1){
                count1++;
            }
            else if(arr[i] == ele2){
                count2++;
            }
        }
        int min = arr.length/3 + 1;
        if(count1 >= min)System.out.println(ele1);
        if(count2 >= min)System.out.println(ele2);
    }
}
