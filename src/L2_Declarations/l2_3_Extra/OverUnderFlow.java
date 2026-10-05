package L2_Declarations.l2_3_Extra;

public class OverUnderFlow {
    public static void main(String[] args) {
        //! Overflow/underflow is relevant to integral types (byte, short, int, long). For float and double, Java uses IEEE 754 rules, so overflow may produce Infinity and underflow may produce 0.0 or subnormal values instead of wrapping.
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Max + 1: " + (max + 1)); // overflow
        System.out.println("Min - 1: " + (min - 1)); // underflow

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Max Byte: " + maxByte);
        System.out.println("Min Byte: " + minByte);
        System.out.println("Max Byte + 1: " + (maxByte + 1)); // overflow
        System.out.println("Min Byte - 1: " + (minByte - 1)); // underflow

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Max Short: " + maxShort);
        System.out.println("Min Short: " + minShort);
        System.out.println("Max Short + 1: " + (maxShort + 1)); // overflow
        System.out.println("Min Short - 1: " + (minShort - 1)); // underflow

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Max Long: " + maxLong);
        System.out.println("Min Long: " + minLong);
        System.out.println("Max Long + 1: " + (maxLong + 1)); // overflow
        System.out.println("Min Long - 1: " + (minLong - 1)); // underflow


        // Doesn't work for float and double properly
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("Max Float: " + maxFloat);
        System.out.println("Min Float: " + minFloat);
        System.out.println("Max Float + 1: " + (maxFloat + 1)); // overflow
        System.out.println("Min Float - 1: " + (minFloat - 1)); // underflow

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("Max Double: " + maxDouble);
        System.out.println("Min Double: " + minDouble);
        System.out.println("Max Double + 1: " + (maxDouble + 1)); // overflow
        System.out.println("Min Double - 1: " + (minDouble - 1)); // underflow

        // For float and double, the result will be Infinity or 0.0
        float largeFloat = Float.MAX_VALUE;
        float result = largeFloat * 2;  // The result will be Infinity
        float smallFloat = Float.MIN_VALUE;
        float result2 = smallFloat / 2;  // Result might be 0.0
        System.out.println("Result: " + result);
        System.out.println("Result2: " + result2);

        double largeDouble = Double.MAX_VALUE;
        double result3 = largeDouble * 2;  // Result will be Infinity
        double smallDouble = Double.MIN_VALUE;
        double result4 = smallDouble / 2;  // Result might be 0.0
        System.out.println("Result3: " + result3);
        System.out.println("Result4: " + result4);

    }
}
