import java.util.Stack;

public class Q12 {

    public static boolean isValid(String s) {
        // Stack to store the opening parentheses
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If it's a closing bracket, check if it matches the top of the stack
            else {
                // If stack is empty, the string is invalid
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                
                // Check if the current closing bracket matches the last opening one
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all parentheses were matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";

        boolean result = isValid(s);
        System.out.println("Is the string valid? " + result);
    }
}
