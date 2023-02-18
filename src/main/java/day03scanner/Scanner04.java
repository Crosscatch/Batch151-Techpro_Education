package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // kullanicidan iki sayi alan 4 islem yapan ve islemlerin sonuclarini ekrana yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen iki sayi seciniz ");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);


    }
}
