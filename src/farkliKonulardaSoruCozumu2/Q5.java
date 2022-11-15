package farkliKonulardaSoruCozumu2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //Soru : Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
        //toplami yazdirin.

        Scanner scan=new Scanner(System.in);

        int sayi= 5;
        int toplam=0;

        while(toplam<=500){

            System.out.println("lütfen toplanmasını istediğiniz sayıyı giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;


        }

        System.out.println("sayiların Toplami :" +toplam);


    }
}
