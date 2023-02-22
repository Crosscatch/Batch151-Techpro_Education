package day08stringmanipulations;
import java.util.Scanner;

public class C01_StringManipulations {

        public static void main(String[] args) {

         /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
               i)mail adresi "@gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
         */


            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen mail adresinizi  \n" +
                    " i)mail adresi \"@gmail\" icermeli\n" +
                    " ii)Space characteri mail'de olmamali\n" +
                    "iii)mail adresinde buyuk harf olmamali\n" +
                    " iv)En az bir tane noktalama isareti bulunmali \n seklinde veriniz");

            String mail= input.nextLine();


            //    i)mail adresi "@gmail" icermeli
            boolean first =mail.contains("@gmail");
            System.out.println("@gmail = " + first);

            // ii)Space characteri mail'de olmamali
            boolean second = !mail.contains(" ");
            System.out.println("space = " + second);

            //iii)mail adresinde buyuk harf olmamali
            /*boolean third = !mail.contains("[^A-Z]");
            System.out.println("third = " + third);

            contains methodu Regex karakterlerle dogru bir sekilde calismaz.
            Bu nedenle replaceAll ya da replace ile silme yapip  geriye kalanlarin length()'ine bakilir
            boolean thirth = mail.replaceAll("[^A-Z]","").length()==0;
            System.out.println("buyukharf = " + thirth);
            */

           boolean third = mail.replaceAll("[a-z0-9]" ,"").
                   replaceAll("[\\p{Punct}]","").
                   replace("","").length()==0;
            System.out.println("Buyuk harf olmamali = " + third);



            //iv)En az bir tane noktalama isareti bulunmali



        }//main
    }//class

