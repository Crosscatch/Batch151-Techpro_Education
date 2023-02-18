package day04scannerwrapperoperators;

public class MantikOperatorleri {

    public static void main(String[] args) {


    /*
    Javada islem yaptiran

    == Esittir
    != Esit Degildir
    <  Kucuktur
    >  Buyuktur
    =  Atama Operatoru

    1 < 4 < 5 ==> matematik uclu karsilastirma yapar Ancak JAva uclu kiyas yapamaz
    1<4 && 4<5 ==> Java bu sekilde ikili kiyas yapip MAntik Operatorleriyle birlestirme yapar

    && == ve hem operartoru mukemmeliyetci yapidadir. True dondurmesi icin her iki sartin da saglanmasi gerekir

    & ile && arasindaki fark
    (3<5 && 5<9 && 11<2 && 4<8 && 2<3 )  11<2 'yi gorur gormez Hemen False Dondurur , ardina bile bakmaz . Bu islemi hizlandirir.

    (3<5 & 5<9 & 11<2 & 4<8 & 2<3 )  11<2 'nin false oldugunu gorse bile digerlerine de bakar( Tum kodu tarar). Bu islemi yavaslatmasina neden olur


     || ==> veya operatoru Polyannaci yapidadir. En ufak bir pozitiflikte True dondurur.
     */

        System.out.println(5+2 ==8);

        boolean sonuc1 = 5>4 && 7<9 && 6+3 ==9 && 5+2 !=8;
        System.out.println("sonuc1 : " + sonuc1);

        int sayi1 = 15;
        System.out.println(10 < sayi1 || sayi1 <20);

        int sayi2 = 5;
        System.out.println( sayi2< 10 || sayi2>20);

        short a =1000;
        System.out.println(a<15000 || a > 28000 || a < -23);//true


    }
}
