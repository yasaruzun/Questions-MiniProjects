import java.util.ArrayList;
import java.util.List;

public class ListdekiIstenmeyenElemaniDegistirme {

    //Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
    //Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>();

        sayiList.add(12);
        sayiList.add(11);
        sayiList.add(15);
        sayiList.add(34);
        sayiList.add(43);

        for (int i = 0; i <sayiList.size() ; i++) {

            if(sayiList.get(i)==15){

                sayiList.set(i,51);
            }

        }
        System.out.println(sayiList);//[12, 11, 51, 34, 43]
    }
}
