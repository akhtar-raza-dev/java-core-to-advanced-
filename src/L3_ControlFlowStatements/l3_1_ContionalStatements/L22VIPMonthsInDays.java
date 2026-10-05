package L3_ControlFlowStatements.l3_1_ContionalStatements;

public class L22VIPMonthsInDays {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(13, 19990)); // 31
        System.out.println(getDaysInMonth(-1, 2020)); // 29
        System.out.println(getDaysInMonth(2, 2028)); // 29
        System.out.println(getDaysInMonth(2, 1900)); // 28
    }
        public static int getDaysInMonth(int month, int year) {

            if (year < 1 || year > 9_999 || month < 1 || month > 12) {
                return -1;
            }
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;  // for any of the following months, return 31
                case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return either 28 or 29.
                case 4, 6, 9, 11 -> 30; // return 30 for the following months
                default -> -1;
            };
        }

          public static boolean isLeapYear(int year) {
              if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                  return true;
              } else {
                  return false;
              }

//        public static boolean isLeapYear(int year) {
//            if (year % 4 == 0) {
//                if (year % 100 != 0) {
//                    return true;
//                } else {
//                    if (year % 400 == 0) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//            } else {
//                return false;
//            }
        }

        /* Gregorian Calendar Overview
The Gregorian calendar, introduced by Pope Gregory XIII in 1582, is the calendar system most widely used today. It adjusted the Julian calendar to better align with the solar year (the time it takes Earth to orbit the sun).

Leap Year Rules:
Divisible by 4: A year is a leap year if it is divisible by 4.

Divisible by 100: However, if the year is also divisible by 100, it is not a leap year.

Divisible by 400: If the year is divisible by 400, then it is a leap year.

Now, let's apply these rules to the year 1900:

Divisible by 4:

1900 ÷ 4 = 475 (So far, it qualifies as a leap year).

Divisible by 100:

1900 ÷ 100 = 19 (Oops, 1900 fails this test, so it's not a leap year).

Divisible by 400:

1900 ÷ 400 = 4.75 (Since 1900 is not exactly divisible by 400, it confirms that 1900 is not a leap year).

         */
    }
