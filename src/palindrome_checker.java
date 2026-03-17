import java.util.LinkedList;

public class palindrome_checker {
    public static void main(String[] args) {


        String input = "level";


        if (input == null) {
            System.out.println("Input is null");
            return;
        }


        LinkedList<Character> list = new LinkedList<>();


        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;


        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
