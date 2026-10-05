package L1_Basic_in_out;

//! In java, there are three ways to read console input. Using the 3 following ways, we can read input data from the console.
//!   1) Using Scanner class
//!   2) Using BufferedReader class
//!   3) Using Console class

//*                                          1) Using Scanner class

import java.util.InputMismatchException;
import java.util.Scanner;

public class L3InputUsingScanner {
    public static void main(String[] args) {

        // try-with-resources automatically closes the Scanner when this block ends,
        // even if an exception occurs; therefore, scanner.close() is unnecessary.

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine();
            System.out.println("Your full name is: " + fullName);

            System.out.print("Enter your first name: ");
            String firstName = scanner.next(); // Reads one word only.
            System.out.println("Your first name is: " + firstName);

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Your age is: " + age);

            System.out.print("Enter your height: ");
            double height = scanner.nextDouble();
            System.out.println("Your height is: " + height);

            System.out.print("Are you married? (true/false): ");
            boolean married = scanner.nextBoolean();
            System.out.println("Married: " + married);

            System.out.print("Enter a byte value: ");
            byte byteValue = scanner.nextByte();
            System.out.println("Byte value: " + byteValue);

            System.out.print("Enter a short value: ");
            short shortValue = scanner.nextShort();
            System.out.println("Short value: " + shortValue);

            System.out.print("Enter a long value: ");
            long longValue = scanner.nextLong();
            System.out.println("Long value: " + longValue);

            System.out.print("Enter a float value: ");
            float floatValue = scanner.nextFloat();
            System.out.println("Float value: " + floatValue);

            // Scanner has no nextChar(); read a String and take its first character.
            System.out.print("Enter a character: ");
            char character = scanner.next().charAt(0);
            System.out.println("Character: " + character);
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input. Enter a value in the requested format.");
        }
    }
}
