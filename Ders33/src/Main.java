import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(0));
        sayilar.set(0,100);

        System.out.println(sayilar.get(0));
        sayilar.remove(1);
        System.out.println(sayilar);
        //sayilar.clear();

        for (Object sayi:sayilar) {
            System.out.println(sayi);
        }
    }
}