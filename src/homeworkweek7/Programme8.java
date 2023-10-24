package homeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if  any other alphabet should be invalid entry
 */
public class Programme8 {
    //Method to match the city name
    public static void ifStatement(char letter) {
        if (letter == 'A') {
            System.out.println("Aberdeen");
        } else if (letter == 'B') {
            System.out.println("Bangor");
        } else if (letter == 'C') {
            System.out.println("Cardiff");
        } else if (letter == 'D') {
            System.out.println("Dartford");
        } else if (letter == 'E') {
            System.out.println("Edinburgh");
        } else if (letter == 'F') {
            System.out.println("Folkestone");
        } else {
            System.out.println("Invalid Entry");
        }
    }

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First letter if the City: ");
        char firstLetter = scanner.next().charAt(0);
        ifStatement(firstLetter);
        scanner.close();
    }
}
