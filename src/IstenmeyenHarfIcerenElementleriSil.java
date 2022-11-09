import java.util.ArrayList;
import java.util.List;

public class IstenmeyenHarfIcerenElementleriSil {
    public static void main(String[] args) {

/*
        Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
kismini list olarak bize donduren bir method olusturun
         */

        String[] arr = {"sumeyra", "mehmet", "ekrem", "yilmaz", "ayse"};

        System.out.println(istenmeyenElementSilen(arr));

    }

    public static List<String> istenmeyenElementSilen(String[] arr) {

        List<String> isimler = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            isimler.add(arr[i]);

        }

        //  [sumeyra, mehmet, ekrem, yılmaz]

        String istenmeyenHarf = "a";

        List<String> YeniIsimler = new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)) {

                YeniIsimler.add(isimler.get(i));
            }

        }

        return YeniIsimler;


    }
}
