package miniATMProjesi;

public class ParaYatirma {
       static BakiyeSorgulama obje= new BakiyeSorgulama();
    public static void paraYatirma(double miktar) {


        AUserATM.bakiye += miktar;
        obje.bakiyeSorgula();
}
}