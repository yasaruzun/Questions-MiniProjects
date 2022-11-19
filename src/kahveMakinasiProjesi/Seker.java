package kahveMakinasiProjesi;

import java.util.Scanner;

public class Seker {

   static Seker sonuc= new Seker();
    public static void sekerIstermisin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("seker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");

        AUserKahve.seker = scan.nextLine();
        int sekerS=0;

        if (AUserKahve.seker.equalsIgnoreCase("evet")){
            System.out.println("kaç şeker istiyorsunuz");
            sekerS= scan.nextInt();
            String bos= scan.nextLine();
            System.out.println(sekerS+ " seker ekleniyor...");
            Sonuc.sonuc();

        }  else {
            System.out.println("seker eklenmiyor.");
            Sonuc.sonuc();
        }

    }

}
