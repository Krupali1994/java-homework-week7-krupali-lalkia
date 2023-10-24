package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007)
 * and find out if it is leap year or  not?
 */
public class Programme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Year");
        int abc = scanner.nextInt();
        if (abc % 100 == 0 && abc % 400 == 0 || abc % 100 != 0 && abc % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}