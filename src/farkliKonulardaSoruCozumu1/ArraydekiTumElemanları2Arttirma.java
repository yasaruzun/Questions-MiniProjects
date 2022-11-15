package farkliKonulardaSoruCozumu1;

import java.util.Arrays;

public class ArraydekiTumElemanları2Arttirma {
    public static void main(String[] args) {

    //Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    //olusturun. Eski array’i yeni haliyle kaydedin.


        int[] arr = {2, 4, 6, 8, 10};
        arr=tumElemanlari2Arttir(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int [] tumElemanlari2Arttir (int[] arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2;


        }
        return arr;
    }
}

