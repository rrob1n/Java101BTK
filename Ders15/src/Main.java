public class Main {
    public static void main(String[] args) {

        // Arkadas Sayilar : Kendileri disinda pozitif bolenleri toplami digerine esit olan sayilardir.
        // 220-284

        int sayi1 = 220;
        int sayi2 = 284;

        int bolenToplam1 = 0;
        int bolenToplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                bolenToplam1 += i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                bolenToplam2 += i;
            }
        }

        if (bolenToplam1 == sayi2 && bolenToplam2 == sayi1){
            System.out.println("Bu sayilar arkadastir.");
        }else {
            System.out.println("Arkadas degildir!");
        }
    }
}