package L2_Declarations.l2_1_varDatatypes;

public class WrapperClassPart2 {
    public static void main(String[] args) {

        // Wrapper class also stores the range of primitive data types

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int BigIntLiteralValue = 2_147_483_647; // ? underscore can be added for more readability


        System.out.println("Byte Value Range = (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");

        byte BigByteLiteralValue = 127;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        short BigShortLiteralValue = 32767;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long BigLongLiteralValue = 2_147_483_647; // ? by default treated as int value
        long BigLongLiteralValue2 = 9223372036854775807L;// ? L should be added at last to store a long datatype value because by default it is treated as int

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        System.out.println("character range = 0 to 65535"); //? It is unsigned, so it is from 0 to 65535.Note that wrapper class won't store the range of char

        System.out.println("Boolean range = (" + Boolean.FALSE + " to " + Boolean.TRUE + ")");

        // Expression 1 -------------------------------------------------------------------------------------------------------------------------------

        int myNewIntValue = (BigIntLiteralValue / 2); // ? By Default treated as int inside the parenthesis
        //! Type Casting --> byte and short can't store int value (variable name used in the calculation should always be treated as int by default)
        byte myNewByteValue = (byte) (BigByteLiteralValue / 2); // ? show error and byte can't store int --> TypeCasting
        short myNewShortValue = (short) (BigShortLiteralValue / 2); // ? same thing

        //! No need of type casting as a numeric value is used, so the compiler can predict the value and store it in the respective variable type
        byte myNewByteValue2 = 127/2;
        short myNewShortValue2 = 32767/2;

        long myNewLongValue = (BigLongLiteralValue / 2); // ? no need for long
        long myNewLongValue2 = (BigLongLiteralValue2 / 2); // ? no need for long

        System.out.println(myNewIntValue);
        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);
        System.out.println(myNewByteValue2);
        System.out.println(myNewShortValue2);
        System.out.println(myNewLongValue);
        System.out.println(myNewLongValue2);

        // Expression 2 -------------------------------------------------------------------------------------------------------------------------------
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;

        byte byteTotal = (byte)(67 + 1 * (byteValue + shortValue + intValue)); //? more than range will lead to overflow i.e. -128 to 127
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        int intTotal = 1000 + 10 * (byteValue + shortValue + intValue);
        long longTotal = 1000L + 10l * (byteValue + shortValue + intValue);

        System.out.println(byteTotal);
        System.out.println(shortTotal);
        System.out.println(intTotal);
        System.out.println(longTotal);
    }

}
