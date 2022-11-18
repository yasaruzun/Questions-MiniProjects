package besUrunluManavProjesi;

public class GenelToplam {

    public static void geneltoplam() {

        AUserManav.genelToplam += AUserManav.toplamFiyat;
        System.out.println("odemeniz gereken tutar :" + AUserManav.genelToplam);
        AUserManav.toplamFiyat=0;
}
}