package farkliKonulardaSoruCozumu2;

import java.util.Scanner;

public class Q26 {

    /*
A şehrinden uçmak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
km birim fiyati : 0.10$
 12 yasindan kucukse toplam fiyat %50 indirim
 12 ve 24 yas arasindaysa 10%
 65 yasindan buyukse 30%
 Gidis donus alirsa 20%  bukosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program
 */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen gideceğiniz şehri yazınız. B/C/D");
        String sehir=scan.nextLine();

        System.out.println("tek yön mü? gidiş dönüş mü olacak? t/gd");
        String yon=scan.nextLine();


        System.out.println("lütfen yasinizi giriniz");
        int yas=scan.nextInt();
        double toplamFiyat=0;


        if(sehir.equalsIgnoreCase("b")&& yon.equalsIgnoreCase("t")){
            if(yas<12){
                toplamFiyat=(0.1*500)*0.8;
                System.out.println(toplamFiyat);
            } else if (yas<24) {
                toplamFiyat=(0.1*500)*0.9;
                System.out.println(toplamFiyat);
            } else if (yas>65) {
                toplamFiyat=(0.1*500)*0.7;
                System.out.println(toplamFiyat);
            }else{
                System.out.println("belirttihiniz yas araligina indirim tanımlanmamıstir");
            }
        } else if (sehir.equalsIgnoreCase("c")&& yon.equalsIgnoreCase("t")) {
            if(yas<12){
                toplamFiyat=(0.1*700)*0.5;
                System.out.println(toplamFiyat);
            } else if (yas<24) {
                toplamFiyat=(0.1*700)*0.9;
                System.out.println(toplamFiyat);
            } else if (yas>65) {
                toplamFiyat=(0.1*700)*0.7;
                System.out.println(toplamFiyat);
            }else {
                System.out.println("belirttihiniz yas araligina indirim tanımlanmamıstir");
            }

        } else if (sehir.equalsIgnoreCase("d")&& yon.equalsIgnoreCase("t")) {
            if(yas<12){
                toplamFiyat=(0.1*900)*0.8;
                System.out.println(toplamFiyat);
            } else if (yas<24) {
                toplamFiyat=(0.1*900)*0.8;
                System.out.println(toplamFiyat);
            } else if (yas>65) {
                toplamFiyat=(0.1*900)*0.8;
                System.out.println(toplamFiyat);
            }else {
                System.out.println("belirttihiniz yas araligina indirim tanımlanmamıstir");

            }

        }  else if (sehir.equalsIgnoreCase("b")&& yon.equalsIgnoreCase("gd")){
            if(yas<12){
                toplamFiyat=(0.1*500)*2*0.3;
                System.out.println(toplamFiyat);
            } else if (yas<24) {
                toplamFiyat=(0.1*500)*2*0.7;
                System.out.println(toplamFiyat);
            } else if (yas>65) {
                toplamFiyat=(0.1*500)*2*0.5;
                System.out.println(toplamFiyat);
            }else{
                System.out.println("belirttihiniz yas araligina indirim tanımlanmamıstir");
            }
        } else if (sehir.equalsIgnoreCase("c")&& yon.equalsIgnoreCase("t")) {
            if(yas<12){
                toplamFiyat=(0.1*700)*2*0.3;
                System.out.println(toplamFiyat);
            } else if (yas<24) {
                toplamFiyat=(0.1*700)*2*0.7;
                System.out.println(toplamFiyat);
            } else if (yas>65) {
                toplamFiyat=(0.1*700)*2*0.5;
                System.out.println(toplamFiyat);
            }else {
                System.out.println("belirttihiniz yas araligina indirim tanımlanmamıstir");
            }

        } else if (sehir.equalsIgnoreCase("d")&& yon.equalsIgnoreCase("t")) {
            if(yas<12){
                toplamFiyat=(0.1*900)*2*0.3;
                System.out.println(toplamFiyat);
            } else if (yas<24) {
                toplamFiyat=(0.1*900)*2*0.7;
                System.out.println(toplamFiyat);
            } else if (yas>65) {
                toplamFiyat=(0.1*900)*2*0.5;
                System.out.println(toplamFiyat);
            }else {
                System.out.println("belirttihiniz yas araligina indirim tanımlanmamıstir");
            }

        }  else{
            System.out.println("belirttiğiniz şehir uçuş ağımızda bulunmamaktadir");
        }





    }

}
