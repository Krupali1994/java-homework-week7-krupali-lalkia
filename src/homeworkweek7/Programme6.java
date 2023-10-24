package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {

    //Method to fid out odd or even number with if-else statement
    public void number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");

        }else{
            System.out.println(number + " is Odd");
        }
    }

    //Main method
    public static void main(String[] args) {
        Programme6 obj = new Programme6();
        obj.number();
    }

}
