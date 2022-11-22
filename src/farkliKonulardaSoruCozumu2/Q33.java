package farkliKonulardaSoruCozumu2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q33 {

    static List<Double> notListesi =new LinkedList<>();

    public static void main(String[] args) {
        //Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi bittiginde Q’ya basmalidir.
        // Not grime islemi bittikten sonra asagidaki sekilde output hazirlayin
        // not ortalamasi : …..
        // ogrenci sayisi : …..
        // ortalama altindaki ogrenci sayisi : ….
        // ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….

        System.out.println("oncelikle ogrenci not listesini olusturalim");
        notListesineDegerEkle();

        double notToplam=0;
        double notOrt;
        int ortalamaAltindakiOgrenciSayisi=0;
        int ortalama10PuanAltUstOgrenciSayisi=0;


        for (Double eachNot:notListesi
        ) {
            notToplam+=eachNot;
        }

        notOrt=notToplam+notListesi.size();

        for (Double eachNot:notListesi
        ) {
            if(eachNot<notOrt){
                ortalamaAltindakiOgrenciSayisi+=1;
            }
            if(eachNot>=notOrt-10 && eachNot<=notOrt+10){
                ortalama10PuanAltUstOgrenciSayisi+=1;
            }
        }

        System.out.println("not ortalamasi :" +notOrt+"" +
                "\nogrenci sayisi :"+ notListesi.size()+
                "\nortalama altindaki ogrenci sayisi : "+ortalamaAltindakiOgrenciSayisi+
                "\n ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi :"+ortalama10PuanAltUstOgrenciSayisi);


    }
    public static void notListesineDegerEkle(){


        double not;
        boolean loopDevam=true;

        while (loopDevam){
            Scanner scan= new Scanner(System.in);

            System.out.println("lütfen ogrenci notlarini giriniz\n" +
                    "bitirmek icin Q'ya basiniz");
            try {


                not=scan.nextDouble();

                notListesi.add(not);


            } catch (Exception e) {

                String girilenDeger=scan.nextLine();

                if(girilenDeger.equalsIgnoreCase("q")){
                    break;
                }else{
                    System.out.println("not icin sayilsal degerler girmelisiniz");
                }


            }





        }



    }
}
