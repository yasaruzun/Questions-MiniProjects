package farkliKonulardaSoruCozumu2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q34 {
     /*
        Bir tamsayı dizisinde tüm sıfırları sona koyan bir program create ediniz.
        input : {3, 0, 4, 2, 0}
        output: {3, 4, 2, 0, 0}
         */

    public static void main(String[] args) {

        int[] sayi = {-1, 0, 4, 2, 0};
        int[] sayi1 = new int[sayi.length];
        int index = 0;
        for (int i = 0; i < sayi.length; i++) {

            if (sayi[i] != 0) {
                sayi1[index] = sayi[i];
                index++;
            }

        }

        System.out.println(Arrays.toString(sayi1));

    }

}

