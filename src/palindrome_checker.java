public class palindrome_checker {

    public static void main(String[] args) {

        String input = "madam";

        if (input == null) {
            System.out.println("Input is null");
            return;
        }

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    // Recursive method
    private static boolean check(String s, int start, int end) {

        // Base condition: 0 or 1 character left
        if (start >= end) {
            return true;
        }

        // If mismatch, stop immediately
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return check(s, start + 1, end - 1);
    }
}

