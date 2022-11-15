package farkliKonulardaSoruCozumu1;

import java.util.ArrayList;
import java.util.List;

public class ArraydekiElemanlariSagaKaydirma { public static void main(String[] args) {

    //Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
    //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
    //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

    int[] arr = {2, 4, 6, 8, 10};

    List<Integer> sayilar= new ArrayList<>();

    for (int i = 0; i <arr.length ; i++) {

        sayilar.add(arr[i]);

    }

    int bosKova=sayilar.get(sayilar.size()-1);


    for (int i = sayilar.size()-2; i >=0 ; i--) {

        sayilar.set(i+1,sayilar.get(i));



    }


    sayilar.set(0,bosKova);


    System.out.println(sayilar);


}

}
