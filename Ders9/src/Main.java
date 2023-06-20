public class Main {
    public static void main(String[] args) {

        //double[] myList = new double[4];
        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double toplam = 0;
        double enBuyuk = myList[0];

        for (double sayi:myList) {
            System.out.println(sayi);
            if (sayi>enBuyuk){
                enBuyuk = sayi;
            }
            toplam += sayi;
        }
        System.out.println("Sayilarin toplami : " + toplam);
        System.out.println("Aralarindan en buyugu : " + enBuyuk);
    }
}