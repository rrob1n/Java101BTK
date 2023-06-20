public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";

        int total = topla(5,7);
        System.out.println(total);
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
    public static String sehirVer(){
        return "Ankara";
    }
}