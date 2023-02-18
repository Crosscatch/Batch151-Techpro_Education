package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    // Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz <--
    public static void main(String[] args) {

        // 1.Adim : Scanner class tan bir object olustur
        Scanner input = new Scanner(System.in);
        System.out.println("--------Lutfen isminizi yaziniz----------");
        String firstName = input.next();
        System.out.println("--------Lutfen soyisminizi giriniz-------");
        String lastName =input.next();
        System.out.println(firstName +" " + lastName );
    }
}
