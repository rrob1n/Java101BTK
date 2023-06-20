public class Main {
    public static void main(String[] args) {
        // Sayi asal sayi mi?

        int number = 13;
        int bolenSayisi = 0;

        for (int i = 1; i <= number ; i++) {
            if (number % i == 0) {
                bolenSayisi++;
            }
        }
        if (bolenSayisi == 2 && number != 1) {
            System.out.println("Sayi asaldir!");
        }else {
            System.out.println("Sayi asal degildir!");
        }


    }
}