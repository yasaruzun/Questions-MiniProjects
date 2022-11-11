package miniProjeler;

import java.util.Scanner;

public class KahveMakinasiProjesi {
/*1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
 Örn:
Hangi Kahveyi İstersiniz?
1.Türk kahvesi
2.Filtre Kahve
3.Espresso
      String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
       (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                   todo 1. Koşul bölümü
      Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.
      (Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
      Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
      Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
      Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir,
       o konuyu daha görmediniz bu yüzden bastan baslatın.)
                                                                                   todo ---------------------------------
      Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)
      :    "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun
     String sut olusturun.
                                                                         todo 2.Koşul Bölümü
     eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
              -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın.
     Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

    eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                  todo ----------------------------------
      Sistem bize "�?eker ister misiniz ? (Evet veya hayır cevabını veriniz)
       : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
      String seker oluşturunuz.
                                                              todo 3.Koşul Bölümü
      todo if(){
      Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
      şeker sayısını giriniz.
      Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
      todo }
      todo else{
  Eğer String şeker  hayır 'a eşitse, sistem bize "�?eker eklenmiyor" cevabını versin.
          ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor.
           (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
 (büyük küçük harf duyarlılıgı olmamalı.
 yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
String boyut oluşturun...
                                                 todo 4.Koşul Bölümü
      eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
       (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
      Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
      Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)
      //todo  SONUÇ BÖLÜMÜ
                  Siparişlerimizi verdik. Son hali görmek istiyoruz.
                  konsola şunu yazdırın örnek :
      Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.
      orta boy için de String boyut ' u kullanın.) */

    static String secim;
    static String boyut;
    static String  seker;
    static String  sut;

    public static void main(String[] args) {

        int sayac = 0;

        do {
            sayac = 0;
            String secim=hangiKahveyiIstersiniz();

            if (secim.equalsIgnoreCase("turk kahvesi")){
                System.out.println("Türk kahvesi hazırlanıyor...");
            }

           else if (secim.equalsIgnoreCase("filtre kahve")){
                System.out.println("filtre kahvesi hazırlanıyor...");
            }

           else if (secim.equalsIgnoreCase("Espresso")){
                System.out.println("Espresso hazırlanıyor...");
            }
            else {
                System.out.println("Hatalı tuşlama yaptınız!");
                sayac++;

            }

        }while (sayac !=0);

        sutIstermisiniz();
        sekerIstermisin();
        hangiBoyIstersiniz();
        sonuc();

    }

    private static void sonuc() {
        System.out.println(secim+" "+ boyut+" hazırdır afiyet olsun");
    }

    private static void hangiBoyIstersiniz() {
        boyut ="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi boyutta olsun? (Buyuk boy - orta boy - kuçuk boy olarak giriniz.) :");
        boyut= scan.nextLine();
        if (boyut.equalsIgnoreCase("buyuk boy")){
            System.out.println(boyut+ " kahveniz hazırlanıyor...");
        } else if (boyut.equalsIgnoreCase("orta boy")){
            System.out.println(boyut+ " kahveniz hazırlanıyor...");
        }else if (boyut.equalsIgnoreCase("kucuk boy")){
            System.out.println(boyut+ " kahveniz hazırlanıyor...");
        }else {
            System.out.println("hatalı giriş");
        }
    }

    public static void sekerIstermisin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("seker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");

        seker = scan.nextLine();
        int sekerS=0;

        if (seker.equalsIgnoreCase("evet")){
            System.out.println("kaç şeker istiyorsunuz");
            sekerS= scan.nextInt();
            String bos= scan.nextLine();
            System.out.println(sekerS+ " seker ekleniyor...");

        }  else {
            System.out.println("seker eklenmiyor.");
        }

    }

    public static void sutIstermisiniz() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");

        sut = scan.nextLine();

        if (sut.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
        }else {
            System.out.println("Süt eklenmiyor.");
        }

    }

    public static String hangiKahveyiIstersiniz() {

        Scanner scan =new Scanner(System.in);

        System.out.println("Hangi kahveyi istersiniz\n" +
                "1.Türk kahvesi\n" +
                "2.Filtre Kahve\n" +
                "3.Espresso");
        secim = scan.nextLine();

        return secim;
    }
}




