import java.util.*;

public class Minimum_Add_to_Make_Parentheses_Valid {
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));

        for (int i = 1; i < s.length() ; i++) {
            if (st.peek() == '(' && s.charAt(i) == ')') {
                st.pop();
            }else{
                st.add(s.charAt(i));
            }
        }

        return st.size();
    }

    public static void main(String[] args) {
        String s = "((()())";
        s.toCharArray()
        System.out.println(minAddToMakeValid(s));
    }
}
