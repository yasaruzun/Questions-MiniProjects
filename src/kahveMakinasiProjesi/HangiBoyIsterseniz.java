package kahveMakinasiProjesi;

import java.util.Scanner;

public class HangiBoyIsterseniz {

    static HangiBoyIsterseniz sut1=new HangiBoyIsterseniz();
    public static void hangiBoyIstersiniz() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi boyut isterseniz? (Buyuk boy - orta boy - kuçuk boy olarak giriniz.) :");
        AUserKahve.boyut= scan.nextLine();
        if (AUserKahve.boyut.equalsIgnoreCase("buyuk boy")){
            System.out.println(AUserKahve.boyut+ " kahveniz hazırlanıyor...");
           SutIsterMisin.sutIstermisiniz();

        } else if (AUserKahve.boyut.equalsIgnoreCase("orta boy")){
            System.out.println(AUserKahve.boyut+ " kahveniz hazırlanıyor...");
            SutIsterMisin.sutIstermisiniz();
        }else if (AUserKahve.boyut.equalsIgnoreCase("kucuk boy")){
            System.out.println(AUserKahve.boyut+ " kahveniz hazırlanıyor...");
            SutIsterMisin.sutIstermisiniz();
        }else {
            System.out.println("hatalı giriş");
            hangiBoyIstersiniz();
        }
    }
}
