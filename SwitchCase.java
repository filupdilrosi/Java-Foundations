package Chapters2Thru4;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int grade, category;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a numeric grade (0-100): ");
        grade = scan.nextInt();

        category = grade/10;
        System.out.print("That grade is: ");

        switch (category) {
            case 10:
                System.out.print("a perfect score.");
                break;
            case 9:
                System.out.print("well above average");
                break;
            case 8:
                System.out.print("above average.");
                break;
            case 7:
                System.out.print("average.");
                break;
            case 6:
                System.out.print("a failing agenda");
                break;
            default:
                System.out.print("not passing");
        }
    }
}
