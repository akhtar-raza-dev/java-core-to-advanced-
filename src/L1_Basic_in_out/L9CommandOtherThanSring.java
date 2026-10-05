package L1_Basic_in_out;

public class L9CommandOtherThanSring {
    //? run in terminal: java file_path arguments OR use IDE feature
    /*
     * Command-line arguments are always received as String values.
     * Parse them when the program needs numeric types such as int, float, or double.
     */
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Provide three arguments: an integer, a float, and a double.");
            return;
        }

        try {
            int integerValue = Integer.parseInt(args[0]);
            float floatValue = Float.parseFloat(args[1]);
            double doubleValue = Double.parseDouble(args[2]);

            System.out.println("Integer argument: " + integerValue);
            System.out.println("Float argument: " + floatValue);
            System.out.println("Double argument: " + doubleValue);
            System.out.println("Sum using decimal values: "
                    + (integerValue + floatValue + doubleValue));

            // Casting truncates the fractional parts before calculating this sum.
            int truncatedSum = integerValue + (int) floatValue + (int) doubleValue;
            System.out.println("Sum after casting to int: " + truncatedSum);
        } catch (NumberFormatException exception) {
            System.out.println("The first three arguments must be valid numbers.");
        }
    }
}
