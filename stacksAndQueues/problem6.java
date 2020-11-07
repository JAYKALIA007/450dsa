import java.util.*;
import java.lang.*;
import java.io.*;

class BalancedParanthesis {
    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            if (isBalanced(str))
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
    }

    public static boolean isBalanced(String str) {
        if (str.length() == 0)
            return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[')
                stack.push(ch);
            else if (stack.isEmpty())
                return false;
            else {

                switch (ch) {
                    case '}':
                        if (stack.peek() == '[' || stack.peek() == '(')
                            return false;
                        break;
                    case ')':
                        if (stack.peek() == '[' || stack.peek() == '{')
                            return false;
                        break;
                    case ']':
                        if (stack.peek() == '{' || stack.peek() == '(')
                            return false;
                        break;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}