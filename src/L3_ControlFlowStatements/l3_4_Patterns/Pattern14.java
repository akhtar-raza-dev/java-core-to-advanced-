package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern14 {

    /*
    Forget about the code formulas for a second. Let's throw out i, j, minDist, and math symbols entirely and look at this like a game on a tiled floor.

    The Room Analogy
    Imagine you are standing inside a 7×7 square room made of floor tiles. The walls are:

    Top Wall (Row 0)

    Bottom Wall (Row 6)

    Left Wall (Column 0)

    Right Wall (Column 6)

    Plaintext

        Left Wall (Col 0)                      Right Wall (Col 6)
              ↓                                      ↓
    Top → [ 4 , 4 , 4 , 4 , 4 , 4 , 4 ]
          [ 4 , 3 , 3 , 3 , 3 , 3 , 4 ]
          [ 4 , 3 , 2 , 2 , 2 , 3 , 4 ]
          [ 4 , 3 , 2 , 1 , 2 , 3 , 4 ]
          [ 4 , 3 , 2 , 2 , 2 , 3 , 4 ]
          [ 4 , 3 , 3 , 3 , 3 , 3 , 4 ]
    Bot → [ 4 , 4 , 4 , 4 , 4 , 4 , 4 ]
    Now, stand on any tile on the floor and ask yourself one simple question:

    "How many steps do I have to take to touch the CLOSEST wall?"

    Let's test 3 different tiles manually:
    Spot A: Stand on any tile touching the wall (e.g., Row 0, Column 3)
    How many steps to Top wall? 0 steps (You are already touching it!).

    Closest distance = 0.

    Rule: Starting at 4, subtract closest distance: 4 - 0 = 4.

    Result: All outer wall tiles print 4.

    Spot B: Stand 1 tile inward (Row 1, Column 3)
    Let's measure your distance to all 4 walls:

    Steps to Top wall: 1 step (Row 1 is 1 step away from Row 0)

    Steps to Bottom wall: 5 steps (Row 1 is 5 steps away from Row 6)

    Steps to Left wall: 3 steps (Col 3 is 3 steps away from Col 0)

    Steps to Right wall: 3 steps (Col 3 is 3 steps away from Col 6)

    Which wall is closest? The Top wall! It is only 1 step away.

    Closest distance = 1.

    Rule: 4 - 1 = 3.

    Result: This tile prints 3.

    Spot C: Stand in the exact center (Row 3, Column 3)
    Let's measure your distance to all 4 walls:

    Steps to Top wall: 3 steps

    Steps to Bottom wall: 3 steps

    Steps to Left wall: 3 steps

    Steps to Right wall: 3 steps

    All walls are equally 3 steps away.

    Closest distance = 3.

    Rule: 4 - 3 = 1.

    Result: The center tile prints 1.

    Now, how do we write those 4 distances in code?
    To count your steps from coordinate (i, j) in a 7x7 grid (where rows/cols go from 0 to 6):

    Top Wall: How far are you down from row 0?

    -> Just i  (If you are in row 2, you are 2 steps from top)

    Left Wall: How far are you right from column 0?

    -> Just j  (If you are in col 2, you are 2 steps from left)

    Bottom Wall: How far are you up from row 6?

    -> 6 - i  (If you are in row 5, you are 6 - 5 = 1 step from bottom)

    Right Wall: How far are you left from column 6?

    -> 6 - j  (If you are in col 5, you are 6 - 5 = 1 step from right)

    Summary of the Whole Logic
    Find the shortest step count out of those 4 wall measurements.

    Subtract that shortest count from N (which is 4).

    Print the answer!

    Does taking the measurements as "walking steps to 4 walls" make visual sense now?
    */
    public static void printPattern14(int n) {
        // The grid size is always 2n - 1
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // 1. Calculate distance to all four walls
                int top = i;
                int left = j;
                int bottom = (size - 1) - i; // zero based indexing so - 1;
                int right = (size - 1) - j;

                // 2. Find the minimum distance to the closest wall
                int minDis = Math.min(Math.min(top, left), Math.min(bottom, right)); // Math.min can except max 2 values to compare

                // 3. Print the mapped value
                System.out.print((n - minDis) + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int n = 4;
        printPattern14(n);
    }
}
