package Chapters2Thru4;
import java.util.Scanner;

public class ForLoop {
    //prints multiples of a user specified number
    public static void main(String[] args){
        final int PER_LINE = 5;
        int value, limit, mult, count = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive value: ");
        value = scan.nextInt();

        System.out.println("Enter an upper limit: ");
        limit = scan.nextInt();
        System.out.println();
        System.out.println("The multiples of " + value + " between " + value + " and " + limit + " (inclusive) are:");

        for (mult = value; mult <= limit; mult+=value)
        {
            System.out.print(mult + "\t");
            //print a specific number of values per line of output

            count++;
            if (count % PER_LINE == 0)
                System.out.println();
        }




    }
}
