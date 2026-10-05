package L2_Declarations.l2_1_varDatatypes;

public class L4TypesOfDatatype {
    public static void main(String[] args) {

        // 1) Primitive data types
        // byte - 1 byte
        byte varByte = 127;
        System.out.println("Byte: " + varByte);

        // short - 2 bytes
        short varShort = 32767;
        System.out.println("Short: " + varShort);

        // int - 4 bytes
        int varInt = 2_147_483_647;
        System.out.println("Int: " + varInt);
        //? int (32-bit signed):  ~2.14 Billion     (10^9)  -> 2_147_483_647

        //? long (64-bit signed): ~9.22 Quintillion (10^18) -> 9_223_372_036_854_775_807L
        // long - 8 bytes
        long varLong = 9_223_372_036_854_775_807L;
        System.out.println("Long: " + varLong);

        // float - 4 bytes
        float varFloat = 3.4028235E38f;
        System.out.println("Float: " + varFloat);

        // double - 8 bytes
        double varDouble = 1.7976931348623157E308;
        System.out.println("Double: " + varDouble);

        // char - 2 bytes
        char varChar = 'A';
        System.out.println("Char: " + varChar);

        // boolean - 1 byte but it uses only 1 bit of memory.
        boolean varBoolean = true;
        System.out.println("Boolean: " + varBoolean);

        // 2) Non-primitive data types
        // String
        String varString = "Hello World!";
        System.out.println("String: " + varString);

        // Array
        int[] varArray = {1, 2, 3, 4, 5};
        System.out.println("Array: " + varArray[0]);

        // Class
        L4TypesOfDatatype varClass = new L4TypesOfDatatype();
        System.out.println("Class: " + varClass);

        // Interface
        // Interface varInterface = new Interface();
        // System.out.println("Interface: " + varInterface);



        //! Detailed explained

        // Float and Double
        int myIntValue = 5 / 3;
        float myFloatValue = 5.00f / 3.00F;//?  this show error without F because by deflaut it is double
        //! or
        float myfloatValue2 = (float)5.25;
        double myDoubleValue = 5.00 / 3;
        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_567_890;

        double numOfPounds = 200;
        double convertKilo = numOfPounds * 0.45359237;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println(myfloatValue2);
        System.out.println(pi);
        System.out.println(anotherNumber);
        System.out.println("Program to convert given number of Pounds to kilogram ");
        System.out.println("Converted kilograms is " + convertKilo);

        // Character and boolean
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u002f';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);

        char c = 64;
        System.out.println(c);
        c++;
        System.out.println(c);

        // Promotion of datatype in expression
        byte b = 42;
        char chara = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result =  (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
        /*
         * Output:
         * result = 880.7784146484375
         *
         * Calculation Breakdown:
         * 1. c starts at 64 ('@'), then c++ increments it to 65 ('A').
         * 2. (f * b) = 5.67f * 42 = 238.14f (float)
         * 3. (i / c) = 50000 / 65 = 769 (int integer division, truncates decimal)
         * 4. (d * s) = 0.1234 * 1024 = 126.3616 (double)
         * 5. result  = 238.1400146484375 + 769 - 126.3616 = 880.7784146484375
         */

    }
}
