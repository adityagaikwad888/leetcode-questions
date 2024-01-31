import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> M = new HashMap<>();
        M.put(0, 1);
        M.put(nums[0],1);

        int count = 0; 
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];

            if (M.containsKey(nums[i] - k)) {
             count += M.get(nums[i]-k);
            }else{
                M.put(nums[i], M.getOrDefault(nums[i] - 1, 0));
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
    }
}
