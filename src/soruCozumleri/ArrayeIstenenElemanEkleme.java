package soruCozumleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayeIstenenElemanEkleme {

    public static void main(String[] args) {
        // Verilen bir array'e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array'e yeni degeri atayin


        int[] arr = {2,4,4,6,6,8,10,6,8,10};


        arr=arrayeElementEklme(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static int [] arrayeElementEklme(int[] arr){
        List<Integer> sayilar=new ArrayList<>();

        int istenenEleman=100;

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);

        }

        sayilar.add(istenenEleman);

        int []arr1=new int[sayilar.size()];

        for (int i = 0; i <sayilar.size() ; i++) {

            arr1[i]=sayilar.get(i);

            arr=arr1;

        }
        return arr;

    }
}
