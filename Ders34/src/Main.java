import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("Diyarbakir");
        sehirler.add("İzmir");
        sehirler.add("İstanbul");


        sehirler.remove(2); // veya direk "İstanbul yazabilirsin"
        Collections.sort(sehirler);
        for (String sehir:sehirler) {
            System.out.println(sehir);
        }

    }
}