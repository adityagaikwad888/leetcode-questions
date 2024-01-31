import java.util.*;

public class ok {
    public static int maxLength(List<String> arr) {
        
        ///////////////////////////////////////////////// NOT CORRECT ///////////////////////////////////////

        // Collections.sort(arr,(a, b)->Integer.compare(a.length(), b.length()));;
        // // System.out.println(arr);
        // Collections.reverse(arr);
        // HashMap<Character, Integer> M = new HashMap<>();
        // HashMap<Character, Integer> sm = new HashMap<>();

        // for (String s : arr) {
        //     boolean flag = false;
        //     boolean flag1 = true;
        //     for (char c : s.toCharArray()) {
        //         if (!sm.containsKey(c)) {
        //             System.out.println(c);
        //             sm.put(c, 1);
        //             flag = true;
        //         } else {
        //             flag = false;
        //             break;
        //         }

        //         if (M.containsKey(c)) {
        //             flag1 = false;
        //             break;
        //         }
        //     }

        //     if (flag == true && flag1 == true) {
        //         for (char c : s.toCharArray()) {
        //             M.put(c, 1);
        //         }
        //     }

        // }

        // return M.size();




    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");
        System.out.println(maxLength(arr));
    }
}
