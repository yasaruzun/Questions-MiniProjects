package miniATMProjesi;

import java.util.Scanner;



public class Menu {

    static BakiyeSorgulama bsorgula = new BakiyeSorgulama();
    static ParaYatirma pyatirma = new ParaYatirma();
    static ParaCekme paraCekme = new ParaCekme();

    static IbanKontrol ibanK = new IbanKontrol();
    static IbanKontrol miktar = new IbanKontrol();

    static ParaGonderme paGonder = new ParaGonderme();
   static Scanner scan = new Scanner(System.in);


    public static void menu() {

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
                BakiyeSorgulama.bakiyeSorgula();

            }
            case 2: {

                ParaYatirma.paraYatirma();

            }
            case 3: {

                ParaCekme.paraCekme();
            }
            case 4: {
                Scanner scan =new Scanner(System.in);
                System.out.println("IBAN GIRINIZ: ");
                String iban = scan.nextLine();
                System.out.println("GONDERILECEK MIKTARI GIRINIZ:");
                double miktar = scan.nextDouble();

                ParaGonderme.paraGonderme(IbanKontrol.ibanKontrol(iban), miktar);


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