package day03scanner;

public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturulur?
        //Class Ismi  +  Object Ismi   +   Atama Operatoru  +  "new"  + Constructor
        Car             myCar                  =             new        Car();

        //"new" keyword'u sifirdan yeni bir object olusturmak icin kullanilir.
        // Constructor Java'da nesneleri olusturmak icin kullanilan ozel bir methoddur.

        System.out.println( myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student studentData_Tom = new Student();

        System.out.println("studentData_Tom.name = " + studentData_Tom.name);
        System.out.println("studentData_Tom.grade = " + studentData_Tom.grade);
        System.out.println("studentData_Tom.address = " + studentData_Tom.address);
        studentData_Tom.feed();
        studentData_Tom.study();

    }
}