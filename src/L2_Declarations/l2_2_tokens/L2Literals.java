package L2_Declarations.l2_2_tokens;

public class L2Literals {
    public static void main(String[] args) {
        // =========================================================================
        //! 6) LITERALS
        // Definition: Literals are fixed/constant values directly assigned to variables.
        // =========================================================================

        // -------------------------------------------------------------------------
        // 1. INTEGER LITERALS (4 standard number bases)
        // -------------------------------------------------------------------------
        int a = 101;   // Decimal (Base 10) - Standard numbers
        int b = 0101;  // Octal (Base 8) - Prefixed with '0' (0101 in base 8 = 65 in base 10)
        int c = 0x101; // Hexadecimal (Base 16) - Prefixed with '0x' or '0X' (0x101 = 257 in base 10)
        int d = 0b101; // Binary (Base 2) - Prefixed with '0b' or '0B' (0b101 = 5 in base 10)

        System.out.println("Integer Literals:");
        System.out.println("Decimal (101): " + a);
        System.out.println("Octal (0101): " + b);
        System.out.println("Hexadecimal (0x101): " + c);
        System.out.println("Binary (0b101): " + d);
        System.out.println();

        // -------------------------------------------------------------------------
        // 2. FLOATING-POINT LITERALS
        // -------------------------------------------------------------------------
        float e = 101.0f;     // Float literal requires 'f' or 'F' suffix
        double f = 101.0e-24; // Double literal (default type for decimals; supports scientific notation)

        System.out.println("Floating Point Literals:");
        System.out.println("Float: " + e);
        System.out.println("Double (Scientific Notation): " + f);
        System.out.println();

        // -------------------------------------------------------------------------
        // 3. CHARACTER LITERALS (Represented in 4 different ways)
        // -------------------------------------------------------------------------
        char g = '?';      // 1) Single character enclosed in single quotes
        char h = '\u0410'; // 2) Unicode representation (4-digit hex code: '\u0410' = Cyrillic 'А')

        // 3) Integral literals representing ASCII / Unicode numerical values (0 to 65535)
        char i = 2979;     // Decimal integral value
        char j = 055;      // Octal integral value (055 octal = 45 decimal = '-')
        char k = 0x4A;     // Hexadecimal integral value (0x4A hex = 74 decimal = 'J')

        System.out.println("Character Literals:");
        System.out.println("Single char: " + g);
        System.out.println("Unicode (\\u0410): " + h);
        System.out.println("Integral Decimal (2979): " + i);
        System.out.println("Integral Octal (055): " + j);
        System.out.println("Integral Hex (0x4A): " + k);
        System.out.println();

        // -------------------------------------------------------------------------
        // 4. ESCAPE SEQUENCES (Special characters used inside char and String)
        // -------------------------------------------------------------------------
        char l = '\n'; // Newline
        char m = '\t'; // Tab
        char n = '\b'; // Backspace
        char o = '\r'; // Carriage Return
        char p = '\f'; // Form Feed
        char q = '\''; // Single Quote (MUST be escaped inside char literal: '\'')
        char r = '"';  // Double Quote (Optional to escape inside char literal: '"' or '\"')
        char s = '\\'; // Backslash (MUST be escaped: '\\')

        System.out.println("Escape Sequences in Char:");
        System.out.println("Single Quote: " + q);
        System.out.println("Double Quote: " + r);
        System.out.println("Backslash: " + s);
        System.out.println();

        // -------------------------------------------------------------------------
        // 5. STRING LITERALS
        // -------------------------------------------------------------------------
        // 1) Enclosed in double quotes
        String t = "Hello World!";
        System.out.println("String Literal: " + t);

        // 2) Escape sequences inside String literals
        System.out.println("\nEscape sequences inside Strings:");
        System.out.println("Newline & Tab:\nHello,\nworld!\tThis is a tab.");
        System.out.println("Backspace: Hello\bworld!"); // Overwrites previous char in some terminals
        System.out.println("Double quote: \"Hello\"");   // MUST be escaped inside String: \"
        System.out.println("Single quote: 'Hello'");     // Optional to escape inside String (can also use \'Hello\')
        System.out.println("Backslash: \\");
        System.out.println();

        // -------------------------------------------------------------------------
        // 6. BOOLEAN LITERALS
        // -------------------------------------------------------------------------
        boolean u = true;  // Reserved keyword 'true'
        boolean v = false; // Reserved keyword 'false'

        System.out.println("Boolean Literals: " + u + ", " + v);
    }
}