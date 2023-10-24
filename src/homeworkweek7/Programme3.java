package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math,
 * Science and  English marks (marks is between 0 to 100 and if it is out of
 * range print error message “Invalid  Input, Marks should between 0 to 100”)
 * and find out total, percentage and result. If he is pass or fail on basis of
 * percentage (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A,
 * %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Programme3 {

    //Object declaration
    static String name;
    static String result;
    static String Grade;
    static int RollNo;
    static int Maths;
    static int Science;
    static int English;
    static int Total;
    static float Percentage;

//Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        name = scanner.nextLine();
        System.out.println("Enter Roll Number: ");
        RollNo = scanner.nextInt();
        System.out.println("Enter given subject's Marks: ");
        result = Maths >= 35 ? "Pass" : "Fail";
        result = Science >= 35 ? "Pass" : "Fail";
        result = English >= 36 ? "Pass" : "Fail";

        System.out.println("Maths :");
        Maths = scanner.nextInt();
        if (Maths > 100) {
            System.out.println("Invalid Marks");
            System.out.println("Please Enter Valid Marks. Marks has to be in between 0 to 100");
            Maths = scanner.nextInt();
        }

        System.out.println("Science");
        Science = scanner.nextInt();
        if (Science > 100) {
            System.out.println("Invalid Marks");
            System.out.println("Please Enter Valid Marks. Marks has to be in between o to 100");
            Science = scanner.nextInt();
        }

        System.out.println("English");
        English = scanner.nextInt();
        if (English > 100) {
            System.out.println("Invalid Marks");
            System.out.println("Please Enter Valid Marks. Marks has to be in between o to 100");
            English = scanner.nextInt();
        }

        Total = (Maths + Science + English);
        System.out.println("Total Marks: " + Total);

        Percentage = Total / 3;
        System.out.println("Percentage is: " + Percentage + "%");

        if (Percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        result = Percentage >= 35 ? "Pass" : "Fail";
        if (Percentage > 80) {
            Grade = "A+";
        } else if (Percentage >= 60 && Percentage <= 80) {
            Grade = "A";
        } else if (Percentage >= 50 && Percentage <= 60) {
            Grade = "B";
        } else if (Percentage > 35 && Percentage <= 50) {
            Grade = "C";
        } else {
            Grade = "D";
        }
        System.out.println("Grade =" + Grade);
        printingMarksheet();
        scanner.close();

    }

//Method for printing mark sheet
    public static void printingMarksheet() {

        System.out.println("|___________________________________________|");
        System.out.println("||");
        System.out.println("|Mark Sheet|");
        System.out.println("|___________________________________________|");
        System.out.println("| Name:" + name + "|");
        System.out.println("| Roll No:" + RollNo + "|");
        System.out.println("|___________________________________________|");
        System.out.println("| Subjects:Marks|");
        System.out.println("|___________________________________________|");
        System.out.println("| Maths:" + Maths + "|");
        System.out.println("| Science:" + Science + "|");
        System.out.println("| English:" + English + "|");
        System.out.println("|___________________________________________|");
        System.out.println("| Total:" + Total + "|");
        System.out.println("|___________________________________________|");
        System.out.println("| Percentage:" + Percentage + "|");
        System.out.println("| Result:" + result + "|");
        System.out.println("| Grade:" + Grade + "|");
        System.out.println("|___________________________________________|");

    }
}
