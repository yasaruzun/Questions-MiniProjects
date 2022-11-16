package miniATMProjesi;

import static miniATMProjesi.AtmProjesi.scan;

public class ParaCekme {

    static BakiyeSorgulama baSorgulama=new BakiyeSorgulama();
    public static void paraCekme(double miktar) {
        if (miktar <= AUserATM.bakiye) {
            AUserATM.bakiye -= miktar;
            baSorgulama.bakiyeSorgula();

        } else {
            System.out.println("GECERLI MIKTAR GIRINIZ");
            paraCekme(scan.nextDouble());
        }
    }

}
