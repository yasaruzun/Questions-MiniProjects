package okulYonetimPlatformuProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciMenu implements IIslemler{

    List<Ogrenci> ogrenciList=new ArrayList<>();

    /*
     ============= İŞLEMLER =============
       1-EKLEME
       2-ARAMA
       3-LİSTELEME
       4-SİLME
       Q-ÇIKIŞ

   SEÇİMİNİZ:
     */


    void ogrMenu(){
        System.out.print("============= İŞLEMLER =============\n" +
                "1-EKLEME\n" +
                "2-ARAMA\n" +
                "3-LİSTELEME\n" +
                "4-SİLME\n" +
                "Q-ÇIKIŞ\n" +
                "SECİMİNİZ :" );

        Scanner scan=new Scanner(System.in);

        while (true){
            char secim= scan.next().toUpperCase().charAt(0);

            switch (secim){
                case '1':{
                    ekleme();
                }
                case '2':{
                    arama();
                }
                case '3':{
                    listeleme();
                }
                case '4':{
                    silme();
                }
                case 'Q':{
                    cikis();
                }
            }

        }

    }

    @Override
    public void ekleme() {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();
        System.out.println("Soyisim giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("Tc No giriniz");
        String tcNo=scan.next();
        System.out.println("yas giriniz");
        int yas= scan.nextInt();
        System.out.println("sınıf giriniz");
        String sinif=scan.next();
        System.out.println("ogrenci No giriniz");
        int ogrNo=scan.nextInt();

        Ogrenci ogrenci=new Ogrenci(isim,soyIsim,tcNo,yas,ogrNo,sinif);
        ogrenciList.add(ogrenci);
        ogrMenu();

    }

    @Override
    public void arama() {
        Scanner scan=new Scanner(System.in);
        if(!ogrenciList.isEmpty()){
            System.out.println("arama yapilacak Tc No giriniz");
            String aranacakTc=scan.next();

            for (Ogrenci each:ogrenciList
                 ) {
                if(each.getTcNo().equals(aranacakTc)){
                    System.out.println(each.toString());

                }
            }

            ogrMenu();

        }else {
            System.out.println("liste bostur");
            ogrMenu();
        }

    }

    @Override
    public void listeleme() {
        if(!ogrenciList.isEmpty()){
            for (Ogrenci each:ogrenciList
                 ) {
                System.out.println(each.toString());
            }

            ogrMenu();
        }else{
            System.out.println("liste bostur");
            ogrMenu();
        }

    }

    @Override
    public void silme() {
        Scanner scan=new Scanner(System.in);
        if(!ogrenciList.isEmpty()){
            System.out.println("silme yapilacak Tc No giriniz");
            String aranacakTc=scan.next();

            for (int i = 0; i <ogrenciList.size() ; i++) {

                if(aranacakTc.equals(ogrenciList.get(i).getTcNo())){
                    ogrenciList.remove(i);
                    ogrMenu();
                }

            }



        }else {
            System.out.println("liste bostur");
            ogrMenu();
        }

    }

    @Override
    public void cikis() {
        AnaMenu anaMenu= new AnaMenu();
        anaMenu.anaMenu();

    }
}
