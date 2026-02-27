import java.util.*;

public class PalindromeCheckerApp {

    // 1️⃣ Two Pointer Approach (O(1) space)
    public static boolean twoPointer(String input) {
        String s = input.toLowerCase().replaceAll("\\s+", "");
        int start = 0, end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // 2️⃣ Stack Approach (O(n) space)
    public static boolean stackMethod(String input) {
        String s = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
            stack.push(c);

        for (char c : s.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    // 3️⃣ Deque Approach (O(n) space)
    public static boolean dequeMethod(String input) {
        String s = input.toLowerCase().replaceAll("\\s+", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1)
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;

        return true;
    }

    // 4️⃣ Recursive Approach
    public static boolean recursiveMethod(String s, int start, int end) {
        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return recursiveMethod(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Two Pointer
        long start = System.nanoTime();
        boolean r1 = twoPointer(input);
        long end = System.nanoTime();
        long t1 = end - start;

        // Stack
        start = System.nanoTime();
        boolean r2 = stackMethod(input);
        end = System.nanoTime();
        long t2 = end - start;

        // Deque
        start = System.nanoTime();
        boolean r3 = dequeMethod(input);
        end = System.nanoTime();
        long t3 = end - start;

        // Recursive
        start = System.nanoTime();
        boolean r4 = recursiveMethod(normalized, 0, normalized.length() - 1);
        end = System.nanoTime();
        long t4 = end - start;

        System.out.println("\nResults:");
        System.out.println("Two Pointer: " + r1 + " | Time: " + t1 + " ns");
        System.out.println("Stack:       " + r2 + " | Time: " + t2 + " ns");
        System.out.println("Deque:       " + r3 + " | Time: " + t3 + " ns");
        System.out.println("Recursive:   " + r4 + " | Time: " + t4 + " ns");

        sc.close();
    }
}