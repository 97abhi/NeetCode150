public class ThreeSumAndFourSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,10,20};
        int[][] ans = find3Sum(arr,6);
        for(int i = 0; i < arr.length; i++){
                System.out.println("The triplets are" + ans[i][0] + " " + ans[i][1] + " " + ans[i][2]);
        }
        ans = find4Sum(arr,12);
        for(int i = 0; i < arr.length; i++){
                System.out.println("The quadruples are" + ans[i][0] + " " + ans[i][1] + " " + ans[i][2] + " " + ans[i][3]);
        }
    }

    public static int[][] find3Sum(int[] arr, int sum){
        int[][] ans = new int[arr.length][4];
        int index = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i-1])continue;

            int j = i+1;
            int k = n-1;
            while (j < k) {
                if(arr[j] + arr[k] < sum - arr[i]){
                    j++;
                }
                else if (arr[j] + arr[k] > sum - arr[i]){
                    k--;
                }
                else{
                    ans[index][0] = arr[i];
                    ans[index][1] = arr[j];
                    ans[index][2] = arr[k];
                    j++;
                    k--;
                    index++;
                    while(j < k && arr[j] == arr[j-1])j++;
                    while(j < k && arr[k] == arr[k+1])k--;
                }
            }
        }
        return ans;
    }

    public static int[][] find4Sum(int[] arr, int sum){
        int[][] ans = new int[arr.length][4];
        int index = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i-1])continue;
            for(int j = i+1; j < n; j++){
            if(j != i+1 && arr[j] == arr[j-1])continue;
            int k = j+1;
            int l = n-1;
            while (k < l) {
               int sum1 = arr[i] + arr[k] + arr[l] + arr[j];
                if(sum1 < sum){
                    k++;
                }
                else if (sum1 > sum){
                    l--;
                }
                else{
                    ans[index][0] = arr[i];
                    ans[index][1] = arr[j];
                    ans[index][2] = arr[k];
                    ans[index][3] = arr[l];
                    k++;
                    l--;
                    index++;
                    while(k < l && arr[k] == arr[k-1])k++;
                    while(k < l && arr[l] == arr[l+1])l--;
                }
            }

            }
        }
 
        return ans;
    }

}
