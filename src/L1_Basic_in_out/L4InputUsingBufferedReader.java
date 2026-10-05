package L1_Basic_in_out;

//*                         2) Using BufferedReader class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4InputUsingBufferedReader {
    public static void main(String[] args) {

        // try-with-resources automatically closes the reader when this block ends,
        // even if an exception occurs; therefore, reader.close() is unnecessary.

        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your full name: ");
            String fullName = reader.readLine();
            System.out.println("Your full name is: " + fullName);

            System.out.print("Enter a character: ");
            String characterInput = reader.readLine();
            if (characterInput.isEmpty()) {
                throw new IllegalArgumentException("A character is required.");
            }
            char character = characterInput.charAt(0);
            System.out.println("Character: " + character);

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Age: " + age);

            System.out.print("Enter your height: ");
            double height = Double.parseDouble(reader.readLine());
            System.out.println("Height: " + height);

            System.out.print("Are you married? (true/false): ");
            String marriedInput = reader.readLine();
            if (!marriedInput.equalsIgnoreCase("true")
                    && !marriedInput.equalsIgnoreCase("false")) {
                throw new IllegalArgumentException("Enter true or false.");
            }
            boolean married = Boolean.parseBoolean(marriedInput);
            System.out.println("Married: " + married);

            System.out.print("Enter a byte value: ");
            byte byteValue = Byte.parseByte(reader.readLine());
            System.out.println("Byte value: " + byteValue);

            System.out.print("Enter a short value: ");
            short shortValue = Short.parseShort(reader.readLine());
            System.out.println("Short value: " + shortValue);

            System.out.print("Enter a long value: ");
            long longValue = Long.parseLong(reader.readLine());
            System.out.println("Long value: " + longValue);

            System.out.print("Enter a float value: ");
            float floatValue = Float.parseFloat(reader.readLine());
            System.out.println("Float value: " + floatValue);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid number. Enter a value in the requested format.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid input: " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("Unable to read input: " + exception.getMessage());
        }
    }
}
