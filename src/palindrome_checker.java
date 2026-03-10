import java.util.ArrayDeque;
import java.util.Deque;

public class palindrome_checker {
    public static void main(String[] args) {


        String word = "rotor";

        // Create a Deque (double-ended queue)
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : word.toCharArray()) {
            deque.addLast(c);  // Insert at rear
        }

        // Flag to track palindrome
        boolean isPalindrome = true;

        // Compare front and rear elements until deque is empty or mismatch
        while (deque.size() > 1) {
            char front = deque.removeFirst(); // Remove from front
            char rear = deque.removeLast();   // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (Deque check)");
        } else {
            System.out.println(word + " is NOT a Palindrome (Deque check)");
        }
    }
}