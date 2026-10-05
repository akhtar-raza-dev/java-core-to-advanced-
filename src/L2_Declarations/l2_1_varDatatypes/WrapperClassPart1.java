package L2_Declarations.l2_1_varDatatypes;

public class WrapperClassPart1 {
    //? A Wrapper class is a class whose object wraps or encapsulates a primitive data type, converting it into a reference type (object).
    //  The Two Core Mechanisms are as follows:
    //  1) Autoboxing: The automatic conversion of a primitive data type into its corresponding wrapper class is known as autoboxing.
    //  2) Unboxing: The automatic conversion of a wrapper class object into a primitive data type is known as unboxing.
    /*
     * WHY WRAPPER CLASSES EXIST IN JAVA:
     * 1. Collections & Generics: Data structures like ArrayList only accept objects
     *    (e.g., ArrayList, not ArrayList).
     * 2. Nullability: Wrappers can be 'null' to represent missing data (crucial for
     *    databases/APIs), whereas primitives always have a default value (like 0 or false).
     * 3. Utility Methods: They provide built-in methods for data conversion and evaluation
     *    (e.g., Integer.parseInt("123"), Character.isDigit('a')).
     * 4. Constants: They hold useful datatype limits (e.g., Integer.MAX_VALUE).
     */
    public static void main(String[] args) {
        // --------------------------------------------------------
        // AUTOBOXING: Primitive -> Wrapper Object
        // --------------------------------------------------------

        //? byte data type
        byte a = 1;
        //todo_First method of wrapping below works with Java 8 and below
        //! Byte byteObj = new Byte(a); // Deprecated in Java 9+

        //todo_Second method of wrapping below works with Java 9 and above
        /* in most cases, you can simply rely on autoboxing which is more concise and equally efficient
           since the compiler automatically calls `valueOf()` behind the scenes.
         */
        // Byte byteObj = Byte.valueOf(a);
        //! Or
        Byte byteObj = a; //todo_Mostly used method of wrapping (Autoboxing)

        //? short data type
        short s = 20;
        Short shortObj = s;

        //? int data type
        int b = 10;
        //! Integer intObj = new Integer(b);
        Integer intObj = b;

        //? long data type
        long l = 100000L;
        Long longObj = l;

        //? float data type
        float c = 18.6f;
        //! Float floatObj = new Float(c);
        Float floatObj = c;

        //? double data type
        double d = 250.5;
        //! Double doubleObj = new Double(d);
        Double doubleObj = d;

        //? char data type
        char e = 'a';
        Character charObj = e;

        //? boolean data type
        boolean bool = true;
        Boolean boolObj = bool;

        // printing the values from objects
        System.out.println("--- Values of Wrapper objects (printing as objects) ---");
        System.out.println("Byte object byteObj: " + byteObj);
        System.out.println("Short object shortObj: " + shortObj);
        System.out.println("Integer object intObj: " + intObj);
        System.out.println("Long object longObj: " + longObj);
        System.out.println("Float object floatObj: " + floatObj);
        System.out.println("Double object doubleObj: " + doubleObj);
        System.out.println("Character object charObj: " + charObj);
        System.out.println("Boolean object boolObj: " + boolObj);

        // --------------------------------------------------------
        // UNBOXING: Wrapper Object -> Primitive
        // --------------------------------------------------------

        byte bv = byteObj;
        short sv = shortObj;
        int iv = intObj;
        long lv = longObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;
        boolean boolv = boolObj;

        // printing the values from data types
        System.out.println("\n--- Unwrapped values (printing as primitive data types) ---");
        System.out.println("byte value, bv: " + bv);
        System.out.println("short value, sv: " + sv);
        System.out.println("int value, iv: " + iv);
        System.out.println("long value, lv: " + lv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);
        System.out.println("boolean value, boolv: " + boolv);
    }
}