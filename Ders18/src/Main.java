public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";

        int total = topla(5, 7);
        int total2 = topla2(2,3,5);
        System.out.println(total);
        System.out.println(total2);
    }

    public static void ekle() {
        System.out.println("Eklendi!");
    }

    public static void sil() {
        System.out.println("Silindi!");
    }

    public static void guncelle() {
        System.out.println("Guncellendi");
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static String sehirVer() {
        return "Ankara";
    }

    // Variable Arguments
    public static int topla2(int... sayilar) {
        int toplam = 0;

        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}