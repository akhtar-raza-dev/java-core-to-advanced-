package L5_OOPconcept;

public class L15StringFormatted {
    public static void main(String[] args) {

//todo     1) Multi-line Strings (Text Blocks):
//todo        i) The Old Way
        String bulletIt = "Print a bulleted list:" + "\u2022 First point " + "\u2022 Sub point";
        System.out.println(bulletIt);

        String bulletIt2 = "Print a bulleted list:\n\t\u2022 First point\n\t\t\u2022 Sub point";
        System.out.println(bulletIt2);

//todo      ii) The New Way (Text Blocks)
        String textBlock = """
Print a bulleted list:
\t\u2022 First point
\t\t\u2022 Sub point
""";
        System.out.println(textBlock);

//todo       2) Formatted Printing (Numbers):
        int age = 35;
        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("\nAge = %d, Birth year = %d\n", age, yearOfBirth);
//      System.out.printf("Your age is %f", age);  runtime error because it is floating(%f) and we giving it integer
        System.out.printf("Your age is %.3f", (float) age);

        //todo   Formatting with Width (Loop 1: Default alignment)
        // This loop prints numbers, but they will be left-aligned by default.
        // %n is the platform-specific line separator (preferred over \n).
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("%d%n", i);
        }

        //todo  Formatting with Width (Loop 2: Specified width)
        // %6d specifies a "width" of 6 characters.
        // The numbers will be right-aligned (padded with spaces) within that 6-char width.
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("%6d%n", i);
        }

//todo        Alternatives
//        i) String.format() (The "Classic" Static Method)
//           String.format(template, args...)
        String name = "World";
        int age1 = 35;
        // Call it on the String CLASS
        // Pass the template ("Hello, %s. Age: %d") as the FIRST argument
        String s1 = String.format("Hello, %s. Age: %d", name, age1);

        System.out.println(s1);

//todo    ii) String.formatted() (The "New" Instance Method)
//            template.formatted(args...)
        String name1 = "World";
        int age2 = 35;
        // Call it ON THE STRING OBJECT ("Hello, %s. Age: %d")
        // The string itself is the template
        String s2 = "Hello, %s. Age: %d".formatted(name1, age2);
        System.out.println(s2);

    }
}
