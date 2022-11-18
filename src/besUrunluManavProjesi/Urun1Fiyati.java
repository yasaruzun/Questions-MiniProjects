package besUrunluManavProjesi;

public class Urun1Fiyati {


    public static void urun1Fiyat() {

        AUserManav.toplamFiyat += AUserManav.kilo * AUserManav.birFkg;
        System.out.println("1.ürün toplam fiyatı : "+ AUserManav.toplamFiyat);
        GenelToplam.geneltoplam();
        BaskaUrunAlma.baskaUrunAlmak();

    }

}
