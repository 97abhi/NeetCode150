package arrays;

//Following quesion we cant use / operator so we need to use extra space to solve in o(n)
public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] res = new int[nums.length];

        prefix[0] = 1;
        for(int i= 1;i < nums.length; i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        suffix[nums.length-1] = 1;
        for(int i = nums.length-2 ; i >= 0; i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        } 
        for(int i = 0; i < nums.length; i++){
            res[i] = prefix[i]*suffix[i];
        } 
        return res;
    }
}
