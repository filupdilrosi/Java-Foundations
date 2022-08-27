package Chapters2Thru4;
import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args){
        String str, answer = "y";
        int left, right;
        Scanner scan = new Scanner(System.in);

        while(answer.equalsIgnoreCase("y"))
        {
            System.out.println("Enter a potentila palindrome: ");
            str = scan.nextLine();

            left = 0;
            right = str.length() - 1;
            while (str.charAt(left) == str.charAt(right) && left < right)
            {
                left++;
                right--;
            }
            System.out.println();
            if (left<right)
                System.out.println("String is not a palindrome");
            else
                System.out.println("String is palindrome");
            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            answer = scan.nextLine();
        }

    }
}
