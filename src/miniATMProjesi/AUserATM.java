package miniATMProjesi;

public class AUserATM {
   /*
  ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina
geri donsun.
Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
   */


    static String kartNo = "1234567890123456";
    static String sifre="1234";
    static double bakiye=20000;


    public AUserATM(String kartNo, String sifre, double bakiye) {

        this.kartNo=kartNo;
        this.sifre=sifre;
        this.bakiye =bakiye;


    }

    public AUserATM() {

    }
}
