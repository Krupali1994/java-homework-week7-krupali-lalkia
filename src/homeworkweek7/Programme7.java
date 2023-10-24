package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7 {

    //Object creation
    static String sellerName;
    static int salesID, salesAmount, salaryBasic;
    static float commission;

    //Method declared for sales details
    public static void salesDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales Id: ");
        salesID = scanner.nextInt();
        System.out.println("Enter Seller Name: ");
        sellerName = scanner.next();
        System.out.println("Enter Sales Amount: ");
        salesAmount = scanner.nextInt();
        System.out.println("Enter Salary Basic: ");
        salesAmount = scanner.nextInt();
        scanner.close();
    }

    //Method for calculating sales commission
    public static void salesCommission() {
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100f;
            System.out.println("Commission is: " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100f;
            System.out.println("Commission is: " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100f;
            System.out.println("Commission is: " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100f;
            System.out.println("Commission is: " + commission);
        } else {
            commission = (salesAmount * 2) / 100f;
        }
        salesDetails();
    }

    public static void main(String[] args) {
        salesCommission();

    }

}
