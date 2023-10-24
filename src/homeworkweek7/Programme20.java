package homeworkweek7;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        int[] numbers = {7, 13, 8, 4, 5};
        int targetValue = 3;
        boolean found = false;
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The Array contains the value " + targetValue);
        } else {
            System.out.println("The Array does not contain the value " + targetValue);

        }
    }
}
