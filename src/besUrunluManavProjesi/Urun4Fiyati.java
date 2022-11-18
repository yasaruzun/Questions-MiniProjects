package besUrunluManavProjesi;

public class Urun4Fiyati {
        static AUserManav manav10=new AUserManav();
    public static void urun4Fiyat() {
        manav10.toplamFiyat+=manav10.kilo*manav10.dortFkg;
        System.out.println("4.ürün fiyatı : "+manav10.toplamFiyat);
        GenelToplam.geneltoplam();
        BaskaUrunAlma.baskaUrunAlmak();
    }
}
