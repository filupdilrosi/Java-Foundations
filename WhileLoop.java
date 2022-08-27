package Chapters2Thru4;
import java.text.NumberFormat;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[]args){
        final int NUM_GAMES = 12;
        int won;
        double ratio;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of games won (0 to " +NUM_GAMES+"): ");
        won = scan.nextInt();

        while (won < 0 || won > NUM_GAMES)
        {
            System.out.print("Invalid input. Please reenter: ");
            won = scan.nextInt();
        }
        ratio = (double) won / NUM_GAMES;
        NumberFormat fmt = NumberFormat.getPercentInstance();
        System.out.println();
        System.out.println("Winnning percentage: " + fmt.format(ratio));




    }
}
