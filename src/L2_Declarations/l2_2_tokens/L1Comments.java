package L2_Declarations.l2_2_tokens;

//! Tokens: Tokens are the smallest elements of a program that are meaningful to the compiler.
//! Types of tokens (trick - SSICCOK): 1) Keywords 2) Identifiers 3) Special Symbol 4) Separators  5) Comments 6) Literals or Constant 7) Operators
//!  1 to 4 are theoretically written in note.

// Comment: Comments are non-executable parts of code that are used to provide explanation of code or temporarily disable the code during development.
// Type of comments 1) Single line comment as shown in this line (syntax: // comment here)
/* 2) Multi line comment as shown in these multiple lines (syntax: /* comment here * /)
                  india
                        is
                           great
                                 really!

   3) Documentation comment as shown below this (syntax: /** comment here * /)
 */
/**
 * 3) Documentation comment:
 * This class Showing Documentation comment representing a simple calculator that can perform basic arithmetic operations.
 * <p>
 * The Calculator class provides methods to add, subtract, multiply, and divide two numbers.
 * </p>
 *
 * @author Akhtar raza
 * @version 2.0
 * @see <a  href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target= "_blanks">Javadocs</a>
 * @since 2024-8-22
 */
public class L1Comments {

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference between a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     * @deprecated This API should no longer be used. (But actually it is just used here that how it looks on web)
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * Main method to test the Calculator class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        L1Comments calculator = new L1Comments();
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
    }
}

