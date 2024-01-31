import java.util.*;

public class queue_using_stack {
    class MyQueue {
        Stack<Integer> temp1 ;
        Stack<Integer> temp2 ;
        public MyQueue() {
            temp1 = new Stack<>();
            temp2 = new Stack<>();
        }
        
        public void push(int x) {
            while (!temp1.isEmpty()) {
                temp2.add(temp1.pop());
            }
            temp2.add(x);
            while (!temp2.isEmpty()) {
                temp1.add(temp2.pop());
            }
        }
        
        public int pop() {
            return temp1.pop();
        }
        
        public int peek() {
            return temp1.peek();
        }
        
        public boolean empty() {
            return temp1.isEmpty();
        }
    }
}
