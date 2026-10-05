package L2_Declarations.l2_2_tokens;

public class L3Operators {
    public static void main(String[] args) {

        //! 1) UNARY OPERATORS : Used to perform operations on a single operand.
        //?  1.Unary Plus and Minus Operators: used to indicate positive or negative values.
        int m = 5;
        System.out.println("Unary Plus : " + (m)); //todo +5  (NOTE: Unary Plus is not used as it does not change the value)
        System.out.println("Unary Minus : " + (-m)); //todo -5    (NOTE: Unary Minus is used to change the value to negative)

        //?  2.Increment and Decrement Operators: used to increase or decrease the value of a variable by 1.
        int o = 5, w = 5;
        System.out.println("o++ : " + (o++)); // 5 (prints then increments) i.e. o = 6
        System.out.println("++o : " + (++o)); // 7 (increments then prints) i.e. o = 7
        System.out.println("o-- : " + (o--)); // 7 (prints then decrements) i.e. o = 6
        System.out.println("--o : " + (--o)); // 5 (decrements then prints) i.e. o = 5
        System.out.println((o++) + 10); // 5 + 10 = 6
        System.out.println(o); // 6
        System.out.println((++w) + 1); // 6 + 1 = 7
        System.out.println(w); // 6

        //?  3.Logical Negation Operator: used to invert the value of a boolean.
        boolean p = true;
        System.out.println("Logical Negation (or) NOT : " + (!p)); // !true --> false

        //?  4.Bitwise Complement Operator: used to invert the bits of its operand.
        int q = 5; // 5 = 0101
        System.out.println("Bitwise Complement (or) NOT : " + (~q)); //todo 1010 --> -6 (NOTE: It also changes the sign of the number from positive to negative)


        //! 2) BINARY OPERATORS : Used to perform operations on two operands.
        //?  1.Arithmetic Operators: used to perform mathematical operations.
        int a = 10, b = 20;
        //?    a) Binary Arithmetic Operators
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b)); // 10 - 20 = -10

        //?    b) Unary Arithmetic Operators (NOTE: UNARY OPERATOR)
        System.out.println("a++ : " + (a++)); // 10 (prints then increments) i.e. a = 11
        System.out.println("++a : " + (++a)); // 12 (increments then prints) i.e. a = 12
        System.out.println("a-- : " + (a--)); // 12 (prints then decrements) i.e. a = 11
        System.out.println("--a : " + (--a)); // 10 (decrements then prints) i.e. a = 10


        //?  2.Bitwise Operators: used to perform bit operations.
        int c = 5, d = 7, e1 = 6; // 5 = 0101, 7 = 0111
        System.out.println("c AND d = " + (c & d)); //   0101
                                                    // & 0111  (same as 1 1 = 1,(all remaining once always gives 0) 0 0 = 0, 1 0 = 0, 0 1 = 0)
                                                   //    ----
                                                   //    0101 --> 5

        System.out.println("c OR d = " + (c | d)); //    0101
                                                    // | 0111  (same as 0 0 = 0,(all remaining once always gives 1) 1 1 = 1, 1 0 = 1, 0 1 = 1)
                                                    //   ----
                                                    //   0111 --> 7

        System.out.println("c XOR d = " + (c ^ d)); //   0101
                                                    // ^ 0111  (same as 1 1 = 0, 0 0 = 0, 1 0 = 1, 0 1 = 1) i.e same bits = 0, different bits = 1
                                                    //   ----
                                                    //   0010 --> 2

        System.out.println(" Bitwise Complement (or) NOT of number "+ c + " is " + (~c)); //! 0101 = 1010 --> -6 (NOTE: UNARY OPERATOR) changing bits from 0 to 1 and 1 to 0 and
                                                                      //!                     also changes the sign of the number from positive to negative.

        System.out.println(" Bitwise Complement (or) NOT of number -5" + " is " + ~(-5) );
        //?     a) Shift Operators or Bitwise Shift Operators
        System.out.println("Signed Left Shift or Left shift : " + (c << 1)); // 0101 << 1 = 1010 --> 10
        System.out.println("Signed Right Shift or Right shift : " + (c >> 1)); // 0101 >> 1 = 0010 --> 2
        System.out.println("Unsigned Right shift or Zero fill right shift : " + (e1 >>> 1)); //? 0101 >>> 1 = 0010 --> 2 (in positive numbers both signed and unsigned right shift gives the same result)


        //?  3.Relational Operators or Comparison Operators: used to compare two values.
        //!    Relational Operators mostly return a boolean value.
        int g = 5, h = 6, i = 6;
        System.out.println("g == h : " + (g == h)); // 5 == 6 --> false
        System.out.println("g != h : " + (g != h)); // 5 != 6 --> true
        System.out.println("g > h : " + (g > h)); // 5 > 6 --> false
        System.out.println("g < h : " + (g < h)); // 5 < 6 --> true
        System.out.println("g >= h : " + (g <= i)); // 5 <= 6 --> true
        System.out.println("g <= h : " + (h >= i)); // 6 >= 6 --> true
        System.out.println();

        //?  4.Boolean Logical Oprators or Logical Operators: used to combine two or more conditions.
        //!    Logical Operators always return a boolean value.

        boolean j = true, k = false;
        System.out.println("AND : " + (j && k)); // true && false --> false
        System.out.println("OR : " + (j || k)); // true || false --> true
        System.out.println("Logical Negation (or) NOT : " + (!j)); // !true --> false (NOTE: UNARY OPERATOR)


        //?  5.Assignment Operators: used to assign values to variables.

        //?    a) Simple Assignment
        int e = 10, f = 20;

        //?    b) Arithmetic-Compound Assignment Operators or Shorthand Assignment Operators
        e += f; // e = e + f
        System.out.println("Add and Assign : " + e);
        e -= f; // e = e - f
        System.out.println("Subtract and Assign : " + e);
        e *= f; // e = e * f
        System.out.println("Multiply and Assign : " + e);
        e /= f; // e = e / f
        System.out.println("Divide and Assign : " + e);
        e %= f; // e = e % f
        System.out.println("Modulus and Assign : " + e);

        //?    c) Bitwise-Compound Assignment Operators or Shorthand Assignment Operators  (leaving ~ because it is a unary operator)
        e <<= 2; // (now e is 10) e = e << 2
        System.out.println("Left shift and Assign : " + e);
        e >>= 1; // (now e is 40) e = e >> 1
        System.out.println("Right shift and Assign : " + e);
        e >>>= 4; // (now e is 20) e = e >>> 4
        System.out.println("Zero fill right shift and Assign : " + e);
        e &= 0; // (now e is 1) e = e & 0
        System.out.println("AND and Assign : " + e); //! 0 means false and 1 means true in binary
        e ^= 1; // e = e ^ 1
        System.out.println("XOR and Assign : " + e);
        e |= 0; // e = e | 0
        System.out.println("OR and Assign : " + e);

        //! 3) TERNARY OPERATOR : Used to perform operations on three operands.

        //!   Ternary Operator returns one of the two values based on a boolean condition.

        int l = 5, n = 6;
        boolean result = (l > n) ? false : true; // 1st operand ? 2nd operand : 3rd operand where 1st operand is the condition to be checked.
                                    // 2nd operand is the value to be returned if the condition is true.
                                    // 3rd operand is the value to be returned if the condition is false.
        System.out.println("Ternary Operator : " + result); // 5 > 6 --> false as per the condition I have given a false value to be return "true".

    }
}
