package homeworkweek7;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(number).sum();
        System.out.println(sum);
    }
}
