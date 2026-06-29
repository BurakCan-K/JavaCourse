public class Main {
    public static void main(String[] args) {

    //String , string builder ,string buffer ,string builder

        //String
        String s1 = "Ahmet";
        s1=s1+" 21 ";
        System.out.println(s1);    //yeni bir nense oluştu4


        //String pool

        String b1="Veli";  //string pool da oluşturulur
        String b2="Veli";   //aynı nesneyi referans eder

        System.out.println(b1==b2);


        //String buffer multi thread

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A işi: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("   B işi: " + i);
            }
        });

        t1.start();   // A işi başlasın
        t2.start();   // B işi başlasın







    }
}