import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== BANKA MENÜ ===");
        System.out.println("1. Bakiye Sorgula");
        System.out.println("2. Para Yatır");
        System.out.println("3. Para Çek");
        System.out.println("4. Havale Yap");
        System.out.println("5. Çıkış");
        System.out.print("Seçiminiz: ");

        int secim = sc.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Bakiyeniz: 12.450 TL");
                break;

            case 2:
                System.out.println("Para yatırma işlemi seçildi.");
                // burada para yatırma kodu yazılır
                break;

            case 3:
                System.out.println("Para çekme işlemi seçildi.");
                break;

            case 4:
                System.out.println("Havale işlemi seçildi.");
                break;

            case 5:
                System.out.println("Çıkış yapılıyor... Hoşça kalın!");
                break;

            default:
                System.out.println("Geçersiz seçim yaptınız!");
        }

        sc.close();
    }
}