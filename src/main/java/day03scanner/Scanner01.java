package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        // 1.Adim : Scanner Class'tan bir obje olustur

        Scanner input = new Scanner(System.in);

        //obje ismini input yaptik cunku bu object kullanicidan alinan data yi benim kodlarimin icine koyulacak.

        // 2.Adim : Kullaniciya ne istedginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz......");


        // 3.Adim : Uygun metodu kulllanarak kullanicinin verdigi datayi memory'e yerlestirir <--
        byte age = input.nextByte();
        System.out.println(age);
    }
}
