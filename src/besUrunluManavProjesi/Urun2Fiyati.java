package besUrunluManavProjesi;

public class Urun2Fiyati {



    public static void urun2Fiyat() {
        AUserManav.toplamFiyat += AUserManav.kilo * AUserManav.ikiFkg;
        System.out.println("2.ürün fiyatı : "+ AUserManav.toplamFiyat);
        GenelToplam.geneltoplam();
        BaskaUrunAlma.baskaUrunAlmak();
    }


}
