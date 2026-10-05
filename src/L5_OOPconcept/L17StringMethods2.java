package L5_OOPconcept;

//* 3) String Manipulation Methods

/*
  3) String manipulation methods, which are divided into two groups:
      i) Text Cleanup Methods: These methods adjust the string's presentation without changing its core meaning.
         Examples: indent() (adds or removes spaces), strip(), trim() (remove whitespace), toLowerCase(), toUpperCase().

      ii) Text Transformation Methods: These methods create a new string that is fundamentally different from the original.
          Extracting: substring(start) or substring(start, end) creates a new string from a part of the original.
          Building: concat(), String.join(), and repeat() are used to assemble new strings.
          Replacing: replace(), replaceFirst(), and replaceAll() create a new string by substituting characters or substrings.

  - Important Concepts & Best Practices
        Strings are Immutable: This is the single most important concept. None of these methods change the original string. They all return a new string object with the changes.
                                INCORRECT: myString.toUpperCase(); (This does nothing, as the new all-caps string is thrown away).
                                CORRECT: myString = myString.toUpperCase(); (The variable myString now points to the new string).

        substring(startIndex, endIndex): The startIndex is inclusive (it's the first character included), but the endIndex is exclusive (it's end character is not included).
                                         "Hello".substring(1, 3) returns "el" (characters at index 1 and 2).

        join() vs. concat():
                      String.join() is a static method and is highly efficient for joining multiple strings with a delimiter. It's the preferred modern approach.
                      concat() is an instance method. Chaining it (a.concat(b).concat(c)) or using it repeatedly in a loop is inefficient because each call creates a new intermediate String object.

        replace() vs. replaceAll():
                         replace() performs a simple, literal replacement of all occurrences.
                         replaceAll() uses Regular Expressions (Regex). This is more powerful but can be tricky. For example, replaceAll(".", "x") will
                             replace every character because . is a regex wildcard, whereas replace(".", "x") will only replace literal dot characters.

       indent(int): This is a versatile method for multi-line strings.
                    indent(n): If n is positive, it adds n spaces to the beginning of each line.
                    indent(n): If n is negative, it removes up to n spaces from the beginning of each line.
 */

public class L17StringMethods2 {
    public static void main(String[] args) {
// --- 1. Substring Method ---
        System.out.println("--- Substring ---");
        String birthDate = "25/11/1982";

        // Get the index of "1982"
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("Start index of year: " + startingIndex); // Output: 6

        // Get substring from index 6 to the end
        System.out.println("Year: " + birthDate.substring(startingIndex)); // Output: 1982

        // Get substring with start (inclusive) and end (exclusive) index
        // Indexes 3 and 4 (3, 5)
        System.out.println("Month: " + birthDate.substring(3, 5)); // Output: 11

        // --- 2. Join Method (Static) ---
        System.out.println("\n--- Join ---");
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("Joined date: " + newDate);

        // --- 3. Concat Method (and alternatives) ---
        System.out.println("\n--- Concat ---");
        // Inefficient way (multiple objects)
        String newDateConcat = "25";
        newDateConcat = newDateConcat.concat("/");
        newDateConcat = newDateConcat.concat("11");
        newDateConcat = newDateConcat.concat("/");
        newDateConcat = newDateConcat.concat("1982");
        System.out.println("Concatenated date: " + newDateConcat);

        // Plus operator (compiler optimizes this for literals)
        String newDatePlus = "25" + "/" + "11" + "/" + "1982";
        System.out.println("Plus operator date: " + newDatePlus);

        // Method chaining (still creates multiple objects)
        String newDateChained = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("Chained concat date: " + newDateChained);

        // --- 4. Replace Methods ---
        System.out.println("\n--- Replace ---");
        // replace() with characters (Note always use replace() instead of replaceAll() )
        System.out.println(newDate.replace('/', '-')); // Output: 25-11-1982

        // replace() with strings (replaces ALL "2"s)
        System.out.println(newDate.replace("2", "00")); // Output: 005/11/19800

        // replaceFirst() (only replaces the first "/")
        System.out.println(newDate.replaceFirst("/", "-")); // Output: 25-11/1982

        // replaceAll() (replaces all "/" with "---")
        System.out.println(newDate.replaceAll("/", "---")); // Output: 25---11---1982

        // --- 5. Repeat and Indent Methods ---
        System.out.println("\n--- Repeat & Indent ---");

        // Repeat
        System.out.println("ABC\n".repeat(3));
        System.out.println("---\n".repeat(3));

        // Repeat and Indent (positive)
        // Adds 8 spaces to the start of each line
        System.out.println("Positive Indent:");
        System.out.println("ABC\n".repeat(3).indent(8));

        // Repeat and Indent (negative)
        // Removes 2 spaces from the start of each line
        System.out.println("Negative Indent:");
        System.out.println("    ABC\n".repeat(3).indent(-2));

    }
}
