package Chapters2Thru4;

import java.util.Scanner;
import java.text.NumberFormat;
public class FormattingOutput {
    public static void main(String[] args){
        final double TAX_RATE = .06; //6% tax

        int quantity;
        double subtotal, tax, totalCost, unitPrice;

        Scanner scan = new Scanner(System.in);

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();

        System.out.println("Enter the quantity: ");
        quantity = scan.nextInt();

        System.out.println("Enter the unit price: ");
        unitPrice = scan.nextDouble();

        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;

        // now print output with formatting

        System.out.println("Subtotal: " +fmt1.format(subtotal));
        System.out.println("Tax: " +fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
        System.out.println("Total: " +fmt1.format(totalCost));

    }
}
