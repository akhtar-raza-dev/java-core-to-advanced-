package L1_Basic_in_out;

//*                         3) Using Console class
// Console is mainly useful for interactive terminal input and passwords.

import java.io.Console;
import java.util.Arrays;

public class L5InputUsingConsole {
    public static void main(String[] args) {
        /* Open Command Prompt and run:
          1) cd "E:\Java Programming" -
          2) java src\L1_Basic_in_out\L5InputUsingConsole.java
        * */

        Console console = System.console();

        // System.console() can return null when the program runs inside an IDE.
        if (console == null) {
            System.out.println("Run this program in Command Prompt or PowerShell.");
            return;
        }

        String username = console.readLine("Username: ");
        char[] password = console.readPassword("Password: ");

        System.out.println("Welcome, " + username);

        // Clear the password characters from the array after use.
        Arrays.fill(password, '\0');
    }
}

