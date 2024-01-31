import java.util.*;

public class House_robber {
    public static int rob(int[] nums) {
        int if_rob = 0;
        int No_rob = 0;
        for(int num :nums){
            int curr_Y = No_rob + num;
            int curr_No = Math.max(if_rob, No_rob);

            if_rob = curr_Y;
            No_rob = curr_No;
        }

        return Math.max(if_rob, No_rob);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 3, 10, 4 };
        System.out.println(rob(arr));
    }
}
