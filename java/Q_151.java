import java.util.*;

public class Q_151 {

    public static String reverseWords(String s) {
        String ans = "";
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();

            while (i < s.length() && s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                i++;
            }
            
            if (sb.length() != 0) {
                String temp = "";
                temp = temp + sb;
                st.push(temp);
            }
        }
        ans = ans + st.pop();
        while (!st.isEmpty()) {
            ans = ans + " " + st.pop();
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String s = reverseWords(m);
        System.out.println(s);
    }
}