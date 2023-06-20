public class Main {
    public static void main(String[] args) {

        //For Dongusu
        for (int i = 1; i < 10; i++) {
            System.out.println("Sayi : " + i);
        }
        System.out.println("Dongu bitti!");
        System.out.println("================================");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Sayi : " + i);
        }
        System.out.println("Dongu bitti!");
        System.out.println("================================");
        //While Dongusu
        int i = 1;
        while (i < 10) {
            System.out.println("Sayi : " +i);
            i++;
        }
        System.out.println("Dongu bitti!");
        System.out.println("================================");

        //Do-While Dongusu

        int i2 = 1;

        do {
            System.out.println("Sayimiz : " + i2);
            i2++;
        }while (i2 < 5);
    }
}