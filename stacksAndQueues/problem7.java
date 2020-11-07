
//package stacksAndQueues;
import java.util.Stack;

class ReverseStringUsingStack {
    public void reverseString(String str) {
        if (str.length() <= 1)
            return;
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        char[] rev = new char[str.length()];
        int i = 0;
        while (!stack.isEmpty()) {
            rev[i++] = stack.pop();
        }
        str = String.valueOf(rev);
    }
}
