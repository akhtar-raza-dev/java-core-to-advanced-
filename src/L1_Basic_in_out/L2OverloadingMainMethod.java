package L1_Basic_in_out;

public class L2OverloadingMainMethod {

    public static void main(int args) {
        System.out.println("main() overloaded method 1 Executing");
    }

    public static void main(char args) {
        System.out.println("main() overloaded method 2 Executing");
    }

    public static void main(Double[] args) {
        System.out.println("main() overloaded method 3 Executing");
    }

    // JVM calls this method when the class is executed.
    public static void main(String[] args) {
        System.out.println("Original main() Executing");

        // Manually call overloaded main methods
        main(10);
        main('A');
        main(new Double[] { 1.2, 3.4 });
    }
}