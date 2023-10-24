package homeworkweek7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {

        //Numeric Array
        int[] numericArray = {5, 9, 6, 7, 2, 1, 8};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        //String Array
        String[] stringArray = {"India", "England", "Germany", "France", "China"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
