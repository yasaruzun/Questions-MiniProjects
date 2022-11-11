package miniProjeler;

import java.util.Scanner;

public class besUrunluManavProjesi {

    /*
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
     * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
     * goster, istiyorsa tekrar urun sectir.
     *
     * Bu islemi alisverisi bitirmek isteyene
     * kadar tekrarla.
     *
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
     * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
     * goster.
     *
     */
   static Scanner scan=new Scanner(System.in);
   static int toplamKilo=0;

    static int toplamFiyat;
    static int secim;
    static int kilo;

    static int birFkg=10;
    static int ikiFkg=10;
    static int ucFkg=10;
    static int dortFkg=10;
    static int besFkg=10;
    static int genelToplam=0;

    public static void main(String[] args) {

        urunListesi();

    }

    public static void urunListesi() {

        System.out.println("****JAVA MANAVINA HOSGELDİNİZ*****\n" +
                "ALMAK  ISTEDIGINIZ URUNU SECINIZ\n" +
                "1. MUZ\n" +
                "2. UZUM\n" +
                "3. SEFTALİ\n" +
                "4. KAVUN\n" +
                "5. KAPUZ\n" +
                "6. CIKIS");

        secim=scan.nextInt();
        switch (secim) {
            case 1: {
               kacKilo();
               urun1Fiyat();

            }
            case 2: {
                kacKilo();
                urun2Fiyat();

            }
            case 3: {
                kacKilo();
                urun3Fiyat();
            }
            case 4: {
                kacKilo();
                urun4Fiyat();
            }
            case 5: {
                kacKilo();
                urun5Fiyati();

            }case 6: {
                System.out.println("******HOSCAKALIN******\n" +
                        "FİŞİNİZ :");
                geneltoplam();

                System.exit(0);

            }


    }
}
    private static void urun5Fiyati() {
        toplamFiyat+=kilo*besFkg;
        System.out.println("5.ürün fiyatı : "+toplamFiyat);
        geneltoplam();
        baskaUrunAlmak();
    }

    private static void urun4Fiyat() {
        toplamFiyat+=kilo*dortFkg;
        System.out.println("4.ürün fiyatı : "+toplamFiyat);
        geneltoplam();
        baskaUrunAlmak();
    }
    private static void urun3Fiyat() {
        toplamFiyat+=kilo*ucFkg;
        System.out.println("3.ürün fiyatı : "+toplamFiyat);
        geneltoplam();
        baskaUrunAlmak();
    }
    private static void urun2Fiyat() {
        toplamFiyat+=kilo*ikiFkg;
        System.out.println("2.ürün fiyatı : "+toplamFiyat);
        geneltoplam();
        baskaUrunAlmak();
    }
    private static void urun1Fiyat() {

        toplamFiyat+=kilo*birFkg;
        System.out.println("1.ürün toplam fiyatı : "+toplamFiyat);
        geneltoplam();
        baskaUrunAlmak();
    }
    private static void geneltoplam() {

        genelToplam+=toplamFiyat;
        System.out.println("odemeniz gereken tutar :" +genelToplam);

    }

    private static void kacKilo() {
        System.out.println("kac kilo almak istersneiz");
        kilo= scan.nextInt();

        toplamKilo+=kilo;

    }

    private static void baskaUrunAlmak() {
        System.out.println("baska bir ürün almak ister misiniz. evet/hayır");
        scan.nextLine();
        String yanit=scan.nextLine();

        if(yanit.equalsIgnoreCase("evet")){
            urunListesi();

        }else{

            System.out.println("toplam alınan kg :"+toplamKilo);
            bitir();
        }

    }
    private static void bitir() {
        System.out.println("******HOSCAKALIN******\n" +
                "FİŞİNİZ :");
        geneltoplam();

        System.exit(0);

    }
}