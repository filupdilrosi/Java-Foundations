package Chapters2Thru4;

import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random gen = new Random();
        int num1;
        float num2;
        num1 = gen.nextInt();
        System.out.println("num is " + num1);

        num1 = gen.nextInt(10);
        System.out.println("num is betwenn 0-9 " + num1);

        num1 = gen.nextInt(10)+6;
        System.out.println("num is betwenn 6-15 " + num1);

        num2 = gen.nextFloat()*6;
        System.out.println("float 0-5.999999 " + num2);


    }
}
