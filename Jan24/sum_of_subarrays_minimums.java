import java.util.*;


// This code is contributed by lokeshmvs21.

public class sum_of_subarrays_minimums {

    public static int min_val(int arr[],int s,int e){
        int min = Integer.MAX_VALUE;
        for(int i=s ; i<=e ; i++){
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sumSubarrayMins(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                answer += min_val(arr, i, j);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int a[] = {3,1,2,4};
        
        System.out.println("min sum : "+sumSubarrayMins(a));
    }
}
