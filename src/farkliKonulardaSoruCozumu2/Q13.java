package farkliKonulardaSoruCozumu2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q13 {
    static int sayac = 0;
    static double toplam = 0;

    public static void main(String[] args) {

        /*
            kullanicidan istedigi kadar sayi girmesini isteyip
            girilen sayilari toplayin
            kullanicinin islemi bitirmek icin Q'ya basmasini isteyin
            Q'ya basildiginda toplam kac sayi girdigini
            ve bu sayilarin toplaminin kac oldugunu yazdirin
         */


        girilenSayilariAdediVeToplami();
    }

    public static void girilenSayilariAdediVeToplami() {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz" +
                "\n bitirmek icin Q'ya basiniz");

        double sayi = 0;
        try {
            sayi = scan.nextDouble();
            sayac++;
            toplam += sayi;

            girilenSayilariAdediVeToplami();

        } catch (InputMismatchException e) {

            String str = scan.next();

            if (str.equalsIgnoreCase("q")) {
                System.out.println(sayac + " adet sayi girdiniz " + " ve bu sayilarin toplami " + toplam);
            } else {
                System.out.println("bitirmek icin q harfine basmaniz gerekmektedir.");
                girilenSayilariAdediVeToplami();
            }
        }


    }
}
