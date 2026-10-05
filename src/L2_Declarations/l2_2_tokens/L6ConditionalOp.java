package L2_Declarations.l2_2_tokens;

public class L6ConditionalOp {
    public static void main(String[] args) {

        //* Conditional Operator or ternary Operator

        int x, y;
        x = 20;
        y = (x == 1) ? 61: 90;
        System.out.println("Value of y is: " +  y);
        y = (x == 20) ? 61: 90;
        System.out.println("Value of y is: " + y);


        //? Find the largest number among three numbers using the conditional operator
        x=69;
        y=89;
        int z=79;
        int largestNumber = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("The largest numbers is:  "+largestNumber);
    }
}
