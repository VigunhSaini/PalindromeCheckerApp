//Version 2.0
//Author: Vigunh
//UseCase2:


import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "Nurses Run";

        boolean result = checkPalindrome(input);

        System.out.println("Is Palindrome? " + result);
    }}