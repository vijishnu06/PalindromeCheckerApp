import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class palindrome_checker {
    public static void main(String[] args) {


        String word = "level";

        // Create a Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();


        Stack<Character> stack = new Stack<>();


        for (char c : word.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }


        boolean isPalindrome = true;

        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.poll();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (Queue vs Stack comparison)");
        } else {
            System.out.println(word + " is NOT a Palindrome (Queue vs Stack comparison)");
        }
    }
}