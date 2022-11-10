import java.util.ArrayList;
import java.util.List;

public class ListedekiIstenmeyenElemanlariKaldirma {
    //Listede 15 veya 13 varsa, bu elemanları kaldırınız.
    //Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

    public static void main(String[] args) {


        List<Integer>sayiList = new ArrayList<>();

        sayiList.add(10);
        sayiList.add(31);
        sayiList.add(15);
        sayiList.add(13);
        sayiList.add(54);


        List<Integer>yeniList = new ArrayList<>();

        for (int i = 0; i <sayiList.size() ; i++) {

            if(sayiList.get(i)!=15 && sayiList.get(i)!=13){
                yeniList.add(sayiList.get(i));
            }

        }
        System.out.println(yeniList);
    }
}
