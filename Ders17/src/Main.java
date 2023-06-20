public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 3, 5, 7, 9, 0};
        int aranacak = 5;

        boolean varMi = false;

        for (int sayi : sayilar) {

            if (sayi == aranacak) {
                varMi = true;
            }
        }

        if (varMi) {
            mesajVer(aranacak);
        } else {
            System.out.println("Aradiginiz sayi dizide yok");
        }
    }
    public static void mesajVer(int aranacak){
        System.out.println("Aradiginiz sayi dizide var! : " + aranacak);
    }
}