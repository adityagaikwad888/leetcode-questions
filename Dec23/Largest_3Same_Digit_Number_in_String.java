import java.util.*;

public class Largest_3Same_Digit_Number_in_String {

    public static String largestGoodInteger(String num) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        for (int i = 0; i < n; i++) {
            st.push(num.charAt(i));
        }

        ArrayList<String> srr = new ArrayList<>();
        srr.add("-111");
        for (int i = 0; i < n && !st.empty(); i++) {
            char c1 = st.pop(); // "7" "77"
            if (!st.empty() && c1 == st.peek()) {
                char c2 = st.pop();
                if (!st.empty() && c2 == st.peek()) {
                    char crr[] = new char[3];
                    crr[0] = c1;
                    crr[1] = c2;
                    crr[2] = st.peek();
                    String crr1 = new String(crr);
                    srr.add(crr1);
                }
            }
        }
        int m = Integer.MIN_VALUE;
        int index = 0;
        for (int j = 0; j < srr.size(); j++) {
            int st_nu = Integer.parseInt(srr.get(j));
            System.out.println(srr.get(j));
            if (st_nu > m) {
                index = j;
                m = st_nu;
            }
        }
        if (srr.get(index).equals("000")) {
            System.out.println(srr.get(index));
            return "000";
        } else if (srr.get(index).equals("-111")) {
            System.out.println(srr.get(index));
            return "";
        }
        return srr.get(index);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        // String str2[] = new String[3];
        // System.out.println(str2.length);

        System.out.println(largestGoodInteger(str));
    }
}
