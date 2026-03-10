import java.util.Stack;
public class palindrome_checker {
    public static void main(String[] args) {


        String original = "radar";

        // Create a stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Build reversed string by popping from stack
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original with reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}