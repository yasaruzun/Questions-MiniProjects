package farkliKonulardaSoruCozumu2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q32 {

    public static void main(String[] args) {
        //Soru : Kullanicidan deger alarak iki String liste olusturun.
        // Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        // Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        // liste1 : …….
        // liste2 : …….
        // ortak elementler : …….

        System.out.println("once list1'i olusturalim");
        List<String> list1= kullanicidanAlarakListOlustur();

        System.out.println("simdi 2.Listeyi olusturalim");
        List<String> list2=kullanicidanAlarakListOlustur();


        System.out.println("Liste 1 :" +list1);
        System.out.println("Liste 2 :" +list2);
        list1.retainAll(list2);

        System.out.println("ortak elemanlar : "+list1);


    }
    public static List<String> kullanicidanAlarakListOlustur(){
        //Kullanicidan deger alarak iki String liste olusturup,main method'a dondurecek
        // Kullanici deger girmeyi birakmak icin 0’a basmalidir.

        List<String> isimListesi= new LinkedList<>();
        Scanner scan= new Scanner(System.in);
        String isim="";


        while (!isim.equalsIgnoreCase("0")){

            System.out.println("Listeye eklemek icin isim giriniz\n" +
                    "bitirmek icin 0'a basiniz");

            isim=scan.nextLine();
            if(!isim.equalsIgnoreCase("0")) {

                isimListesi.add(isim);
            }
        }
        return isimListesi;
    }
}
