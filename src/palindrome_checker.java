import java.util.*;

public class palindrome_checker{

    // Strategy Interface
    interface PalindromeStrategy {
        boolean check(String input);
    }

    // Stack-based Strategy
    static class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {
            if (input == null) return false;

            Stack<Character> stack = new Stack<>();

            // Push characters
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            // Compare by popping
            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Deque-based Strategy
    static class DequeStrategy implements PalindromeStrategy {

        public boolean check(String input) {
            if (input == null) return false;

            Deque<Character> deque = new ArrayDeque<>();

            for (char c : input.toCharArray()) {
                deque.add(c);
            }

            while (deque.size() > 1) {
                if (!deque.pollFirst().equals(deque.pollLast())) {
                    return false;
                }
            }

            return true;
        }
    }

    // Context
    static class PalindromeChecker {
        private PalindromeStrategy strategy;

        public PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String input) {
            return strategy.check(input);
        }
    }

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        // Try switching to:
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}