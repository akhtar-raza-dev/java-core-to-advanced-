package L3_ControlFlowStatements.l3_1_ContionalStatements;

import java.util.Scanner;

public class L12Ques {
    public static void main(String[] args) {

        //todo_ Write a program to calculate the amount of the bill for the following jobs.
        //todo_ (a) Scanning and hardcopy of a passport photo Rs. 5.
        //todo_ (b) Scanning and hardcopies (more than 10) Rs. 3.

        // use if-else statement to calculate the amount of the bill.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hardCopies: ");
        int hardCopies = sc.nextInt();
        int amount = 0;
        if (hardCopies <= 10) {
            amount = 5;
            System.out.println("Amount: " + amount);
        } else {
            amount = 3;
            System.out.println("Amount: " + amount);
        }
    }
}
