public class Main {
    public static void main(String[] args) {
        // Stringler bir karakter dizisidir.
        // length : stringin uzunlugu
        // concat : string birlestirme
        // startsWith : eger o string ile baslar ise true baslamiyorsa false dondurur.
        // endsWith : eger o string  ile bitiyorsa true degilse false dondurur.
        // getChars : Stringi bir char arraye atar
        // indexOf : kacinci index oldugunu bulur. soldan baslar ilk buldugunu verir. String de verebilirsin
        // lastIndexOf : indexof ile ayni ama sagdan baslar. fakat indexini 0 dan itibaren hesaplar
        // replace : ilgili metindeki seyleri degistirebilir.
        // substring : bir metnin icerisinden parca almaktir
        // split : bir metni parcalar
        // toLower : butun metni kucuk harf yapar
        // toUpper : butun metni buyuk harf yapar
        // trim : eger metinin etrafinda bosluklar varsa onlari siler.

        char[] karakterler = new char[5];
        String message = "Bugun hava cok guzel!";

        System.out.println("Eleman sayisi : " + message.length());

        System.out.println("5. eleman : " + message.charAt(4));

        System.out.println(message.concat(" Yasasin!"));

        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("!"));

        message.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(message.indexOf('n'));
        System.out.println(message.lastIndexOf('u'));

        System.out.println(message.replace('h', 't'));

        System.out.println(message.substring(6));
        System.out.println(message.substring(0, 10));

        for (String kelime : message.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());



    }
}