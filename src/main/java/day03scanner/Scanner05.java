package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        // Kullanicidan bir dikdortgenin 1 kisa kenar ve 1 uzun kenarini  alip alanini ve cevre uzunlugunu bulunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Uzun Kenari giriniz");
        double uzunKenar = input.nextDouble();
        System.out.println("Kisa Kenari giriniz");
        double kisaKenar = input.nextDouble();

        System.out.println("Cevre Uzunlugu: "+ (uzunKenar+kisaKenar)*2);
        System.out.println("Alan: " + uzunKenar*kisaKenar);
    }
}
