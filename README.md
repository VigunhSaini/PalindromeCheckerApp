# PalindromeCheckerApp
UC1: Application Entry & Welcome Message

Goal: Display a welcome message and app details at startup. 

Actor: User

Flow:

Program starts.

JVM invokes the main() method.

Application name is displayed.

Application version is displayed.

Program continues to next use case or exits.

Key Concepts used in UC1:

Class – Acts as a container for the Palindrome Checker application logic.

Main Method – Entry point of the Java application with the signature

public static void main(String[] args).

Static Keyword – Allows the JVM to invoke the main() method without creating an object.

Console Output – System.out.println() is used to display messages on the console.

Application Flow Control – Defines the startup behavior before palindrome processing begins.



UC2: Print a Hardcoded Palindrome Result

Goal: Display whether a hardcoded string is a palindrome.

Actor: User

Flow:

Program starts

Hardcoded string is checked

Result is printed

Program exits





Key Concepts used in UC2:

Class – In Java, even the simplest program must be written inside a class, as a class acts as a container to hold program logic.

Main Method – Entry point of the Java application with the signature

public static void main(String[] args).

Static Keyword – Allows the JVM to invoke the main() method without creating an object of the class.

String – A built-in Java class used to store and manipulate textual data. Here, it stores the word to be checked for a palindrome.

String Literal – Text enclosed within double quotes ("madam"), stored in the String constant pool.

Conditional Statement (if-else) – Used to evaluate whether the given string satisfies the palindrome condition.

Console Output – System.out.println() is used to display the result on the console.



UC3: Palindrome Check Using String Reverse

Goal: Check whether a string is a palindrome by reversing it.

Flow:

Reverse string using loop

Compare original and reversed

Display result

Key Concepts used in UC3:

Loop (for loop) – Used to iterate through the characters of the string in reverse order.

String Immutability – In Java, String objects are immutable; every modification creates a new String object.

String Concatenation (+) – Used to build the reversed string character by character (introduced here to later discuss drawbacks).

equals() Method – Used to compare the actual content of two String objects instead of memory references.

Data Structure: String



UC4: Character Array Based Palindrome Check

Goal: Convert string to character array and compare characters.

Flow:

Convert string to char[]

Use two-pointer approach

Compare start & end characters

Key Concepts used in UC4:

Character Array (char[]) – A primitive array used to store individual characters of a string for index-based access.

Array Indexing – Accessing elements using index positions starting from 0.

Two-Pointer Technique – One pointer starts from the beginning and the other from the end, reducing unnecessary comparisons.

Time Complexity Awareness – Demonstrates efficient comparison without creating extra objects.

Data Structure: char[]

