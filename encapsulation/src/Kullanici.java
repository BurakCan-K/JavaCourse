public class Kullanici {

    // ==================== FIELDS (Encapsulation) ====================
    private final String email;           // final → bir kere atandıktan sonra değişmez
    private String sifre;
    private String ad;
    private String soyad;
    private int yas;
    private String telefon;

    // ==================== CONSTRUCTOR ====================
    public Kullanici(String email, String sifre, String ad, String soyad, int yas) {
        // Validation'lar burada yapılır
        this.email = validateEmail(email);
        this.sifre = validateSifre(sifre);
        this.ad = validateAd(ad);
        this.soyad = validateSoyad(soyad);
        this.yas = validateYas(yas);
    }

    // ==================== VALIDATION METODLARI ====================
    private String validateEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email boş olamaz!");
        }
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Geçersiz email formatı!");
        }
        return email.toLowerCase().trim();
    }

    private String validateSifre(String sifre) {
        if (sifre == null || sifre.length() < 8) {
            throw new IllegalArgumentException("Şifre en az 8 karakter olmalıdır!");
        }
        return sifre;
    }

    private String validateAd(String ad) {
        if (ad == null || ad.isBlank()) {
            throw new IllegalArgumentException("Ad boş olamaz!");
        }
        return ad.trim();
    }

    private String validateSoyad(String soyad) {
        if (soyad == null || soyad.isBlank()) {
            throw new IllegalArgumentException("Soyad boş olamaz!");
        }
        return soyad.trim();
    }

    private int validateYas(int yas) {
        if (yas < 0 || yas > 150) {
            throw new IllegalArgumentException("Yaş 0 ile 150 arasında olmalıdır!");
        }
        return yas;
    }

    // ==================== GETTER ve SETTER ====================
    public String getEmail() {
        return email;           // final olduğu için setter yok
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = validateAd(ad);
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = validateSoyad(soyad);
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = validateYas(yas);
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        if (telefon != null && !telefon.isBlank()) {
            this.telefon = telefon.trim();
        }
    }

    // Şifre için getter yok (güvenlik nedeniyle)
    public void setSifre(String sifre) {
        this.sifre = validateSifre(sifre);
    }

    // ==================== YARDIMCI METOD ====================
    public void bilgiGoster() {
        System.out.println("Kullanıcı Bilgileri:");
        System.out.println("Email   : " + email);
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Yaş     : " + yas);
        if (telefon != null) {
            System.out.println("Telefon : " + telefon);
        }
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "email='" + email + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}