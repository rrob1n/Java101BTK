public class Main {
    public static void main(String[] args) {

        // icerideki condition saglanirsa true doner ve if blogu calisir.
        // eger saglanmazsa else blogu calisir
        // esittir icin "==" operatoru kullanilir.
        // else if eger if disinda baska bir kosul varsa kullanilir.
        // defensive programming : tum sartlara karsi program gelistirmek

        int sayi = 14;

        if (sayi < 20) {
            System.out.println("Sayi 20 den kucuktur");
        }else if (sayi == 20){
            System.out.println("Sayi 20 dir");
        }else {
            System.out.println("Sayi 20 den buyuktur");
        }

    }
}