package farkliKonulardaSoruCozumu2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {


        //Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali


        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir şifre giriniz");

        String sifre=scan.nextLine();
        int bayrak=0;

        if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kcuuk harf olmalı");
            bayrak++;
        }
        if ((sifre.length()-1>='0' && sifre.length()-1<='9')){
            System.out.println("son karater rakam olmalı");
            bayrak++;

        }
        if(sifre.contains(" ")){

            System.out.println("sifre bosluk icermemli");
            bayrak++;

        }
        if(!(sifre.length()>=10)){
            System.out.println("sifre en az 10 karakter olmalı");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("sifre basariyla kaydedildi");
        }



    }
}
