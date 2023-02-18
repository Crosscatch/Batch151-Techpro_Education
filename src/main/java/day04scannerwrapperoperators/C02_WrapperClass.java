package day04scannerwrapperoperators;

public class C02_WrapperClass {
    public static void main(String[] args) {
        //****** PRimitive Data Type'larini Wrapper Classlara NAsil Ceviririz ************
        float primitiveFloat = 12.33f;
        Float wrappeerFloat = primitiveFloat; // buna Autoboxing denir == Otomatik
        // Kutulama Java bunu otomatik olarak yapar. Kucuk kutuyu buyuk kutuya yerlestirir.

        //*********** Wrapper Classlari Primitive Data Type'larina NAsil Ceviririz ********

        Character wrapperChar ='a';
        char primitiveChar = wrapperChar; // Unboxing kucuk kutuyu buyuk kutudan cikarma
        // Java bunu da otomatik yapar.

        // Ex verilen iki String datanin toplamini veren kodu yaziniz

        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1+str2);//12345678
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));// 13023
        //Integer.valueOf() ==String bir datayi Integer'a donusturur.
        /* Iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
        Buna Concatination denir
        JAva matematik bilir islem onceligine gore calisir
        i) Uslu Sayilar
        ii) Parantez ici
        iii) Carpma/ Bolme
        iv) Toplama/ cikarma
         */


        String harf = "A";
        int sayi= 7;
        //harf + sayi ==> A7  ==> Bu artik String bir data haline gelir
        /*
        8+3+"K ==> String data olur
         */

        String a="K";
        int b=3,c=5,d=2;
        System.out.println(a+b*c/d);


































    }
}
