package homeworkweek7;

import java.util.Scanner;

/**
 * Same as program-8 by using switch statement.
 */
public class Programme9 {
    //Method to match city name
    public static void switchStatement(char letter) {
        switch (letter) {
            case 'A':
                System.out.println("Aberdeen");
                break;
            case 'B':
                System.out.println("Bangor");
                break;
            case 'C':
                System.out.println("Cardiff");
                break;
            case 'D':
                System.out.println("Dartford");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'F':
                System.out.println("Folkestone");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First Letter of the city: ");
        char firstLetter = scanner.next().charAt(0);
        switchStatement(firstLetter);
        scanner.close();
    }
}
