public class Main {
    public static void main(String[] args) {
        // Mukemmel sayi : bolenlerinin toplami kendisi olan sayiya denir. (kendisi disinda)

        int sayi = 28;
        int bolenleriToplami = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                bolenleriToplami += i;
            }
        }
        if (bolenleriToplami == sayi) {
            System.out.println("Girdiginiz sayi mukemmel sayidir.");
        } else {
            System.out.println("Girdiginiz sayi bir mukemmel sayi degildir.");
        }
    }
}