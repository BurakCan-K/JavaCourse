import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double[] notlar = {15,20,25,30,35,40,45};
        double toplam=0;

        System.out.println(notlar.length);

        for(int i=0;i<notlar.length;i++){
            toplam+=notlar[i];
        }

        System.out.println("Sınıf Ortalaması="+toplam/notlar.length);




        Scanner input = new Scanner(System.in);
        String sifre="java123";
        String giris;

        while(true){
            System.out.println("Şifrenizi giriniz:");
            giris=input.nextLine();

            if(giris.equalsIgnoreCase(sifre)){
                System.out.println("Giriş Başarılı");
                break;
            }
            else{
                System.out.println("Hatalı şifre ! Tekrar deneyin!");
            }
        }


        int secim;
        do {
            System.out.println("\n ==== ANA MENÜ ====:");
            System.out.println("1. Para Transferi");
            System.out.println("2. Fatura Öde");
            System.out.println("3. Bakiye Görüntüle");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            secim=input.nextInt();

            switch(secim){
                case 1: System.out.println("Transfer ekranı..."); break;
                case 2: System.out.println("Fatura ödeme ekranı..."); break;
                case 3: System.out.println("Bakiyeniz: 8450 TL"); break;
                case 4: System.out.println("Çıkış yapılıyor..."); break;
                default: System.out.println("Geçersiz seçim!");
            }
        }while (secim!=4);










    }
}