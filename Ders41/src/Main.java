import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");

        MyList<String> sehirler2 = new MyList<String>();
        sehirler.add("Ankara");

        MyList<Customer> customerMyList = new MyList<Customer>();
        customerMyList.add(new Customer());
    }
}