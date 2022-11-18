package besUrunluManavProjesi;

import java.util.Scanner;



public class BaskaUrunAlma {

    static UrunListesi urunlistesi1=new UrunListesi();
    static AUserManav manav6=new AUserManav();


    public static void baskaUrunAlmak() {
        Scanner scan=new Scanner(System.in);
        System.out.println("baska bir ürün almak ister misiniz. evet/hayır");

        String yanit=scan.nextLine();

        if(yanit.equalsIgnoreCase("evet")){
           urunlistesi1.urunListesi();

        }else{

            System.out.println("toplam alınan kg :"+ AUserManav.toplamKilo);
            Bitir.bitir();
        }

    }

}
