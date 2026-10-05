package L1_Basic_in_out;

/*
 * Java provides three common methods for writing output:
 * print()   writes without automatically moving to the next line.
 * println() writes and then moves to the next line.
 * printf()  writes formatted output using format specifiers.
 */
public class L7Output {
    public static void main(String[] args) {
        long x = 25;
        long y = 50;

        demonstratePrint(x, y);
        demonstratePrintln(x, y);
        demonstratePrintf(x, y);
    }

    private static void demonstratePrint(long x, long y) {
        System.out.println("\n--- print() ---");

        // print() does not add a line break; \n adds one explicitly.
        System.out.print("The value of x is ");
        System.out.print(x);
        System.out.print(", and the value of y is ");
        System.out.print(y);
        System.out.print(".\n");

        System.out.print("The value of x is " + x
                + ", and the value of y is " + y + ".\n");
    }

    private static void demonstratePrintln(long x, long y) {
        System.out.println("\n--- println() ---");

        // println() adds the platform-specific line separator after the value.
        System.out.println();
        System.out.println("The value of x is currently " + x + ".");
        System.out.println("The value of y is currently " + y + ".");
    }

    private static void demonstratePrintf(long x, long y) {
        System.out.println("\n--- printf() ---");

        // %n inserts the platform-specific line separator in formatted output.
        System.out.printf("1%n2%n3%n4%n5%n");

        // %d formats an integral value.
        System.out.printf("The value of x is %d, and the value of y is %d.%n", x, y);

        demonstrateFloatingPoint();
        demonstrateTextAndCharacters();
        demonstrateBooleanAndHashCode();
        demonstrateNumberFormats(x, y);
        demonstrateDateAndTime();
        demonstrateWidthPrecisionAndFlags();
    }

    private static void demonstrateFloatingPoint() {
        System.out.println("\nFloating-point formats:");
        float floatValue = 1.1234567890123456f;
        double doubleValue = 1.1234567890123456;

        System.out.println(floatValue);  // Outputs: 1.1234568 (Accuracy lost after 7 digits!)
        System.out.println(doubleValue); // Outputs: 1.1234567890123457 (Accurate to 16 digits)
        System.out.printf("%f%n", floatValue);       // %f uses six digits after the decimal by default.
        System.out.printf("%f%n", doubleValue);
        System.out.printf("%.2f%n", floatValue);     // .2 specifies two digits after the decimal point.
        System.out.printf("%.15f%n", doubleValue);
        System.out.printf("%.25f%n", doubleValue);

        System.out.printf("%e%n", 123.1234567);      // Scientific notation with a lowercase e.
        System.out.printf("%E%n", 123.1234567);      // Scientific notation with an uppercase E.
        System.out.printf("%.2e%n", 123.1234567);
        System.out.printf("%.4E%n", 123.1234567);
    }

    private static void demonstrateTextAndCharacters() {
        System.out.println("\nText and character formats:");
        System.out.printf("%s%n", "Hello World");
        System.out.printf("%S%n", "Hello World");    // Uppercase conversion.
        System.out.printf("%.15s%n", "Hello World Akhtar raza"); // Maximum 15 characters.
        System.out.printf("%c%n", '%');
        System.out.printf("%C%n", 'a');              // Uppercase conversion.
        System.out.printf("%c%n", 67);               // 67 is the Unicode code point for 'C'.
    }

    private static void demonstrateBooleanAndHashCode() {
        System.out.println("\nBoolean and hash-code formats:");
        boolean isValid = 10 < 20;
        System.out.printf("%b%n", isValid);
        System.out.printf("%B%n", 10 > 20);          // Uppercase TRUE or FALSE.
        System.out.printf("%b%n", 30);               // A non-null, non-Boolean value formats as true.
        System.out.printf("%b%n", false);

        // %h prints an object's hash code in hexadecimal; it is not a unique identifier.
        System.out.printf("%h%n", "white");
        System.out.printf("%H%n", "black");          // Uppercase hexadecimal.
    }

    private static void demonstrateNumberFormats(long x, long y) {
        System.out.println("\nNumber formats:");
        System.out.printf("%a%n", 123.1234567);      // Hexadecimal floating-point notation.
        System.out.printf("%A%n", 123.1234567);
        System.out.printf("%o%n", 8);                // Octal integer.
        System.out.printf("%o%n", 9);
        System.out.printf("%o%n", 16);
        System.out.printf("%x%n", 10);               // Lowercase hexadecimal integer.
        System.out.printf("%X%n", 15);               // Uppercase hexadecimal integer.
        System.out.printf("%X%n", 168);
        System.out.printf("The value of x is %d%%, and the value of y is %d%%%n", x, y);
    }

    private static void demonstrateDateAndTime() {
        System.out.println("\nDate and time formats:");
        long currentTime = System.currentTimeMillis();

        System.out.printf("%tF%n", currentTime);     // yyyy-MM-dd
        System.out.printf("%tD%n", currentTime);     // MM/dd/yy
        System.out.printf("%tT%n", currentTime);     // HH:mm:ss
        System.out.printf("%tr%n", currentTime);     // hh:mm:ss AM/PM
        System.out.printf("%tR%n", currentTime);     // HH:mm
        System.out.printf("%tY%n", currentTime);     // Four-digit year
        System.out.printf("%tj%n", currentTime);     // Day of the year
        System.out.printf("%tm%n", currentTime);     // Month number
        System.out.printf("%td%n", currentTime);     // Day of the month
        System.out.printf("%tH%n", currentTime);     // Hour
        System.out.printf("%tM%n", currentTime);     // Minute
        System.out.printf("%tS%n", currentTime);     // Second
        System.out.printf("%tz%n", currentTime);     // Numeric time-zone offset
        System.out.printf("%tZ%n", currentTime);     // Time-zone abbreviation
        System.out.printf("%tp%n", currentTime);     // AM or PM
        System.out.printf("%tB%n", currentTime);     // Full month name
        System.out.printf("%tb%n", currentTime);     // Abbreviated month name
        System.out.printf("%ta%n", currentTime);     // Abbreviated weekday name
        System.out.printf("%tc%n", currentTime);     // Complete date and time
    }

    private static void demonstrateWidthPrecisionAndFlags() {
        System.out.println("\nWidth, precision, and flag formats:");
        System.out.printf("%010d%n", 786);            // Minimum width 10, padded with zeroes.
        System.out.printf("|%10d|%n", 786);           // Minimum width 10, right-aligned.
        System.out.printf("|%-10d|%n", 786);          // Minimum width 10, left-aligned.
        System.out.printf("|%20.5f|%n", 786.123456);  // Width 20, five digits after the decimal.
        System.out.printf("|%-20.5f|%n", 786.123456);
        System.out.printf("%,d%n", 50_000_000);      // Grouping separator.
        System.out.printf("% d%n", -50_567);         // Space reserved for a positive sign.
        System.out.printf("% d%n", 50_567);
        System.out.printf("%+d%n", 10_000);          // Always show the sign.
        System.out.printf("%+d%n", -10_000);
        System.out.printf("%(d%n", -500);            // Enclose negative values in parentheses.
        System.out.printf("%(d%n", 500);
    }
}
