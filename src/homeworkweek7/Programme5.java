package homeworkweek7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print the salary slip
 */

//Declaring the objects
public class Programme5 {
    static int empID;
    static String empName;
    static float basicSalary, HRA, TA, DA, PF, grossSalary;

    //Method to calculate HRA, DA,TA,PF, grossSalary, basicSalary
    public static void calculations() {
        HRA = ((float) 10 / 100) * basicSalary;
        DA = ((float) 8 / 100) * basicSalary;
        TA = ((float) 9 / 100) * basicSalary;
        PF = ((float) 20 / 100) * basicSalary;
        grossSalary = basicSalary + HRA + TA + DA - PF;
    }

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        empName = scanner.next();
        System.out.println("Enter Employee ID: ");
        empID = scanner.nextInt();
        System.out.println("Enter Basic Salary");
        basicSalary = scanner.nextFloat();
        calculations();
        printing();
        scanner.close();
    }

    //Method to print the Salary Slip
    public static void printing() {

            System.out.println("______________________________________");
            System.out.println("|              SALARY SLIP            ");
            System.out.println("|____________________________________|");
            System.out.println("|Employee Id   :  " + empID + "          |");
            System.out.println("|Employee Name :  " + empName + "        |");
            System.out.println("|____________________________________|");
            System.out.println("|Basic Salary  :  " + basicSalary + "    |");
            System.out.println("|HRA 10%       :  " + HRA + "            |");
            System.out.println("|TA 8%         :  " + TA + "             |");
            System.out.println("|DA 9%         :  " + DA + "             |");
            System.out.println("|PF 20%        :  " + PF + "             |");
            System.out.println("|____________________________________|");
            System.out.println("|Gross Salary  :  " + grossSalary + "    |");
            System.out.println("|====================================|");
        }
}

