package homeworkweek7;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 and 7, and it prints
 * The Days  name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using
 * switch.  NOTE: if number is out of selection Print message “Week contains
 * 1 to 7 days”
 */
public class Programme13 {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Number: ");
        int day=scanner.nextInt();
        String dayName;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7 :
            default:
                System.out.println("Invalid Input: Week contains 1 to 7 days");

        }
    }

}
