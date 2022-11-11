package soruCozumleri;

import java.util.Arrays;

public class CiftKatliArrayAyniIndexleriToplama {
    public static void main(String[] args) {

    //Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
    //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
    //input : int[][] arr = {{3,4,5}, {2,3,6,7}};
    //output: [5, 7, 11]

        int[] [] arr={{4,3,1},{1,2}};



        int toplam=0;

        int ortakIndexSayisi= Math.min(arr[0].length, arr[1].length);

        int [] arrTekKatli= new int[ortakIndexSayisi];

        for (int i = 0; i <arr.length ; i++) {

            arrTekKatli[i]=arr[0][i]+arr[1][i];

        }


        System.out.println(Arrays.toString(arrTekKatli));




    }
}
