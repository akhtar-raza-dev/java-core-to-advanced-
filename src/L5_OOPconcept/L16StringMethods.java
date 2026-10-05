package L5_OOPconcept;

//* String Methods
//* 1) String Inspection Methods
//* 2) String Comparison Methods
//* 3) String Manipulation Methods - covered later
/*

1) String Inspection Methods: These methods provide information about the string.
    length(): Returns the total number of characters.
    charAt(index): Returns the character at a specific index.
    isEmpty(): Returns true if the string has zero characters (length 0).
    isBlank(): Returns true if the string is empty or only contains whitespace.
    indexOf(char/String): Finds the index of the first occurrence.
    lastIndexOf(char/String): Finds the index of the last occurrence.

2) String Comparison Methods: These methods compare the string's value to another.
    equals(String): Checks for exact, case-sensitive equality.
    equalsIgnoreCase(String): Checks for equality, ignoring case.
    startsWith(String): Checks if the string begins with a specific prefix.
    endsWith(String): Checks if the string ends with a specific suffix.
    contains(String): Checks if the string includes a specific substring.
    contentEquals(CharSequence): Compares content to other character sequences (like StringBuilder), which equals does not.

3) String Manipulation Methods: Transform one string value into another.

NOTE: Important Concepts & Best Practices
0-Based Indexing: The most important concept is that String indexing starts at 0. The first character is at index 0, the second at index 1, and so on.
Finding the Last Character: Because indexing starts at 0, the index of the last character is always length() - 1.
Avoid Exceptions: Calling charAt(0) on an empty string will cause a runtime exception. Always check if (string.isEmpty()) before attempting to access characters by index.
isEmpty() vs. isBlank(): isEmpty() is true only for "" VS isBlank() is true for "", " ", "\t\n", etc.
Search Variations: indexOf(char, index) starts searching forward from the specified index. lastIndexOf(char, index) starts searching backward from the specified index.

 */
public class L16StringMethods {
    public static void main(String[] args) {
// --- 1. Calling the printInformation method ---
        System.out.println("--- Information for 'Hello World' ---");
        printInformation("Hello World");

        System.out.println("\n--- Information for an empty string ---");
        printInformation("");

        System.out.println("\n--- Information for a blank string ---");
        printInformation("   \t \n   ");

        // --- 2. IndexOf and LastIndexOf Methods ---
        System.out.println("\n--- Indexing Methods ---");
        String helloWorld = "Hello World";

        // Basic indexOf
        System.out.printf("index of 'R' = %d%n", helloWorld.indexOf('R')); // Note: 'R' is not in the string
        System.out.printf("index of 'r' = %d%n", helloWorld.indexOf('r'));
        System.out.printf("index of 'World' = %d%n", helloWorld.indexOf("World"));

        // Finding all 'l's
        System.out.printf("index of 'l' = %d%n", helloWorld.indexOf('l'));
        System.out.printf("last index of 'l' = %d%n", helloWorld.lastIndexOf('l'));

        // Using the 'fromIndex' parameter to find the second 'l'
        // Starts searching FORWARD from index 3
        System.out.printf("index of 'l' after 3 = %d%n", helloWorld.indexOf('l', 3));

        // Starts searching BACKWARD from index 8
        System.out.printf("last index of 'l' before 8 = %d%n", helloWorld.lastIndexOf('l', 8));

        // --- 3. String Comparison Methods ---
        System.out.println("\n--- Comparison Methods ---");
        String helloWorldLower = helloWorld.toLowerCase(); // "hello world"

        // equals (case-sensitive)
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly (equals)");
        } else {
            System.out.println("Values do NOT match exactly (equals)");
        }

        // equalsIgnoreCase (case-insensitive)
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case (equalsIgnoreCase)");
        }

        // startsWith, endsWith, contains
        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with 'Hello'");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with 'World'");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains 'World'");
        }

        // contentEquals
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly (contentEquals)");
    }
}

    /**
     * Prints information about a string using inspection methods.
     * @param string The string to inspect.
     */
    public static void printInformation(String string) {

        // Check for empty string first to avoid exceptions
        if (string.isEmpty()) {
            System.out.println("String is empty. Length = 0.");
            return;
        }

        // Check for blank string
        if (string.isBlank()) {
            System.out.println("String is blank.");
        }

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        // We know the string is not empty, so charAt(0) is safe
        System.out.printf("First char = %c %n", string.charAt(0));

        // Access the last character safely
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
