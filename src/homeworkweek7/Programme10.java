package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their
 * symbol (+, -,  /, *) find addition, Subtraction, multiplication and
 * division according to their symbol  (using if else)
 */
public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter the Second Number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter the operation (+, -,* ,/ ): ");
        char operator = scanner.next().charAt(0);

        double answer;
        if (operator == '+') {
            answer = number1 + number2;
            System.out.println("Answer: " + answer);
        } else if (operator == '-') {
            answer = number1 - number2;
            System.out.println("Answer: " + answer);
        } else if (operator == '*') {
            answer = number1 * number2;
            System.out.println("Answer: " + answer);
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.println("Error: Division by 0 is not allowed");
            } else {
                answer = number1 / number2;
                System.out.println("Answer: " + answer);
            }
        } else {
            System.out.println("Invalid operator. Please enter +, -, * or /");
        }
        scanner.close();
    }
}

