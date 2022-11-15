package farkliKonulardaSoruCozumu2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        //kullanicidan bir tamsayi alin
        //ve sayinin karesini yazdiran
        //kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        //tekrar sayi isteyen bir method olusturun




        sayiAlKaresiniYazdir();



    }
    public static void sayiAlKaresiniYazdir(){

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz");


        int sayi= 0;

        try {
            sayi = scan.nextInt();


            System.out.print("girdiginiz sayinin karesi :");
            System.out.println(sayi*sayi);

        } catch (InputMismatchException e) {

            System.out.println("sana tamsayi degeri gir dedik :)");
            sayiAlKaresiniYazdir();


        }



    }
}
