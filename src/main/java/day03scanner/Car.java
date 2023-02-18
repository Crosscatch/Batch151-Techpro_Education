package day03scanner;

public class Car {

    //Variables olusturalim
    public String model = "Corolla";
    public int fiyat = 20000;

    // Method lar olusturalim
    // Note: "return type void "oldugunda method icinde "return" keyword unu kullanmayiz
    //eger bir method yeni bir data uretmiyorsa sadece belli bir islem yapiyorsa return type i VOID kullanirizz

    public void hareket (){
        System.out.println("Corolla hizli hareket eder ....");

    }

    public void dur (){
        System.out.println("Corolla guvenli sekilde durur ....");

    }
}
