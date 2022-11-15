package farkliKonulardaSoruCozumu1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirilenIsımleriListeOlarakYazdirmak {public static void main(String[] args) {
    //Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
    //liste olarak dondurecek bir method olusturun.

    Scanner scan=new Scanner(System.in);
    List<String> isimler=new ArrayList<>();
    String isim="";

    while(!isim.equalsIgnoreCase("q")) {

        System.out.println("lütfen bir isim giriniz" +
                "\n bitirmek icin q ya basınız");

        isim=scan.nextLine();

        isimler.add(isim);


    }

    isimler.remove("q");
    isimler.remove("Q");
    System.out.println(isimler);

}
}
