package farkliKonulardaSoruCozumu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q23 {
    /*
     * Kullanıcıdan bir sayı isteyin, input olan array de bu sayiyi silip diğer
     * array elemanlarını baska bir listeye atayan ve bu listeyi console yazdıran bir method yazın
     *
     * Input :{1,2,3,4,5,6}
     *
     * element:6
     *
     * Output : [1,2,3,4,5]
     */

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir rakam giriniz");
        int silinecekEleman= scan.nextInt();

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]!=silinecekEleman){
                sayilar.add(arr[i]);

            }

        }
        System.out.println(sayilar);

    }





}
