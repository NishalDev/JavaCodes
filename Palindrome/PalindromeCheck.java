package Palindrome;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome!");
        } else {
            System.out.println(input + " is not a palindrome!");
        }
    }
}
