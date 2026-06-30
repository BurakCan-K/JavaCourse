public class Main {
    public static void main(String[] args) {
        try {
            Kullanici k1 = new Kullanici(
                    "ahmet@gmail.com",
                    "12345678",
                    "Ahmet",
                    "Yılmaz",
                    28
            );

            k1.setTelefon("0555 123 45 67");
            k1.bilgiGoster();
            System.out.println(k1);

            // Hatalı deneme:
            // Kullanici k2 = new Kullanici("yanlis", "123", "", "", -5);

        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}