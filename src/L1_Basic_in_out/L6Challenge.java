package L1_Basic_in_out;

import java.io.Console;
import java.util.Scanner;

public class L6Challenge {
    public static void main(String[] args) {
        /*
         * Challenge: Read a person's name and year of birth using both Console
         * and Scanner, then display their calculated age.
         */

        /* Open Command Prompt and run:
          1) cd "E:\Java Programming" -
          2) java src\L1_Basic_in_out\L6Challenge.java
        * */
        int currentYear = 2026;

        System.out.println(getInputFromConsole(currentYear));

//        The method does not need to create or close the scanner itself.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(getInputFromScanner(scanner, currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        Console console = System.console();
        if (console == null) {
            return "Console is unavailable. Run this method from a terminal.";
        }

        String name = console.readLine("Enter your name: ");
        int birthYear = Integer.parseInt(console.readLine("Enter your year of birth: "));
        return "Hi " + name + ", you are " + (currentYear - birthYear) + " years old.";
    }

    public static String getInputFromScanner(Scanner scanner, int currentYear) {
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();

        return "Hi " + name + ", you are "
                + (currentYear - birthYear) + " years old.";
    }
}
