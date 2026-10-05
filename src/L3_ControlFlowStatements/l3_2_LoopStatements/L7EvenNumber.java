package L3_ControlFlowStatements.l3_2_LoopStatements;

public class L7EvenNumber {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 20) {
//            if (isEvenNumber(i)) {
//                System.out.print(i + "_");
//            }
//            i++;
//        }

        //! or
        //todo_  Including the increment (or decrement) immediately after the condition in a while loop is a good practice because
        //todo_      it helps ensure that the loop will eventually terminate, avoiding infinite loops

        int number = 4; //? As per question range is between number 5 to 20 but starting from 4 and incremented to just after the condition to 5 as per question
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) { // if not isEvenNumber(number) is false then condition is right therefore, continue and if not isEvenNumber(number) is true then condition is false the next sout is executed
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("Total number of even and odd numbers found = " + evenCount + " and " + oddCount + " respectively");

    }

    public static boolean isEvenNumber(int num) {
        return (num % 2) == 0;
    }
}
