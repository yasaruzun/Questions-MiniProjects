package besUrunluManavProjesi;

import java.util.Scanner;



public class UrunListesi {



    public void urunListesi(){

        System.out.println("****JAVA MANAVINA HOSGELDİNİZ*****\n" +
                "ALMAK  ISTEDIGINIZ URUNU SECINIZ\n" +
                "1. MUZ\n" +
                "2. UZUM\n" +
                "3. SEFTALİ\n" +
                "4. KAVUN\n" +
                "5. KAPUZ\n" +
                "6. CIKIS");


        Scanner scan =new Scanner(System.in);

        try {
            AUserManav.secim =scan.nextInt();

            switch (AUserManav.secim) {
                case 1: {
                    KacKilo.kacKilo();
                    Urun1Fiyati.urun1Fiyat();

                }
                case 2: {
                    KacKilo.kacKilo();
                    Urun2Fiyati.urun2Fiyat();

                }
                case 3: {
                    KacKilo.kacKilo();
                    Urun3Fiyati.urun3Fiyat();
                }
                case 4: {
                    KacKilo.kacKilo();
                    Urun4Fiyati.urun4Fiyat();
                }
                case 5: {
                    KacKilo.kacKilo();
                    Urun5Fiyati.urun5Fiyati();

                }case 6: {
                    System.out.println("******HOSCAKALIN******\n" +
                            "FİŞİNİZ :");
                    GenelToplam.geneltoplam();

                    System.exit(0);

                } default:{
                    System.out.println("lutfen seçiminizi 6'ya kadar yapiniz");
                    urunListesi();
                }



            }
        } catch (Exception e) {

            System.out.println("lutfen geçerli bir deger giriniz");
            urunListesi();

        }

    }
}

