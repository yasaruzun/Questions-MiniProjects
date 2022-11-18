package besUrunluManavProjesi;

public class Urun5Fiyati {
   static AUserManav manav11= new AUserManav();


    public static void urun5Fiyati() {
        manav11.toplamFiyat+=manav11.kilo*manav11.besFkg;
        System.out.println("5.ürün fiyatı : "+manav11.toplamFiyat);
        GenelToplam.geneltoplam();
        BaskaUrunAlma.baskaUrunAlmak();
    }
}
