package farkliKonulardaSoruCozumu1;

import java.util.Scanner;

public class BolmeOperatoruKullanmadanBolme {
    static int bolum=0;
    public static void main(String[] args) {

        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir adet bölünen sayi giriniz :");
        int bolunenSayi=scan.nextInt();

        System.out.println("lütfen bolen bir sayi giriniz : ");
        int bolenSayi=scan.nextInt();

        bolmeIslemi(bolunenSayi,bolenSayi);


    }
    public static void bolmeIslemi (int bolunenSayi,int bolenSayi){



        while(bolunenSayi>=bolenSayi){

            bolunenSayi-=bolenSayi;

            bolum++;

        }
        System.out.println("bölüm sonucu :"+bolum);
    }
}
