package kahveMakinasiProjesi;

import java.util.Scanner;

public class SutIsterMisin {
   static SutIsterMisin seker1=new SutIsterMisin();
    public static void sutIstermisiniz() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");

        AUserKahve.sut = scan.nextLine();

        if (AUserKahve.sut.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
            Seker.sekerIstermisin();

        }else {
            System.out.println("Süt eklenmiyor.");
            Seker.sekerIstermisin();
        }

    }
}
