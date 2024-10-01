package Palindrome;

public class PalindromeCheckStringB {
    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}
