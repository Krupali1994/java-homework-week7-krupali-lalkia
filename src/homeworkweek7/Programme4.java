package homeworkweek7;

import java.util.Scanner;

/**
 * find a days in a month by considering leap year or not.
 */
public class Programme4 {

    public static void isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Entered year is a Leap Year");
            } else {
                System.out.println("Entered year is NOT a Leap Year");
            }
        } else {
            System.out.println("False");
        }
    }

    public static void getDaysInMonth(int month, int year) {
        int days;
        if (year < 1 || year > 9999) {
            System.out.println("-1");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            switch (month) {
                case 2:
                    System.out.println("29 Days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days");
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 Days");
                    break;
                default:
                    System.out.println("-1");
                    break;
            }
        } else {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days");
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 Days");
                    break;

                case 2:
                    System.out.println("28 Days");
                    break;
                default:
                    System.out.println("-1");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int a = scanner.nextInt();
        isLeapYear(a);
        System.out.println("Enter Month: ");
        int b = scanner.nextInt();
        getDaysInMonth(b, a);
        scanner.close();

    }
}






