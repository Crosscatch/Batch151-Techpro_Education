package day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki
        //basamagindaki rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("---------Lutfen 5 basamakli bir sayi giriniz-------");
        int number = input.nextInt();

        //son rakami al
        // % ==> modulus operator -> solunda bulunan sayinin, saginda bulunan sayiya bolumunden kalani verir
        //dolayisiyla %10, her zamn bize birler basamaginda bulunan sayiyi verir.
        //bir tamsayiyi bir tamsayayi bolerseniz java sonucu kesinlikle bir tamsayi yapar
        //java bu durumda yuvarlama yapmaz ondalikli kismi iptal eder
        //dolayisiyla bir tamsayiyi 10a bolersek birler basamagini silmis oluruz
        int lastDigit = number % 10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int lastSecondDigit= number%10;
        //sayi kucult
        number = number/10;

        //sondan 3. rakami al
        int lastThirdDigit = number%10;

        //sayi kucult
        number = number/10;

        //sondan 4. rakami al
        int lastFourthDigit = number%10;

        //sayi kucult
        number = number/10;

        //sondan 5. rakami al
        int lastFivethDigit = number%10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFivethDigit);




    }
}
