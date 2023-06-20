public class Main {
    public static void main(String[] args) {

        int sayi1 = 30;
        int sayi2 = 25;
        int sayi3 = 32;

        int temp = sayi1;

        if (sayi2 > temp) {
            temp = sayi2;
        } if (sayi3 > temp) {
            temp = sayi3;
        }

        System.out.println("En buyuk sayi : " + temp);
    }
}