import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CiftKatliArrayIcArrayElemanlariniToplamaVeTekKatliArrayOlusturma {
    public static void main(String[] args) {

        //Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //output: [10, 3, 12, 10, 9]

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        List<Integer> sayilar=new ArrayList<>();



        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(Arrays.stream(arr[i]).sum());


        }

        System.out.println(sayilar);
        int [] tekArr=new int[sayilar.size()];

        for (int i = 0; i <sayilar.size() ; i++) {

            tekArr[i]=sayilar.get(i);

        }
        System.out.println(Arrays.toString(tekArr));
    }
}
