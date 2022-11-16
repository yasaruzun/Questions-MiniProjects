package miniATMProjesi;


import static miniATMProjesi.Menu.scan;

public class ParaCekme {

    static BakiyeSorgulama baSorgulama=new BakiyeSorgulama();
    public static void paraCekme() {

        System.out.println("lütfen cekmek isteiginiz tutari giriniz");
        double miktar=scan.nextDouble();

        if (miktar <= AUserATM.bakiye) {
            AUserATM.bakiye -= miktar;
            BakiyeSorgulama.bakiyeSorgula();

        } else {
            System.out.println("GECERLI MIKTAR GIRINIZ");
            paraCekme();
        }
    }

}
