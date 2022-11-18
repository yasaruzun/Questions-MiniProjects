package farkliKonulardaSoruCozumu2;

import java.util.ArrayList;
import java.util.List;

public class Q28 {
      /*

    * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
    * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
    * ardışık array elemanların toplamını hesaplayan bir method create ediniz,
     */

    public static void main(String[] args) {

        int [] arr= { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);

        }


    }
}
