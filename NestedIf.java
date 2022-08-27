package Chapters2Thru4;
import java.util.Scanner;
//demonstrates nest if
//reads three integers from user and determines the smallest
public class NestedIf {
    public static void main(String[] args) {
        int num1, num2, num3, min = 0;
        Scanner scan = new Scanner(System.in);

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 < num2) {
            if (num1 < num3)
                min = num1;
            else
                min = num3;
        }

        else {
            if (num2 < num3)
            min = num2;
            else
                min=num3;
        }
        System.out.println("Min value: " + min);





    }
}
