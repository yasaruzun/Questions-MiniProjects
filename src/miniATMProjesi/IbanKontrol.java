package miniATMProjesi;


import static miniATMProjesi.Menu.scan;

public class IbanKontrol {


    public static String ibanKontrol(String iban) {

        iban = iban.replaceAll("\\s", "");

        if (iban.contains("TR") && iban.length() == 26) {


        } else {
            System.out.println("GECERLI IBAN GIRINIZ: ");
            //String iban2 = scan.nextLine();
            //ibanKontrol(iban2);
            scan.nextLine();
            ibanKontrol(scan.nextLine());
        }
        return iban;
    }

}





