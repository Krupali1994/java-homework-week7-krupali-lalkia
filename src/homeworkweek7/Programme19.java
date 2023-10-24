package homeworkweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        System.out.println(number.length);
        int sum = 0;
        int i;
        for (i = 0; i < number.length; i++) {
            sum = sum + number[i];
            sum = sum / number.length;
            System.out.println("Average value of Arrays element is: " + sum);

        }
    }
}
