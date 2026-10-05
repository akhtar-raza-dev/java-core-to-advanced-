package L2_Declarations.l2_2_tokens;

public class L9OperatorPrecedenceAssociativity {
    public static void main(String[] args) {
        // Java Operator Precedence and Associativity
        int a = 5;
        int b = 10;
        int c = 20;
        // Demonstrating operator precedence
        int result1 = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
        System.out.println("Result 1 (a + b * c): " + result1);  // Output: 205

        //! Using parentheses to change precedence
        int result2 = (a + b) * c;  // Parentheses have the highest precedence
        System.out.println("Result 2 ((a + b) * c): " + result2);  // Output: 300

        // Demonstrating associativity if operators has same precedence
        // 1.left-to-right associativity

        int result3 = a + b - c;  // Both + and - have the same precedence, evaluated left to right
        System.out.println("Result 3 (a + b - c): " + result3);  // Output: -5

        // 2.right-to-left associativity
        int result4 = a = b = c;  // Assignment (=) has right-to-left associativity
        System.out.println("Result 4 (a = b = c): " + result4);  // Output: 20
        System.out.println("Value of a after assignment: " + a);  // Output: 20
        System.out.println("Value of b after assignment: " + b);  // Output: 20

        // Complex expression with multiple operators
        int result5 = a++ + --b * c / a - b;
                /* Let's re-evaluate the expression int result5 = a++ + --b * c / a - b;, but this time with a = 20, b = 20, and c = 20.

Step-by-step Execution
1. Initial values:
a = 20,b = 20,c = 20
2. Post-increment (a++):
The value of a++ is 20 (current value of a).
After this step, a becomes 21.
3. Pre-decrement (--b):
--b decrements b to 19 before being used.
4. Multiplication and division (--b * c / a):
Now, b = 19, c = 20, and a = 21.
First, multiply: 19 * 20 = 380.
Then, divide using integer division: 380 / 21 = 18 (since integer division discards the fractional part).
5. Final expression evaluation:
result5 = 20 + 18 - 19;
First, perform the addition: 20 + 18 = 38.
Then, perform the subtraction: 38 - 19 = 19.
int result5 = 19;
 */
        System.out.println("Result 5 (complex expression): " + result5);

        //! Using parentheses to change associativity
        int result6 = a + (b - c);  // Parentheses change the associativity
        System.out.println("Result 6 (a + (b - c)): " + result6);  // Output: 21

        // same precedence of post-increment and post-decrement in one expression
        int d = 4, e = -5;
        int result7 = d++ - e-- + c;
        System.out.println("Result 7 (d++ + e-- + c): " + result7);

        // same precedence of pre-increment and pre-decrement in one expression
        int f = 4, g = -5;
        int result8 = ++f - --g + c;
        System.out.println("Result 8 (++f + --g + c): " + result8);
                /* Let's evaluate the expressions with the given initial values:
c = 20
For result7: d = 4, e = -5
For result8: f = 4, g = -5
1. Expression with Post-increment and Post-decrement:
int d = 4, e = -5;
int result7 = d++ - e-- + c;
System.out.println("Result 7 (d++ - e-- + c): " + result7);
Step-by-step Execution:
1. Post-increment (d++):
The value of d++ is 4 (before increment).
After this, d becomes 5.
2. Post-decrement (e--):
The value of e-- is -5 (before decrement).
After this, e becomes -6.
3. Evaluate the expression:
Now, the expression becomes:
result7 = 4 - (-5) + 20;
First, subtract: 4 - (-5) = 4 + 5 = 9.
Then, add: 9 + 20 = 29.
Final value for result7:
int result7 = 29;
2. Expression with Pre-increment and Pre-decrement:
int f = 4, g = -5;
int result8 = ++f - --g + c;
System.out.println("Result 8 (++f - --g + c): " + result8);
Step-by-step Execution:
1. Pre-increment (++f):
++f increments f first, so f becomes 5.
The value of ++f used in the expression is 5.
2. Pre-decrement (--g):
--g decrements g first, so g becomes -6.
The value of --g used in the expression is -6.
3. Evaluate the expression:
Now, the expression becomes:
result8 = 5 - (-6) + 20;
First, subtract: 5 - (-6) = 5 + 6 = 11.
Then, add: 11 + 20 = 31.
Final value for result8:
int result8 = 31;
Summary:
result7 (post-increment and post-decrement): 29
result8 (pre-increment and pre-decrement): 31
*/


    }
}
