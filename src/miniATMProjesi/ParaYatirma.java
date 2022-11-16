package miniATMProjesi;

import static miniATMProjesi.Menu.scan;

public class ParaYatirma {
       static BakiyeSorgulama obje= new BakiyeSorgulama();
    public static void paraYatirma() {

        System.out.print("YATIRILACAK MIKTARI GIRINIZ:");
        double miktar = scan.nextDouble();

        AUserATM.bakiye += miktar;
        BakiyeSorgulama.bakiyeSorgula();
}
}