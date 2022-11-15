package farkliKonulardaSoruCozumu2;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

        //Ornegin : Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz : " );
        System.out.println("lütfen yasinizi giriniz: ");

        char cinsiyet = scan.nextLine().charAt(0);
        int yas = scan.nextInt();


        // erkek

        if (cinsiyet == 'E' || cinsiyet == 'e') {

            if (yas < 15) {
                System.out.println("iş hayatı sana göre degil kardes");
            } else if (yas < 65) {
                System.out.println("emekli olmak icin " + (65 - yas) + " yil daha calismalisin");
            } else {
                System.out.println("emekli olabilirsin");

            }

        } else if (cinsiyet == 'k' || cinsiyet == 'K') {

            if(yas<15){
                System.out.println("iş hayatı sana göre degil kardes");
            } else if (yas<60) {
                System.out.println("emekli olmak icin " + (60 - yas) + " yil daha calismalisin");

            }else {
                System.out.println("emekli olabilirsin");
            }


        }
    }
}
