package farkliKonulardaSoruCozumu2;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {

    //Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
    //konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
    //Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("İlk string ismi giriniz");
        String isim1 = scan.nextLine().toLowerCase();

        System.out.println("İkinci string ismi giriniz");
        String isim2 = scan.nextLine().toLowerCase();

        String[]arr1 = new String[isim1.length()];
        arr1=isim1.split("");

        Arrays.sort(arr1);

        String[]arr2 = new String[isim2.length()];

        arr2=isim2.split("");

        Arrays.sort(arr2);

        if (arr1.length==arr2.length && Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Anagram degil");
        }


    }
}
