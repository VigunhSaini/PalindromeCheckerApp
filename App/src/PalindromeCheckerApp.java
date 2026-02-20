//Version 2.0
//Author: Vigunh
//UseCase2:
public class PalindromeCheckerApp {

    public class PalindromeCheck {
        public static boolean isPalindrome(String str) {
            // Step 1: Convert string to char array
            char[] charArray = str.toCharArray();

            // Step 2: Initialize two pointers
            int left = 0;
            int right = charArray.length - 1;

            // Step 3: Two-pointer comparison
            while (left < right) {
                if (charArray[left] != charArray[right]) {
                    return false; // Not a palindrome
                }
                left++;  // Move forward
                right--; // Move backward
            }

            return true; // Match found
        }

        public static void main(String[] args) {
            String input = "racecar";
            System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input));
        }
}}