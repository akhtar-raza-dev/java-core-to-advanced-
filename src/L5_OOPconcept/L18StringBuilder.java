package L5_OOPconcept;
/*
The main difference is mutability:
    String is immutable: Methods that "change" a string (like concat) actually create and return a new string object. The original string is unchanged. You must assign the result to a variable to capture the change.
    StringBuilder is mutable: Methods (like append) modify the same object in memory. This is more efficient for performing many text manipulations.

Capacity and length:
    StringBuilder has a length (number of characters) and a capacity (allocated memory).
    An empty StringBuilder() defaults to a capacity of 16.
    You can set the initial capacity (e.g., new StringBuilder(32)) to improve performance if you know the text will be large.
    If the length exceeds the capacity, the StringBuilder must automatically request more memory and copy the data.

Manipulation Methods and Chaining;
    StringBuilder methods return a reference to the object itself, allowing you to chain methods together.

delete(start, end) or deleteCharAt(index)
insert(index, str)
replace(start, end, str)
reverse()
setLength(int) (truncates the string)

 */
public class L18StringBuilder {
    public static void main(String[] args) {


        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye"); //? Does not change the original string as it is immutable
//        String helloWorld = new String("Hello" + " World"); Valid code, but redundant

//todo  There are 4 ways to create a StringBuilder object using the new keyword
//      StringBuilder helloWorldBuilder = "Hello" + " World";" NOTE - This literal assignment DOES NOT COMPILE

        //! 1. Pass a String
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye"); //? Modifies the same object in heap memory as it is mutable
        //! 2. Pass some other type of character sequence
        StringBuilder copyBuilder = new StringBuilder(helloWorld);

        //! 3. Pass no arguments - creates an empty StringBuilder with default capacity of 16 characters
        StringBuilder emptyBuilder = new StringBuilder();
        emptyBuilder.append("a".repeat(17));

        //! 4. Pass an integer value as the capacity
        StringBuilder initialCapacityBuilder = new StringBuilder(32);
        initialCapacityBuilder.append("a".repeat(17));

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        printInformation(emptyBuilder);
        printInformation(initialCapacityBuilder);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        //! Deleting and inserting characters (G - g)
        builderPlus.deleteCharAt(16).insert(16, "g");
        System.out.println(builderPlus);

        //! Replacing characters (g - G) (staring index inclusive and ending index exclusive )
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        //! Reverse and setLength
        builderPlus.reverse().setLength(10);
        System.out.println(builderPlus);

    }
    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }
    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}
