package miniProjeler;

import java.util.Scanner;

public class HesapMakinasiProjesi {
    static Scanner scan = new Scanner(System.in);
    static double sayi1 = 0;
    static double sayi2 = 0;
    static char islem;

    public static void main(String[] args) {

        giris();


    }

    private static void carpmaMethodu(double sayi1, double sayi2) {
        System.out.println("islem yapmak istediginiz sayilari giriniz");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println(sayi1 *= sayi2);
    }

    private static void bolmeMethodu(double sayi1, double sayi2) {
        System.out.println("islem yapmak istediginiz sayilari giriniz");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println(sayi1 /= sayi2);

    }

    private static void cikarmaMethodu(double sayi1, double sayi2) {
        System.out.println("islem yapmak istediginiz sayilari giriniz");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println(sayi1 -= sayi2);
    }

    private static void toplamaMethodu(double sayi1, double sayi2) {
        System.out.println("islem yapmak istediginiz sayilari giriniz");
        sayi1 = scan.nextDouble();
        sayi2 = scan.nextDouble();
        System.out.println(sayi1 += sayi2);
    }

    private static void giris() {
        System.out.println("" +
                "\n +" +
                "\n -" +
                "\n /" +
                "\n x" +
                "\nYAPMAK ISTEDIGINIZ ISLEMI SECINIZ" +
                "\n cikis yapmak icin 0'a basiniz");

        islem = scan.next().charAt(0);

        switch (islem) {
            case '+':
                toplamaMethodu(sayi1, sayi2);
                giris();
            case '-':
                cikarmaMethodu(sayi1, sayi2);
                giris();
            case '/':
                bolmeMethodu(sayi1, sayi2);
                giris();
            case 'x':
                carpmaMethodu(sayi1, sayi2);
                giris();
            case '0':
                System.exit(0);
        }

    }

}
