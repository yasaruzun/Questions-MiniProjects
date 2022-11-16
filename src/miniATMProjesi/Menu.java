package miniATMProjesi;

import java.util.Scanner;

public class Menu {

    static BakiyeSorgulama bsorgula = new BakiyeSorgulama();
    static ParaYatirma pyatirma = new ParaYatirma();
    static ParaCekme paraCekme = new ParaCekme();

    static IbanKontrol ibanK = new IbanKontrol();

    static ParaGonderme paGonder = new ParaGonderme();


    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("******JAVABANKA HOSGELDİNİZ*****\n" +
                "YAPMAK ISTEDIGINIZ ISLEMİ SECINIZ\n" +
                "1. BAKIYE SORGULAMA\n" +
                "2. PARA YATIRMA\n" +
                "3. PARA CEKME\n" +
                "4. PARA GONDERME\n" +
                "5. SIFRE DEGISTIRME\n" +
                "6. CIKIS");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                bsorgula.bakiyeSorgula();

            }
            case 2: {
                System.out.print("YATIRILACAK MIKTARI GIRINIZ:");
                double miktar = scan.nextDouble();
                pyatirma.paraYatirma(miktar);

            }
            case 3: {
                System.out.println("CEKILECEK MIKTARI GIRINIZ:");
                double miktar = scan.nextDouble();
                paraCekme.paraCekme(miktar);
            }
            case 4: {
                System.out.println("IBAN GIRINIZ: ");
                String iban = scan.nextLine();
                scan.nextLine();
                System.out.println("GONDERILECEK MIKTARI GIRINIZ:");
                double miktar = scan.nextDouble();

                paGonder.paraGonderme(ibanK.ibanKontrol(iban), miktar);

            }
            case 5: {
                SifreDegistir.sifreDegistir();

            }
            case 6: {
                System.out.println("******HOSCAKALIN******");
                System.exit(0);
            }

        }
    }
}