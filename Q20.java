import java.util.Stack;

public class Q20 {

    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        sortStack(stack);
        insertSorted(stack, temp);
    }

    private static void insertSorted(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, temp);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        System.out.println(stack); // Output: [1, 2, 3, 4]
    }
}