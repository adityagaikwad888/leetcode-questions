import java.util.*;

public class Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        int n = tokens.length;
        for(String s : tokens){
            if (s.equals("+")) {
                int temp1 = st.pop();
                int temp2 = st.pop();
                st.push(temp1+temp2);
            }else if (s.equals("-")) {
                int temp1 = st.pop();
                int temp2 = st.pop();
                st.push(temp2-temp1);
            }else if(s.equals("*")){
                int temp1 = st.pop();
                int temp2 = st.pop();
                st.push(((int)temp2*temp1));
            }else if (s.equals("/")) {
                int temp1 = st.pop();
                int temp2 = st.pop();
                st.push(((int)temp2/temp1));
            }else{
                int num = Integer.valueOf(s);
                st.push(num);
            }
        }

        return st.pop();
    }
}
