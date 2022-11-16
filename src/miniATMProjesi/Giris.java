package miniATMProjesi;

import static miniATMProjesi.AtmProjesi.scan;

public class Giris {

    static Menu menu=new Menu();

    public static void giris() {
        System.out.print("KART NUMARASI GIRINIZ:");
        String kKartno = scan.nextLine();
        System.out.print("SIFRE GIRINIZ: ");
        String kSifre = scan.next();
        kKartno = kKartno.replaceAll("\\s", "");
        if (kSifre.equals(AUserATM.sifre) && kKartno.equals(AUserATM.kartNo)) {
            menu.menu();
        } else {
            System.out.println("YANLIS GIRIS YAPILDI");
            giris();
        }
    }
}
