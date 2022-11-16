package miniATMProjesi;


import static miniATMProjesi.Menu.scan;

public class SifreDegistir {

    static Giris giris=new Giris();

    public static void sifreDegistir() {

        System.out.println("ESKI SIFRENIZI GIRINIZ: ");
        String kSifre = scan.next();
        if (kSifre.equals(AUserATM.sifre)) {
            System.out.println("YENI SIFRE GIRINIZ:");
            AUserATM.sifre = scan.next();
            scan.nextLine();
            Giris.giris();
        } else {
            System.out.println("DOGRU SIFRE GIRINIZ: ");
            sifreDegistir();
        }
    }
}
