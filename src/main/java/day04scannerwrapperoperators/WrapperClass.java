package day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        //Primitive :       char   - boolean - byte - short   - int   - long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer - Long - Float - Double


        //Wrapper Class'lar non-primitive'dir. O yuzden memory'de cok yer kaplarlar.
        //O yuzden sart degilse wrapper class kullanmayi tercih etmeyiz.
        //boyle bir imkanin varligindan da haberdar olmaliyiz

        int a = 12; // primitive oldugu icin "a." yapinca methodlar cikmaz

        Integer b = 15; // Wrapper Class oldugu icin "b." yapinca methodlari kullanabilmemizi saglar.
        
        //Ornek1 : short data type inin minimum ve maximum degerlerini kod yazarak bulunuz.

        short maxValue = Short.MAX_VALUE;
        System.out.println(maxValue);

        short minValue = Short.MIN_VALUE;
        System.out.println(minValue);

        //ORnek2 : int data type inin minumum degeri ile byte data type inin maximum degerlerinin toplami kactir?
        int minInt = Integer.MIN_VALUE;
        byte maxByte= Byte.MAX_VALUE;
        System.out.println(minInt+maxByte);

        // Ornek3 : i) Primitive int'i wrapper Integer'a ceviriniz ( Autoboxing )
        int num = 13;
        Integer wrapperNum = num;
        //primitive bir kutu icinde baazi methodlarla birlikte bulunan degeri alarak
        //Wrapper yani method bulunmayan bir kutuya atama yaparsak bu isleme
        // "Autoboxing" denir.

        //ii) Wrapper Byte'i primitive byte'a ceviriniz. ( Unboxing )
        Byte k =33;
        byte primitiveK= k;
        //wrapper bir kutu icinde baazi methodlarla birlikte bulunan degeri alarak
        //primitive yani method bulunmayan bir kutuya atama yaparsak bu isleme
        // "Unboxing" denir.

        // Ornek4 : i) Primitive char'i Wrapper Character'e ceviriniz
        char one = 22;
        System.out.println(one);
        //Character wOne = one;

        //EX : int data type'inin maximum degeri ile ile byte data type'inin minimum degeri
        System.out.println(Integer.MAX_VALUE+Byte.MIN_VALUE);


    }
}
