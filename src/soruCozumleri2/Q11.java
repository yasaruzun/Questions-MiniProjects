package soruCozumleri2;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

       /* Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        istedigi birim metre veya santimetreye  cevirip yazdirin,
         yoksa "istediginiz birim sisteme kayitli degil" yazdirin. */


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen istediğiniz birimi yazınız");
        String birim=scan.nextLine();

        System.out.println("çevirmek istediginiz kilometreyi giriniz");
        int km=scan.nextInt();

        int sonuc=1;




        if(!(birim.substring(0,1).equalsIgnoreCase("m")||
                (birim.substring(0,1).equalsIgnoreCase("s")))){


            System.out.println("istediginiz birim sisteme kayitli degil");
        }   if (birim.substring(0,1).equalsIgnoreCase("m")) {
            sonuc=km*1000;
        }   else if(birim.substring(0,1).equalsIgnoreCase("s")) {
            sonuc=km*100000;


        }
        System.out.println(sonuc);






    }
}
