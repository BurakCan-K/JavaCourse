public class Main {
    public static void main(String[] args) {

        int classSize=12;
        String mesaj ="mesaj";;

        System.out.println(classSize + " " + mesaj);

        System.out.println("Primitive types"+"/n"+"Wrapper Classes : Integer Double String  Boolean");

        int not=50;

        boolean x =true;
        boolean y =not>=50;

        char z ='a';

        byte b =100;

        short s =32767;

        int i =1234555555;

        long l = 874546465;
        l=1546545654;

        float f =123.4522545555541556f;

        double d =123.456;


        int sayi = 5;           // primitive (basit tip)

        // Autoboxing burada oluyor:
        Integer wrapperSayi = sayi;
        // Java otomatik olarak: new Integer(5) yapıyor

    }
}