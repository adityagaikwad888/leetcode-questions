import java.util.*;


public class Longest_Increasing_Subsequence {
    public static int lengthOfLIS(int[] nums) {
        int Dynamic_storage[] = new int[nums.length];
        Arrays.fill(Dynamic_storage, 1);

        for (int i = 1; i < Dynamic_storage.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (nums[j] < nums[i]) {
                    Dynamic_storage[i] = Math.max(Dynamic_storage[j]+1, Dynamic_storage[i]);
                }
            }
        }

        int max = 0;
        for(int DY : Dynamic_storage){
            max = Math.max(DY, max);
        }

        return max;

    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(arr));
    }
}
