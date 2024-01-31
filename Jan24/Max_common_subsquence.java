import java.util.*;

public class Max_common_subsquence {

    public static int longestCommonSubsequence(String s1, String s2) {
        int t = 0;
        Set<Character> temp_S1 = new HashSet<>();
        Set<Character> temp_S2 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            temp_S1.add(c);
        }
        ArrayList<Character> str1 = new ArrayList<>();
        ArrayList<Character> str2 = new ArrayList<>();
        for (char c : s2.toCharArray()) {
            if (temp_S1.contains(c)) {
                str2.add(c);
            }
        }

        for(char c : s1.toCharArray()){
            if (str2.contains(c)) {
                str1.add(c);
            }
        }
        System.out.println(str1);
        System.out.println(str2);

        ArrayList<Character> sm = new ArrayList<>();
        ArrayList<Character> lg = new ArrayList<>();
        if (str1.size() < str2.size()) {
            sm = str1;
            lg = str2;
        }else{
            sm = str2;
            lg = str1;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int k = -1;
        while (k<sm.size()) {
            k +=1;
            int txx = k;
            int count = 0;
            for (int i = 0; i < lg.size() && k<sm.size(); i++) {
                if (lg.get(i) == sm.get(k)) {
                    count++;
                    System.out.print(lg.get(i));
                    k++;
                }
            }
            System.out.println();
            k = txx;
            arr.add(count);
        }

        int ans = Integer.MIN_VALUE;
        for(int num : arr){
            if (num>=ans) {
                ans = num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s0 ="ylqpejqbalahwr"; 
        String s1 = "yrkzavgdmdgtqpg";
        System.out.println(longestCommonSubsequence(s0, s1));
    }
}
