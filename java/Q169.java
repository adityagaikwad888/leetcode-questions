import java.util.Arrays;

public class Q169 {
    public static int majorityElement(int[] nums) {
        int ans = Integer.MIN_VALUE ,count = 1;
        int n = nums.length -1  ;
        Arrays.sort(nums);
        for(int i = 0 ; i < n ; i++){
            if (nums[i] == nums[i+1]) {
                count++;
            }else{
                count = 1;
            }
            if (count > nums.length /2) {
                ans = nums[i];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {123,123,123,123,123,-41,-7,123,-4548,-7,-4548};
        System.out.println(majorityElement(arr));
    }
}


/*
 * Most best aprroch
 * 
 * as per definition of mejority element 
 * nums[n/2] is that mejority number 
 */