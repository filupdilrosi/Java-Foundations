package Chapters2Thru4;

import java.util.Random;
import java.util.Scanner;

public class IfElseGuessing {
    public static void main(String[] args){
        final int MAX = 10;
        int answer, guess;

        Scanner scan = new Scanner(System.in);
        Random gen = new Random();

        answer = gen.nextInt(MAX) + 1;

        System.out.println("I'm thinking of a number between 1 and " + MAX + ".Guess what it is: ");
        guess = scan.nextInt();

        if (guess == answer)
            System.out.println("You got it! Good Guess.");
        else {
            System.out.println("That is not correct.");
            System.out.println("The number was " + answer);
        }
    }
}
