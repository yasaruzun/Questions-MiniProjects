import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TamBolenPozitifTamSayiBulma {

    public static void main(String[] args) {

    //Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
    //tamsayilari bir liste olarak bize donduren bir method olusturun.

        int sy=10;
        System.out.println(tamBolenPozitifTamSayiBulma(sy));


    }

    public static List<Integer> tamBolenPozitifTamSayiBulma(int sayi) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi giriniz");
        sayi = scan.nextInt();

        List<Integer> tamsayiListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {

                tamsayiListesi.add(i);
            }


        }

        return tamsayiListesi;
    }
}
