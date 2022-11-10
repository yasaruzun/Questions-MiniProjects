import java.util.ArrayList;
import java.util.List;

public class ListIcındekiBaziElemanlarHaricDegerArttirma {


    //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
    //Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

    public static void main(String[] args) {

        List<Integer>sayiList = new ArrayList<>();

        sayiList.add(12);
        sayiList.add(31);
        sayiList.add(7);
        sayiList.add(13);
        sayiList.add(10);

        List<Integer>output = new ArrayList<>();

        for (int i = 0; i <sayiList.size() ; i++) {
            if (sayiList.get(i)!=7 && sayiList.get(i)!=10){
                output.add(sayiList.get(i)+2);
            } else  {
                output.add(sayiList.get(i));//[14, 33, 7, 15, 10]
            }
        }
        System.out.println(output);//[14, 33, 7, 15, 10]




    }
}
