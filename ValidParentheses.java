import java.util.Stack;

public class ValidParentheses {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }

        count += stack.size();

        return count;
    }

    public static void start() {
        String input = "((()))()(()((";
        int minToAdd = minAddToMakeValid(input);
        System.out.println(minToAdd);
    }
}
