package homeworkweek7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be
 * divided by 3  and 5 separately.
 */
public class Programme11 {
    //Method to print number divided by 3
    public static void numberDividedBy3(int number) {
        if (number > 100) {
            return;
        }
        if (number % 3 == 0) {
            System.out.println(number + " ");
        }
        numberDividedBy3(number + 1);
    }

    public static void numberDividedBy5(int number) {
        if (number > 100) {
            return;

        }
        if (number % 5 == 0) {
            System.out.println(number + " ");
        }
        numberDividedBy5(number + 1);
    }

    //Main method
    public static void main(String[] args) {
        numberDividedBy3(1);
        numberDividedBy5(1);
    }
}

