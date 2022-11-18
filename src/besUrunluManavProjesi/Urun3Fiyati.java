package besUrunluManavProjesi;

public class Urun3Fiyati {

  static  AUserManav manav9=new AUserManav();
    public static void urun3Fiyat() {
       manav9.toplamFiyat+=manav9.kilo*manav9.ucFkg;
        System.out.println("3.ürün fiyatı : "+manav9.toplamFiyat);
        GenelToplam.geneltoplam();
        BaskaUrunAlma.baskaUrunAlmak();
    }
}
