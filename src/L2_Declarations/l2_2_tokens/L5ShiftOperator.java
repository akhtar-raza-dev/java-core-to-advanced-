package L2_Declarations.l2_2_tokens;

public class L5ShiftOperator {
    public static void main(String[] args) {

        //* Shift operators move bits left or right by a specified number of positions.
        //* The most significant bit (MSB) is the sign bit in signed integers: 0 means positive, 1 means negative.
        //* When shifting left, the vacant bits are filled with zeros on the right side of the value.
        //* When shifting right in Java, the sign bit is preserved for signed right shift (>>).

        //? 1. Signed Left Shift Operator: Shifts all bits toward the left by a specified number of positions.
        //?    It is equivalent to multiplying the number by 2^n.
        //?    Syntax: number << n, where n is the number of bits to shift.

        //?    a. Positive Number
        int a = 10; // 10 = 0000 1010
        System.out.println("a << 2 : " + (a << 2)); // 1010 << 2
        // Process: 0000 1010
        //          0010 1000 (After shifting 2 bits to the left)
        //          0 010 1000 is just a grouped view of the same bits.

        // Calculation by binary to decimal: 2^3 + 2^5 = 8 + 32 = 40
        // Calculation by formula: 10 * 2^2 = 10 * 4 = 40

        //! In a signed integer, the MSB represents the sign:
        //! 0 = positive, 1 = negative.
        //! For left shift, vacated lower-order bits are filled with 0s.
        //! For right shift with >>, the sign bit is copied into the left side.

        //?    b. Negative Number
        int b = -10;
        System.out.println("b << 2 : " + (b << 2)); // -10 << 2
        // 1) Process: -10 << 2
        //    To get the binary of a negative number, first find the binary of its positive value, then use 2's complement.
        //    0000 1010 (10)
        //    1111 0101 (1's complement)
        //    1111 0110 (-10 in 2's complement)

        // 2) Process: 1111 0110
        //    Since the MSB is 1, the value is negative, so Java represents it in 32-bit two's complement.
        //    -10 in 32-bit binary: 11111111111111111111111111110110
        //    After shifting left by 2 bits: 11111111111111111111111111011000
        //    Since the MSB is 1 - 2's     : 00000000000000000000000000100111
        //                                                                 +1
        //                                 ----------------------------------
        //                                   00000000000000000000000000101000
        //    Result: -40

        // Calculation by formula: -10 * 2^2 = -10 * 4 = -40

        //? 2. Signed Right Shift Operator: shifts all bits to the right by a specified number of positions.
        //?    For >>, the sign bit is copied to the left, so negative numbers remain negative.
        //?    Syntax: number >> n, where n is the number of bits to shift.

        //?    a. Positive Number
        int c = 17; // 17 = 0001 0001
        System.out.println("c >> 2 : " + (c >> 2)); // 10001 >> 2
        // Process: 0001 0001
        //          0000 0100 (After shifting 2 bits to the right)

        // Since the MSB is 0, the number is positive.
        // Calculation by binary to decimal: 2^2 = 4
        // Calculation by formula: 17 / 2^2 = 17 / 4 = 4

        //?    b. Negative Number
        int d = -17;
        System.out.println("d >> 2 : " + (d >> 2)); // -17 >> 2
        // 1) Process: -17 >> 2
        //    Since the MSB is 1, Java stores the value in 32-bit two's complement.
        //    -17 in 32-bit binary: 11111111111111111111111111101111
        //    Arithmetic right shift copies the sign bit 1 into the left side.

        // 2) Process: 11111111111111111111111111101111
        //             11111111111111111111111111111011 (After shifting 2 bits to the right)
        //    Since the MSB is 1, it is negative. Convert back to positive:
        //    11111111111111111111111111111011
        //    00000000000000000000000000000100 (1's complement)
        //                                       +1
        //                             --------------------
        //    00000000000000000000000000000101
        //    Result: -5

        // Calculation by formula: arithmetic right shift behaves like division by 2^n for signed values.

        //? 3. Unsigned Right Shift Operator or Zero Fill Right Shift Operator: shifts all bits to the right and fills the left side with 0s.
        //?    Syntax: number >>> n, where n is the number of bits to shift.

        //?    a. Positive Number (same as signed right shift for positive values)
        int e = 17; // 17 = 0001 0001
        System.out.println("e >>> 2 : " + (e >>> 2)); // 10001 >>> 2
        // Process: 0001 0001
        //          0000 0100 (After shifting 2 bits to the right)

        // Since the MSB is 0, both >> and >>> give the same result.
        // Calculation by binary to decimal: 2^2 = 4
        // Calculation by formula: 17 / 2^2 = 17 / 4 = 4

        //?    b. Negative Number (different from >> because it fills the empty left bits with 0s)
        int f = -17;
        System.out.println("f >>> 2 : " + (f >>> 2)); // -17 >>> 2
        // 1) Process: -17 >>> 2
        //    Since the MSB is 1, the number is negative, so Java shows it in 32-bit binary:
        //    11111111111111111111111111101111
        //    Logical right shift fills the left side with 0s.

        // 2) Process: 11111111111111111111111111101111
        //    Because >>> uses zero-fill right shift, the leftmost bits become 0.
        //    After shifting 2 bits to the right:
        //    00111111111111111111111111111011
        //    Result: 1073741819

        // The MSB changed from 1 to 0, so the negative value becomes a large positive number.

    }
}
