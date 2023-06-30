//built-in

import Matematik.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayi = scanner.nextInt();
        System.out.print("Adiniz : ");
        String name = scanner.next();


        System.out.println("Merhaba " + name + " " + sayi);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(1,3);
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}