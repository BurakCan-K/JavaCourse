public class Main {
    public static void main(String[] args) {

        // 1. Yöntem: Tanımlama + Değer Atama
        int[] sayilar = new int[5];           // 5 elemanlı dizi

        sayilar[0] = 10;
        sayilar[1] = 20;
        sayilar[2] = 30;

// 2. Yöntem: Tanımlama + İlk Değer Verme (En çok kullanılan)
        String[] isimler = {"Ahmet", "Mehmet", "Ayşe", "Fatma"};

        double[] notlar = {85.5, 90.0, 67.5, 88.0};


        // 2 Boyutlu Dizi Tanımlama
        int[][] matris = new int[3][4];   // 3 satır, 4 sütun

// Değer atama
        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[1][2] = 5;

// Tanımlama + Değer atama
        int[][] tablo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < tablo.length; i++) {           // satırlar
            for (int j = 0; j < tablo[i].length; j++) {    // sütunlar
                System.out.print(tablo[i][j] + " ");
            }
            System.out.println();
        }


    }
}