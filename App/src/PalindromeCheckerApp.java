//Version 2.0
//Author: Vigunh
//UseCase2:
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = ""; // Initializing an empty string

        // Loop: Iterating from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation: Building the reversed string
            reversed += original.charAt(i);
        }

        // Comparison using equals() for content validation
        if (original.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}