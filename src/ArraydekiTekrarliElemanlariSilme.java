import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydekiTekrarliElemanlariSilme { public static void main(String[] args) {

    //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
    //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

    int[] arr = {2,4,6,6,6,8,8,0,10};
    arr=(tekrarElementleriSilme(arr));

    System.out.println(Arrays.toString(arr));//[2, 4, 6, 8, 0, 10]
}

    public static int[] tekrarElementleriSilme (int []arr){


        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if(!sayilar.contains(arr[i]))
                sayilar.add(arr[i]);


        }


        arr=new int[sayilar.size()];

        for (int i = 0; i <sayilar.size() ; i++) {

            arr[i]=sayilar.get(i);

        }

        return arr;


    }
}
