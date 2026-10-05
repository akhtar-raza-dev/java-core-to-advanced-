package L1_Basic_in_out;

public class L8CommandLineArgument {
    public static void main(String[] args) {
        //? run in terminal: java file_path arguments OR use IDE feature
        // Command-line arguments are received as String values.
        // Use double quotes when one argument contains spaces.
        System.out.println("Demo of Command-Line Arguments");

        if (args.length == 0) {
            System.out.println("No arguments passed.");
            return;
        }
        // The condition only runs when there are fewer than two arguments: 0 or 1. for example 2 < 2 - false | 1 < 2 - true | 3 < 2 - false
        if (args.length < 2) {
            System.out.println("Pass at least two numeric arguments to calculate their sum.");
            return;
        }

        System.out.println("Number of arguments: " + args.length);
        for (int index = 0; index < args.length; index++) {
            System.out.println("Argument at index " + index + ": " + args[index]);
        }

        try {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            System.out.println("Sum of the first two arguments: "
                    + (firstNumber + secondNumber));
        } catch (NumberFormatException exception) {
            System.out.println("The first two arguments must be valid integers.");
        }
    }
}
