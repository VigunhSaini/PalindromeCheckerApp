//Version 2.0
//Author: Vigunh
//UseCase2:


import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "Nurses Run";

        // Step 1: Normalize string
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Apply palindrome logic
        boolean result = isPalindrome(normalized, 0, normalized.length() - 1);

        System.out.println("Is Palindrome? " + result);
    }}