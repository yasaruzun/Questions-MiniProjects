package kahveMakinasiProjesi;

import besUrunluManavProjesi.AUserManav;
import besUrunluManavProjesi.KacKilo;
import besUrunluManavProjesi.Urun1Fiyati;

import java.util.Scanner;

public class GirisHangiKahveyiIsterseniz {

    public static void hangiKahveyiIstersiniz() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hangi kahveyi istersiniz\n" +
                "1.Türk kahvesi\n" +
                "2.Filtre Kahve\n" +
                "3.Espresso\n" +
                "4.Çıkış");

        try {
            AUserKahve.secim = scan.nextInt();

            switch (AUserKahve.secim) {
                case 1: {
                    HangiBoyIsterseniz.hangiBoyIstersiniz();

                }
                case 2: {
                    HangiBoyIsterseniz.hangiBoyIstersiniz();

                }
                case 3: {
                    HangiBoyIsterseniz.hangiBoyIstersiniz();

                }
                case 4: {
                    Cikis.cikis();

                } default: {
                    System.out.println("lütfen 4 e kadar bir secim yapiniz");
                    hangiKahveyiIstersiniz();

                }

            }
        } catch (Exception e) {
            System.out.println("lütfen geçerli bir deger giriniz");
            hangiKahveyiIstersiniz();
        }
    }
}