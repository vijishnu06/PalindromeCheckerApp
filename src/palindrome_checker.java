public class palindrome_checker {
    public static void main(String[] args) {


        String original = "racecar";


        char[] chars = original.toCharArray();


        int left = 0;
        int right = chars.length - 1;


        boolean isPalindrome = true;


        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }


        if (isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}