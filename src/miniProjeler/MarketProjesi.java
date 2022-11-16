package miniProjeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketProjesi {

    public static void main(String[] args) {


        /*
          Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
          yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
          method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
          gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
          kazandığını gösteren bir method yazınız.

          1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)

          2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
          (gunlukKazanclar)

           3. Adım : While döngüsü ile kullanıcıdan 7 günlük
          kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.

          4. Adım :getOrtalamaKazanc() adlı method ile ortalama kazancı alın.

          5. Adım :getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
          tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
          günleri return yap.

          6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
          method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
          ortalama kazançtan aşağıysa o günleri return yap.
         */
        Scanner scan = new Scanner(System.in);

        List<Double> gunlukKazanclar = new ArrayList<>();

        double kazanc;

        int index = 0;

        double kazancOrt = 0;

        double ortUstuGunler = 0;

        List<String> gunler = new ArrayList<>();

        gunler.add("pazartesi");
        gunler.add("sali");
        gunler.add("carsamba");
        gunler.add("persembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");

        do {
            System.out.println("gunluk kazancinizi giriniz");
            kazanc = scan.nextDouble();
            gunlukKazanclar.add(kazanc);
            index++;
        } while (index < gunler.size());

        List<Double> ortalamaUstuGunler = new ArrayList<>();

        List<Double> ortalamaAltiGunler = new ArrayList<>();

        kazancOrt = ortalamaKazanc(gunlukKazanclar);
        ortalamaUstuGunler = getOrtalamaninUstundeKazancGunleri(gunlukKazanclar,kazancOrt);
        ortalamaAltiGunler = getOrtalamaninAltiKazancGunleri(gunlukKazanclar,kazancOrt);
        System.out.println("gunluk kazanclar listi : " + gunlukKazanclar);
        System.out.println("ortalama üstü gunler : " + ortalamaUstuGunler);
        System.out.println("ortalama alti gunler : " + ortalamaAltiGunler);
        System.out.println("kazanc ortalamasi : "+kazancOrt);
        // aynı indexteki kazanc yüksek veya alcak listine eşit indexteki günü yazdıracaksın
    }
    public static double ortalamaKazanc(List<Double> list) {
        double kazancTop = 0;
        double ortalama = list.size();
        for (int i = 0; i < list.size(); i++) {
            kazancTop += list.get(i);
        }
        kazancTop /= ortalama;
        return kazancTop;
    }
    public static List<Double> getOrtalamaninUstundeKazancGunleri(List<Double> list ,double ortKazanc) {
        List<Double> ortUstGunler = new ArrayList<>();
        for (double i = 0.0; i < list.size(); i++) {
            if (list.get((int) i) > ortKazanc) {
                ortUstGunler.add(i);
            }
        }
        return ortUstGunler;
    }
    public static List<Double> getOrtalamaninAltiKazancGunleri(List<Double> list , double ortKazanc) {
        List<Double> ortAltiGunler = new ArrayList<>();
        for (double i = 0.0; i < list.size(); i++) {
            if (list.get((int) i) < ortKazanc) {
                ortAltiGunler.add(i);
            }
        }
        return ortAltiGunler;
    }

    }

